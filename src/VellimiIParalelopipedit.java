import java.util.Scanner;
public class VellimiIParalelopipedit {

    public static void main(String[] args) {
        Scanner lexo=new Scanner(System.in);
        short a,b,c;
        int v;
        System.out.print("Cakto a: ");
        a=lexo.nextShort();
        System.out.print("Cakto b: ");
        b=lexo.nextShort();
        System.out.print("Cakto c: ");
        c=lexo.nextShort();
        v=a*b*c;
        System.out.println("Vellimi v="+v);
    }
    
}
