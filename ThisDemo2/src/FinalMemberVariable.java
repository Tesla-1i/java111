/**
 * Created by asus on 2016/12/30.
 */
public class FinalMemberVariable {
    final int i = 2;
    final String s;
    final static double d;
    final Integer ref;
    static {
        d = 3.14;
    }
    public FinalMemberVariable(String s){
        this.s = s;
        ref = new Integer(100);
    }

    public static void main(String[] args) {
        FinalMemberVariable fmv = new FinalMemberVariable("Hello Java");
        System.out.println("ref= "+fmv.ref+"  i= "+fmv.i+" s= "+fmv.s+"  d = "+fmv.s);
    }
}
