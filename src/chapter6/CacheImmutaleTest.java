package chapter6;

/**
 * @author Crossing
 * @date 2019-02-28
 * @return 不可变类缓存测试
 */
public class CacheImmutaleTest {
    public static void main(String[] args) {
        CacheImmutale c1 = CacheImmutale.valueOf("hello");
        CacheImmutale c2 = CacheImmutale.valueOf("hello");
        System.out.println(c1.equals(c2));
    }
}


class CacheImmutale{
    private static int MAX_SIZE = 10;

    private static CacheImmutale[] cache = new CacheImmutale[MAX_SIZE];
    private static int pos = 0;
    private final String name;
    public CacheImmutale(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * 用一个数组作为不可变类的一个缓存，在缓存中存在就直接返回
     * 否则存入数组
     * 数组已满，反复从头遍历更新
     * @param name
     * @return
     */
    public static CacheImmutale valueOf(String name){
        //数据存在数组中
        for(int i=0 ; i<MAX_SIZE ; i++){
            if(cache[i] != null && cache[i].getName().equals(name)){
                return cache[i];
            }
        }

        //数组不在数组中时
        if(pos == MAX_SIZE){
            cache[0] = new CacheImmutale(name);
            pos = 1;
        }else{
            cache[pos++] = new CacheImmutale(name);
        }
        return cache[pos - 1];
    }


    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        if(obj != null && obj.getClass() == CacheImmutale.class){
            CacheImmutale cacheImmutale = (CacheImmutale) obj;
            return name.equals(cacheImmutale.getName());
        }
        return false;
    }

    @Override
    public int hashCode(){
        return name.hashCode();
    }
}
