package chapter10.exception;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Try...Catch测试
 * @author Crossing
 * @date 2019-03-17
 *
 *
 * try...catch:异常处理的第二种方式,自己处理异常
 *     格式:
 *         try{
 *             可能产生异常的代码
 *         }catch(定义一个异常的变量,用来接收try中抛出的异常对象){
 *             异常的处理逻辑,异常异常对象之后,怎么处理异常对象
 *             一般在工作中,会把异常的信息记录到一个日志中
 *         }
 *         ...
 *         catch(异常类名 变量名){
 *
 *         }
 *     注意:
 *         1.try中可能会抛出多个异常对象,那么就可以使用多个catch来处理这些异常对象
 *         2.如果try中产生了异常,那么就会执行catch中的异常处理逻辑,执行完毕catch中的处理逻辑,继续执行try...catch之后的代码
 *           如果try中没有产生异常,那么就不会执行catch中异常的处理逻辑,执行完try中的代码,继续执行try...catch之后的代码
 */
public class TryCatchTest {

    public static void readFile(String fileName)throws FileNotFoundException {
        if(!"123".equals(fileName)){
            throw new FileNotFoundException("发现的文件不是所要的文件名");
        }
    }
    public static void main(String[] args) {
        try {
            readFile("223");
        }catch (FileNotFoundException e){
            //try...catch中如果有控制台输出，这它的优先级是要高于方法中的控制台输出的
            //即方法将异常抛给main方法时，就将异常的处理权限给了main方法，这是catch中输出什么，控制台就输出什么
            //catch中的e，就是在方法中出错时新建的对象
            System.out.println(e.getMessage());     //发现的文件不是所要的文件名
            System.out.println(e.toString());       //java.io.FileNotFoundException: 发现的文件不是所要的文件名

            e.printStackTrace();        //答应的是异常对象中的全部信息
            //System.out.println();
        }

        System.out.println("后续代码");

    }
}
