package main.java.File_IO_test;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.Reader;
import java.io.Writer;

/**
 * 字符输入流：FileReader类，继承于Reader抽象类
 * 作用：一次读取一个字符
 * 构造器
 * FileReader（File file）:创建字符输入流管道
 * FileReader（String pathName）创建字符输入流管道
 * 方法
 * read()：每次读取一个字符的编号返回，如果字符已经没有可读的返回-1
 * read(char[] buffer)：每次读取一个字符数组，返回读取的字符的个数，如果字符已经没有可读的返回-1
 * 字符流好处
 * 代码和文件的编码一致的情况下，中文不乱吗
 * 字符流缺点
 * 一次读取一个字符，性能较慢
 *
 * 字符输出流：FileWriter类，继承于Writer抽象类
 * 作用：以字符形式向文件中写入内容
 * 构造器
 * FileWriter(File file)：创建字符输出流管道，每次写数据，会清空上一次的内容
 * FileWriter(File file,boolean append)：创建字符输出流管道，不会清空上一次内容，而是向后追加
 * FileWriter(String filepath)：创建字符输出流管道，每次写数据，会清空上一次的内容
 * FileWriter(String filepath,boolean append)：创建字符输出流管道，不会清空上一次内容，而是向后追加
 * 方法
 * write(int c)：写一个字符
 * write(char[] cbuf)：写入一个字符数组
 * write(char[] cbuf，int off，int len)：写入字符数组的一部分
 * write(String str)：写入一个字符串
 * Write(String str，int off，int len)：写入字符数组的一部分
 */

public class FileReaderDemo {
    public static void main(String[] args){
        try(
                //创建字符输入流对象
            Reader rd = new FileReader("src/main/java/File_IO_test/test.txt");
//            Writer wi = new FileWriter("src/main/java/File_IO_test/test.txt");//覆盖管道
            Writer wi = new FileWriter("src/main/java/File_IO_test/test.txt",true);//追加管道
            )
        {
            //读取数据，一次读取一个字符
//            int code;
//            while ((code = rd.read()) != -1){
//                System.out.print((char) code);
//            }
            // 一次读取一个字符数组的数据
            char [] cr = new char[1024];
            int len;
            while ((len = rd.read(cr)) != -1){
                System.out.println("读取了：" + len );
                String str = new String(cr,0,len);//解码
                System.out.print(str);
            }

            //写入,一次写入一个字符
            wi.write(99);
            wi.write('a');
            wi.write('阿');
            wi.write("\r\n");
            //一次写入一个字符数组
            char [] cArr = {'a','中','1'};
            wi.write(cArr);
            wi.write("\r\n");
            //一次写入一个字符串
            wi.write("中国123a");
            wi.write("\r\n");
            //一次写入字符数组中的部分字符
            wi.write(cArr,0,2);
            wi.write("\r\n");
            //一次写入字符串的部分数据
            wi.write("中国人123",0,3);
            wi.write("\r\n");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
