package Enum_Learning;

public enum Constants {
    Constants_A("我是constantsA"),
    Constants_B(3);

    //成员属性
    String str;
    int i=1;

    //构造方法
    Constants(String str){
        this.str=str;
    }

    Constants(int i){
        this.i=i;
    }

    //成员方法
    public String getstr(){
        return str;
    }

    public int getnum(){
        return i;
    }
}
