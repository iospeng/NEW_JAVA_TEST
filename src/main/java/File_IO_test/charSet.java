package main.java.File_IO_test;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * 字符集
 * 编码解码
 * 注：解码前后使用的字符集必须一致
 * String编码
 * getBytes()方法：使用平台默认字符集将该String编码为一系列字节，将结果存储到新的字节数组中
 * getBytes(String charsetName)方法： 使用指定字符集将该String编码为一系列字节，将结果存储到新的字节数组中
 * String解码
 * String（byte[] bytes）构造器：通过使用平台的默认字符集解码指定的字节数组来构造新的String
 * String(byte[] bytes,String charsetName)构造器：通过指定的字符集解码指定的字节数组来够着新的String
 *
 * 文件字节输入流：FileInputStream类，继承于InputStream抽象类
 *
 */

public class charSet {
    public static void main(String[] args) throws Exception {
        String str = "abc我爱中国";
        //编码
        byte[] strByte = str.getBytes(); //不指定字符集，使用默认字符集编码
//        byte[] strByte = str.getBytes("GBK"); //使用指定字符集编码
        System.out.println(strByte.length);
        System.out.println(Arrays.toString(strByte));

        //解码
        String end = new String(strByte); //不指定字符集，使用默认字符集解码
//        String end = new String(strByte,"GBK"); //使用指定字符集解码
        System.out.println(end);


        //创建FileInputStream输入流
        File file = new File("src/main/java/File_IO_test/test.txt");
//        InputStream ins = new FileInputStream("src/main/java/File_IO_test/test.txt");
        InputStream ins = new FileInputStream(file);
        // read() 一次读取一个字节
//        while (ins.read() != -1) {
//            int newIns = ins.read();
//            System.out.println(newIns + "\t" + (char)newIns);
//        }
        // read(byte[] byte) 一次读取多个字节
        //定义字节数组用于存储读取的数据
//        byte [] bytes = new byte[3];
//        int newIns ;
//        while ((newIns = ins.read(bytes)) != -1){
//            System.out.print(new String(bytes,0,newIns));
//        }
        // 定义一个与文件一样大的字节数组，一次性全部读取，解决中文乱码问题
        // 使用File类对象，获取文件大小,强转成int类型，纯在内存溢出风险，不建议使用
//        byte [] bytes = new byte[(int) file.length()];
//        int len = ins.read(bytes);
//        System.out.println("读取了多少字节：" + len);
//        System.out.println("文件大小：" + file.length());
//        System.out.println(new String(bytes));

        // 使用官方api读取所有字节数组 jdk9之后才支持
//        byte [] bytes = ins.readAllBytes();
//        System.out.println(new String(bytes));



    }
}
