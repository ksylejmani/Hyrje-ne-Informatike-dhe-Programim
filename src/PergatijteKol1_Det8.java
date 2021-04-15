
import java.util.Scanner;


public class PergatijteKol1_Det8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lexo=new Scanner(System.in);
        System.out.println("Shtyp vleren e n :" );
        int n=lexo.nextInt();
        int i=2;

        int p=1;
        do {
                p=p*(3*i-1);
                i++;
        }
        while(i<=n);
  
        int Shuma=2+p;
        System.out.println(Shuma);
    }
    
    
}
