package main.java.File_IO_test;

import java.io.*;

/**
 * 字节流拷贝，可以拷贝一切文件
 * 先读取，在写入
 */

public class FileCopyDemo {
    public static void main(String[] args) {
//        InputStream is = null;
//        OutputStream os = null;
//        try {
//            //创建输入流，读取数据
//            is = new FileInputStream("D:\\Download\\TGP\\tpf_ui\\res\\dl\\tgp\\bt\\449.jpg");
//            //创建输出流，写入数据
//            os = new FileOutputStream("F:\\img\\1.jpg");
//
//            //创建字节数组转移文件
//            byte [] bytes = new byte[1024];
//            //记录每次读取的字节数，避免最后一次读取不够1024字节的情况
//            int len;
//            while ((len = is.read(bytes)) != -1){
//                //写入数据
//                os.write(bytes,0,len);
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }finally {
//            //关闭流，从内到外关闭
//            try {
//                if (os != null) os.close(); //关闭之前，必须做非空判断
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            try {
//                if (is != null) is.close();//关闭之前，必须做非空判断
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
        // jdk7之后的支援释放方式，支援自动释放
        try (
               //这里只能放置资源对象，用完会自动关闭，自动调用资源对象的close方法释放资源（即使出现异常，也会关闭）
                //创建输入流，读取数据
             InputStream is = new FileInputStream("D:\\Download\\TGP\\tpf_ui\\res\\dl\\tgp\\bt\\449.jpg");
             //创建输出流，写入数据
             OutputStream os = new FileOutputStream("F:\\img\\1.jpg");)
        {
            //创建字节数组转移文件
            byte [] bytes = new byte[1024];
            //记录每次读取的字节数，避免最后一次读取不够1024字节的情况
            int len;
            while ((len = is.read(bytes)) != -1){
                //写入数据
                os.write(bytes,0,len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
