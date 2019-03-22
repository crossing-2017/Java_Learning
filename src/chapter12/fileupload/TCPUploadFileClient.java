package chapter12.fileupload;

import java.io.*;
import java.net.Socket;

/**
 * 用TCP协议测试从客户端向服务器端传输照片客户端测试
 * @author Crossing
 * @date 2019-03-22
 */
public class TCPUploadFileClient {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("src/chapter12/fileupload/1.jpg"));
        Socket socket = new Socket("127.0.0.1", 12);

        OutputStream os = socket.getOutputStream();

        byte[] bytes = new byte[1024];

        int len;
        while ((len = bis.read(bytes)) != -1){
            os.write(bytes, 0, len);
        }

        /**
         * 解决:上传完文件,给服务器写一个结束标记
         *      void shutdownOutput() 禁用此套接字的输出流。
         *      对于 TCP 套接字，任何以前写入的数据都将被发送，并且后跟 TCP 的正常连接终止序列。
         */
        socket.shutdownOutput();

        InputStream is = socket.getInputStream();
        byte[] bytes1 = new byte[1024];

        len = is.read(bytes1);
        System.out.println(new String(bytes1, 0, len));

        is.close();
        socket.close();

    }
}
