package main.java.File_IO_test;

import java.io.File;

/**
 * 非规律化递归，遍历本地磁盘，找到文件
 */

public class fileRecursionDemo {
    public static void main(String[] args) {
        //2.调用递归方法
        searshFile(new File("E:/"),"JAVA_TEST.iml");
    }
    //1.定义递归方法
    public static void searshFile(File file,String FileName){
        //3.判断文件是否是目录
        if (file != null && file.isDirectory()){
            //4.提取当前目录下的一级文件对象
            File[] files = file.listFiles();
            //5.判断是否存在一级文件对象，存在才可以遍历
            if (files != null && files.length > 0){
                for (File file1 : files) {
                    //6.判断当前遍历的一级文件对象是目录还是文件
                    if (file1.isFile()){
                        //7.如果是文件判断是不是我们要找的文件
                        if (file1.getName().contains(FileName)){
                            //如果是则输出改文件的绝对路径
                            System.out.printf("找到了： " + file1.getAbsolutePath());
                        }
                    }else {
                        //8.如果不是文件，则继续调用递归方法,继续去查找
                        searshFile(file1,FileName);
                    }
                }
            }
        }else {
            System.out.println("当前搜索的位置不是目录");
        }
    }
}
