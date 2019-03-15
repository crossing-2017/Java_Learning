package chapter8._3;

import java.util.HashSet;

/**
 * 关于HashSet的测试
 * @author Crossing
 * @date 2019-03-13
 * @return [chapter8._3.A@61bbe9ba, chapter8._3.B@1, chapter8._3.B@1, chapter8._3.A@610455d6, chapter8._3.C@2]
 * hashSet中存入的数据的hashCode,所以class B返回的都是1
 */
public class HashSetTest {
    public static void main(String[] args) {

        HashSet hashSet = new HashSet();
        hashSet.add(new A());
        hashSet.add(new A());
        hashSet.add(new B());
        hashSet.add(new B());
        hashSet.add(new C());
        hashSet.add(new C());
        String s = "重地";
        String s1 = "通话";
        System.out.println(s.hashCode());
        System.out.println(s1.hashCode());



        System.out.println(hashSet);
    }
}

class A{
    @Override
    public boolean equals(Object obj){
        return true;
    }
}

class B{
    @Override
    public int hashCode(){
        return 1;
    }
}

class C{

    @Override
    public boolean equals(Object obj){
        return true;
    }

    @Override
    public int hashCode(){
        return 2;
    }
}

