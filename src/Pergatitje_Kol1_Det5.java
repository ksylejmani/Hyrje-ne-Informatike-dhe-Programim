import java.util.Scanner;
public class Pergatitje_Kol1_Det5 {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.print("Cakto x: ");
        int x=s.nextInt();//1
        double y;
        /* if(x>5)
            y=2*x+3;
        else if(x<0)
            y=x/3.0;
        else
            y=5-x;//y=4 */
        
        if(x<0){
            y=x/3;
        }
        else if((x>=0) && (x<=5)) { // &&, ||, !
            y=5-x;
        }
        else {
            y=2*x+3;
        }
        
        System.out.println("y="+y);//y=4
    }
    
}
