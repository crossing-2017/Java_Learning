package chapter12.fileupload;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 用TCP协议测试从客户端向服务器端传输照片服务器端测试
 * @author Crossing
 * @date 2019-03-22
 */
public class TCPUploadFileServer {

    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(12);
        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        BufferedOutputStream bus = new BufferedOutputStream(new FileOutputStream("src/chapter12/fileupload/2.jpg"));

        byte[] bytes = new byte[1024];
        int len;
        while ((len= is.read(bytes)) != -1){
            bus.write(bytes, 0, len);
        }


        socket.getOutputStream().write("上传成功".getBytes());
        bus.close();
        socket.close();
        ss.close();

    }
}
