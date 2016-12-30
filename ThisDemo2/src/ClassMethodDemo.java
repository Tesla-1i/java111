/**
 * Created by asus on 2016/12/30.
 */
public class ClassMethodDemo {
    String name;
    static  int age = 10;
    static String major = "Math";
    public void print(){
        System.out.println("name : "+name +", age = "+ age);
    }

    public void printMajor(){
        this.age = 16;
        print();
        System.out.println("major:"+major);
    }
    ClassMethodDemo(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        ClassMethodDemo classMethodDemo=new ClassMethodDemo("ZhangYang",18);
        classMethodDemo.age =20;
        classMethodDemo.print();
        classMethodDemo.printMajor();
    }
}
