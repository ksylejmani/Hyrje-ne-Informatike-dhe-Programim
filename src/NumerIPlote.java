import java.util.Scanner;
public class NumerIPlote {

    public static void main(String[] args) {
        double a=9; int b;
        Scanner S=new Scanner(System.in);
        System.out.print("Sheno nje numer: ");
        a=S.nextDouble();
        b=(int)a;
        //()?():()
        String s=(a-b==0)?("Numer i plote "):("Numer jo i plote");
        System.out.println(s);  
    }
    
}
