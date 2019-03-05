package chapter6;

/**
 * 男女性别枚举
 * @author Crossing
 * @date 2019-03-05
 */
public enum  Gender {
    MALE("男"), FEMALE("女");
    public String name;

    Gender(String name){
        this.name = name;
    }

    public void setName(String name){
        switch (this){
            case MALE:
                if(name.equals("男")){
                    this.name = name;
                }else {
                    System.out.println("参数错误");
                    return;
                }
                break;
            case FEMALE:
                if(name.equals("女")){
                this.name = name;
            }else {
                System.out.println("参数错误");
                return;
            }
            break;
        }
    }
    public String getName(){
        return name;
    }
}
