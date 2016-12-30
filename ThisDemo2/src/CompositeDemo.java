/**
 * Created by asus on 2016/12/30.
 */

class Bird{


    private void sing(){
        System.out.println("It can sing");
    }
    public void breath(){
        System.out.println("It can breath");
    }

}

class Swallow{
    private Bird b;
    public Swallow(Bird b){
        this.b = b;
    }
    public void breath(){
        b.breath();
    }
    public void fly(){
        System.out.println("It can fly");
    }
}

public class CompositeDemo {
    public static void main(String[] args) {
        Swallow s=new Swallow(new Bird());
        s.breath();
        s.fly();
        //s,sing;

    }

}
