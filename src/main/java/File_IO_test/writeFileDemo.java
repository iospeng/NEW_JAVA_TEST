package main.java.File_IO_test;

import java.io.FileOutputStream;
import java.io.OutputStream;

/**
 *
 *文件字节输出流：FileOutPutStream，继承于OutputStream抽象类
 * 作用：向文件中写数据，已内存为基准，把内存中的数据以字节的形式写入到文件
 * 构造器
 * public  FileOutPutStream（File file）：创建一个字节输出流管道，会清空上一次写入的内容
 * public  FileOutPutStream（String pathName）：创建一个字节输出流管道，会清空上一次写入的内容
 * public  FileOutPutStream（File file， boolean append）:创建一个追加数据的字节输出流管道
 * public  FileOutPutStream（String pathName， boolean append）：创建一个追加数据的字节输出流管道
 * 方法
 * 写数据：
 * write（int a）:写一个字节
 * write(byte[] buffer)：写一个字节数组
 * write(byte[] buffer , int pos , int len)：写一个字节数组的一部分
 * flush()：刷新流，还可以继续写数据，每次写数据，必须刷新
 * close()：关闭流，释放资源，但是在关闭之前会先自动刷新流，一旦关闭，就不能再写数据
 */

public class writeFileDemo {
    public static void main(String[] args) throws Exception {
        //创建字节流管道
//        OutputStream ops = new FileOutputStream("src/main/java/File_IO_test/outPutFile.txt");
        OutputStream ops = new FileOutputStream("src/main/java/File_IO_test/outPutFile.txt",true);

        // 1.write（int a）:写一个字节 ,不能使用该方法写中文，一个中文字符三个字节，该方法一次只能写入一个字节，导致乱码
        ops.write(99);
        ops.write('o');
        ops.write("\t\n".getBytes()); //各个系统通用的换行符

        //2.write(byte[] buffer)：写一个字节数组,使用该方法写入中文时，需先把中文字符，编码成字节流，然后再写入字节流
        byte [] bytes = {'a',95,'d','s'};
        ops.write(bytes);
        byte [] bytes1 = "中国".getBytes();
        ops.write(bytes1);
        ops.write("\t\n".getBytes());

        //3.write(byte[] buffer , int pos , int len)：写一个字节数组的一部分
        ops.write(bytes,0,2);
        ops.write("\t\n".getBytes());

        //刷新流
//        ops.flush();
        //关闭流
        ops.close();

    }
}
