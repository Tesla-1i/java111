/**
 * Created by asus on 2016/12/28.
 */

class Person2{
    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }
    public void print(){
        System.out.println("name is " + name + ", age is "+ age);
    }
}

public class PersonsPlus {
    public static void main(String[] args) {
        Person2 person2=new Person2();
        person2.setName("Eric");
        person2.setAge(18);
        person2.print();
    }

}
