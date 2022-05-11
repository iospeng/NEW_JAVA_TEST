package main.java.File_IO_test;

import java.io.File;
import java.io.IOException;

/**
 * isDirectory():判断File对象是否是文件夹
 * isFile():判断File对象是否是文件
 * exists():判断File对象定位的文件是否存在
 * getAbsolutePath():返回文件的绝对路径名字的字符串
 * getPath():返回文件的相对路径名字的字符串
 * getName():返回File对象指向的文件或文件夹的名称
 * lastModified():返回File对象指向的文件或者文件夹最后修改时间的毫秒值
 * length():返回File对象指向的文件的字节大小
 * createNewFile():创建一个新的空的文件
 * mkdir():创建一级文件夹
 * mkdir():创建多级文件夹
 * delete():删除文件或空文件夹
 *      delete方法直接删除不走回收站，如果删除的是一个文件，且就算文件被占用也直接删除
 *      delete方法默认只能删除空文件夹
 * list():获取当前目录下所有的一级文件名称到一个字符串数组中并返回
 * listFiles():获取当前目录下所有的一级文件对象到一个文件对象数组中并返回
 *      listFiles()注意事项：
 *      当调用这不存在时，返回null
 *      当调用者是一个文件时，返回null
 *      当调用者是一个空文件夹时，返回一个数组长度为0的空数组
 *      当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
 *      当调用者是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏内容
 *      当调用者是一个需要有权限才能进入的文件夹时，返回null
 */

public class FileDemo {
    public static void main(String[] args) throws IOException {
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

        //isDirectory():判断File对象是否是文件夹
        System.out.println(file.isAbsolute());
        //isFile():判断File对象是否是文件
        System.out.println(file.isFile());
        //getAbsolutePath():返回文件的绝对路径名字的字符串
        System.out.println(file.getAbsolutePath());
        System.out.println(file.getPath());
        //getPath():返回文件的相对路径名字的字符串
        System.out.println(file.getPath());
        System.out.println(file1.getPath());
        //getName():返回File对象指向的文件或文件夹的名称
        System.out.println(file.getName());
        //lastModified():返回File对象指向的文件或者文件夹最后修改时间的毫秒值
        System.out.println(file.lastModified());
        //createNewFile():创建一个新的空的文件
        File newNullFile = new File("src/main/java/File_IO_test/aa.txt");
        System.out.println(newNullFile.createNewFile());
        //mkdir():创建一级文件夹
        File newNullFileOne = new File("src/main/java/File_IO_test/f");
        System.out.println(newNullFileOne.mkdir());
        //mkdir():创建多级文件夹
        File newNullFiles = new File("src/main/java/File_IO_test/fs/a");
        System.out.println(newNullFiles.mkdirs());
        //delete():删除文件或空文件夹
        System.out.println(newNullFile.delete());
        System.out.println(newNullFileOne.delete());
        System.out.println(newNullFiles.delete());
        //list():获取当前目录下所有的一级文件名称到一个字符串数组中并返回
        File fileTest = new File("F:\\学习\\test");
        for (String s : fileTest.list()) {
            System.out.println(s.toString());
        }
        //listFiles():获取当前目录下所有的一级文件对象到一个文件对象数组中并返回
        for (File listFile : fileTest.listFiles()) {
            System.out.println(listFile);
        }



    }
}
