/**
 * Created by asus on 2016/12/28.
 */
public class ThisDemo2 {
    String name;
    int age;

    public void print(String str){
        System.out.println("My name is "+ str);
    }

    public void print(int age){
        System.out.println("My age is" + age);
    }

    //构造方法1
    public ThisDemo2(String name){
        this.name = name;
    }
    //构造方法2
    public ThisDemo2(int age){
        this("ZhangSan");       //调用构造方法1，必须在构造方法2的第一行
        this.age = age;
        this.print(this.name);
        this.print(this.age);
    }

    public static void main(String[] args) {
        ThisDemo2 td1 = new ThisDemo2("Tom");
        td1.print(td1.name);
        td1.print(td1.age);

        ThisDemo2 td2 = new ThisDemo2(18);
    }
}
