/**
 * Created by asus on 2016/12/30.
 */
public class BlockDemo {
    String name;
     static int age;

    static {
        age =18;
        String name = "Eric";
        System.out.println("name:"+ name +", age "+ age);
    }

    public static void main(String[] args) {
        BlockDemo blockDemo = new BlockDemo();
        blockDemo.name = "Tom";
        blockDemo.age = 20 + blockDemo.age;
        System.out.println("name :"+blockDemo.name+", age :"+age);
    }
}
