package chapter10.exception;

/**
 * 关于throw关键字的测试
 * @author Crossing
 * @date 2019-03-17
 * 注意:
 *     1.throw关键字必须写在方法的内部
 *     2.throw关键字后边new的对象必须是Exception或者Exception的子类对象
 *     3.throw关键字抛出指定的异常对象,我们就必须处理这个异常对象
 *       throw关键字后边创建的是RuntimeException或者是 RuntimeException的子类对象,我们可以不处理,默认交给JVM处理(打印异常对象,中断程序)
 *       throw关键字后边创建的是编译异常(写代码的时候报错),我们就必须处理这个异常,要么throws,要么try...catch
 */
public class ThrowTest {
    public static int getElement(int[] array, int index){
        if(array == null){
            throw new NullPointerException("数组为空");
        }else {
            return array[index];
        }

    }

    public static void main(String[] args) {
        int[] array = null;
        getElement(array, 0);
    }
}
