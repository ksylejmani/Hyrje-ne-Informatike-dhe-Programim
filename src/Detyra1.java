import java.util.Scanner;
//import java.math.*;
public class  Detyra1 { 

    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      System.out.print("Jepni vleren e x: ");
      int x= s.nextInt();
      double y = Math.exp(2*x)+Math.sqrt((x+1)/(x+2.0));
      System.out.println("Vlera e y permes x eshte kjo:"+ y);           
    }
    
}
