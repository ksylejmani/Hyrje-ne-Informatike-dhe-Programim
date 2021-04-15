import java.util.Scanner;
public class PergatijteKol1_Det7 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Cakto n: ");//n=5
        int n=sc.nextInt();
        int s=0;
        int i=1;
        while(i<=n){
            s=s+i; // ose s+=i;
            i=i+2; // ose i+=2
            System.out.println(i);
            
        }
        System.out.println("s="+s);
        
    }
    
}
