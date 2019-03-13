package chapter8._3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

/**
 * 对hashSet类的经一步研究
 * @author Crossing
 * @date 2019-03-13
 * @return [R{count=5}, R{count=9}, R{count=12}, R{count=-3}]
 *         [R{count=-3}, R{count=9}, R{count=12}, R{count=-3}]
 *         [R{count=-3}, R{count=9}, R{count=12}]
 *         false
 *         false
 *         true
 */
public class HashSetTest2 {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        hashSet.add(new R(5));
        hashSet.add(new R(-3));
        hashSet.add(new R(9));
        hashSet.add(new R(12));
        System.out.println(hashSet);

        Iterator iterator = hashSet.iterator();
        R first = (R) iterator.next();
        first.count = -3;
        System.out.println(hashSet);

        hashSet.remove(new R(-3));
        System.out.println(hashSet);
        System.out.println(hashSet.contains(new R(-3)));
        System.out.println(hashSet.contains(new R(5)));
        System.out.println(hashSet.contains(new R(12)));
    }
}


class R{
    int count;

    public R(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "R{" +
                "count=" + count +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;}
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        R r = (R) o;
        return count == r.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}
