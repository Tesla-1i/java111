/**
 * Created by asus on 2017/3/4.
 */

interface in{
    public String getName();
    public int getAge();
}
public class AnonymouseNestedClassDemo {
    public void test(in i){
        System.out.println("�ҵ������� "+i.getName()+", �ҵ������� "+i.getAge());
    }

    public static void main(String[] args) {
        AnonymouseNestedClassDemo anc = new AnonymouseNestedClassDemo();
        anc.test(new in(){
            public String getName(){
                return "zhangshan";
            }
            public int getAge(){
                return 18;
            }
        });
    }

}
