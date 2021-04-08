
import java.util.Scanner;


public class VleratABC {

    public static void main(String[] args) {
        int x,y;
        double A,B,C;
        Scanner s=new Scanner(System.in);
        System.out.print("Cakto x: ");
        x=s.nextInt();
        System.out.print("Cakto y: ");
        y=s.nextInt();
        A=x-((double)y/3)+(1.0/(x+y));
        B=Math.pow(x+y, x-y);
        C=1/Math.exp(x*y)+A+B;
        System.out.println("A="+A);
        System.out.println("B="+B);
        System.out.println("C="+C);
    }
    
}
