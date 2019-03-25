package chapter12.bstcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 穿件TCP服务器，可以让别人在浏览器上访问
 * @author Crossing
 * @date 2019-03-34
 */
public class TcpServer {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(8080);

        Socket socket = ss.accept();

        InputStream is = socket.getInputStream();

        /*byte[] bytes = new byte[1024];

        int len ;

        while ((len = is.read(bytes)) != -1){
            System.out.println(new String(bytes, 0, len));
        }*/

        BufferedReader br = new BufferedReader(new InputStreamReader(is));

        String s = br.readLine();

        String[] split = s.split(" ");

        String substring = split[1].substring(1);

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(substring));

        byte[] bytes = new byte[1024];

        OutputStream os = socket.getOutputStream();

        os.write("HTTP/1.1 200 OK\n".getBytes());
        os.write("Content-Type:text/html\n".getBytes());
        // 必须要写入空行,否则浏览器不解析
        os.write("\n".getBytes());

        int len;

        while ((len = bis.read(bytes)) != -1){
            os.write(bytes, 0, len);
        }

        bis.close();

        socket.close();

        ss.close();

    }
}
