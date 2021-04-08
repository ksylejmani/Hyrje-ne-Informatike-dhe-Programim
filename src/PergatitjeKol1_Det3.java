import java.util.Scanner;
import java.math.*;
public class PergatitjeKol1_Det3 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        
        System.out.print("Sheno x dhe y: ");
        int x=s.nextInt();
        int y=s.nextInt();
        
        double z=3*(Math.pow(x, 2*y)-5*y)+
                /* Math.exp(x+y) */ 
                Math.pow(Math.E, x+y);
        
        System.out.println("z="+z);
    }
    
}
