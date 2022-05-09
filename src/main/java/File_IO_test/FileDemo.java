package main.java.File_IO_test;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //创建绝对路径文件对象
        File file = new File("D:\\Download\\image\\1.jpg");
        //获取文件字节大小，判断是否正确定位到文件
        System.out.println(file.length());

        //创建相对路径文件对象;相对路径相对的是本工程的相对路径，工程以外的路径不可以
        File file1 = new File("src/main/java/File_IO_test/file_IO.txt");
        System.out.println(file1.length());

        //创建文件夹的文件对象
        File file2 = new File("E:\\Git\\java");
        //文件夹没有大小，不能使用length()方法来判断是否正确定位到，需要使用exists()方法来判断文件夹是否存在
        System.out.println(file2.exists());
    }
}
