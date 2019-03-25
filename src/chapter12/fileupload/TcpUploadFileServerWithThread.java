package chapter12.fileupload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 另建一个线程让服务器自己跑
 * @author Crossing
 * @date 2019-03-22
 */
public class TcpUploadFileServerWithThread {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12);
        while (true){
            Socket socket = ss.accept();

            /**
             * 使用多线程技术,提高程序的效率
             * 有一个客户端上传文件,就开启一个线程,完成文件的上传
             */
            new Thread(() -> {
                try {
                    InputStream is = socket.getInputStream();
                    String fileName = System.currentTimeMillis() + ".jpg";
                    BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("src/chapter12/fileupload" + "/" + fileName));
                    byte[] bytes = new byte[1024];
                    int len;
                    while ((len = is.read(bytes)) != -1){
                        bos.write(bytes, 0, len);
                    }

                    OutputStream os = socket.getOutputStream();

                    os.write("照片已经上传完成".getBytes());

                    bos.close();
                    socket.close();


                } catch (IOException e) {
                    e.printStackTrace();
                }



            }).start();
        }
    }
}
