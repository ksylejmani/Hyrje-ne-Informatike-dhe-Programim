import java.util.Scanner;
public class ShumaFaktorieli {

public static void main(String[] args) {
		
	System.out.print("Shtyp a:");
	Scanner lexo=new Scanner(System.in);
	int a=lexo.nextInt();
	double z=faktorieli(3)/
                shuma(2,a-1,1,0)+
                faktorieli(a+2)-
                  3*shuma(2,a+1,2,-1)+
                shuma(1,a,1/3.0,1);
	System.out.println("z="+z);
	}

	static double shuma(int m,int n,double p,int q) {
		double s=0;
		int i=m;
		do {
                    s=s+(p*i+q);
		    i=i+1;
		}
		while (i<=n);
		return s;
	}
	static int faktorieli(int d) {
		int f=1;
		int i=1;
		do {
                    f=f*i;
		    i=i+1;
		}
		while(i<=d);
		return f;
	}

    
}
