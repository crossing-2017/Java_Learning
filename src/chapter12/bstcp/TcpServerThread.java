package chapter12.bstcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 制作多线程服务器让浏览器多次请求
 * @author Crossing
 * @date 2019-03-24
 */
public class TcpServerThread {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);

        while (true){
            Socket socket = server.accept();

            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        InputStream is = socket.getInputStream();
                        BufferedReader br = new BufferedReader(new InputStreamReader(is));
                        String s = br.readLine();
                        System.out.println(s);
                        String[] split = s.split(" ");

                        String substring = split[1].substring(1);

                        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(substring));

                        OutputStream os = socket.getOutputStream();

                        os.write("HTTP/1.1 200 OK\n".getBytes());
                        os.write("Content-Type:text/html\n".getBytes());
                        // 必须要写入空行,否则浏览器不解析
                        os.write("\n".getBytes());

                        byte[] bytes = new byte[1024];
                        int len;
                        while ((len = bis.read(bytes)) != -1){
                            os.write(bytes, 0, len);
                        }
                        bis.close();
                        socket.close();
                    }catch (IOException e){
                        e.printStackTrace();
                    }

                }
            }).start();

        }
    }
}
