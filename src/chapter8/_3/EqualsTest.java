package chapter8._3;

import java.util.Objects;

public class EqualsTest {

    public static void main(String[] args) {
        E e = new E("1");

        String count = "1";
        boolean equals = count.equals(e.count);
        System.out.println();
    }
}


class E{
    String count;

    public E(String count) {
        this.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        E e = (E) o;
        return count == e.count;
    }

    @Override
    public int hashCode() {
        return Objects.hash(count);
    }
}