

import java.util.Scanner;

public class Gota {
    private double sasia;
    private String materiali,prodhuesi;
    public Gota(){
        Scanner S=new Scanner(System.in);
        System.out.print("Cakto sasine: ");
        sasia=S.nextDouble();
        S.nextLine();
        System.out.print("Cakto materialin: ");
        this.materiali=S.nextLine();
        System.out.print("Cakto prodhuesin: ");
        this.prodhuesi=S.nextLine();
    }
    public Gota(double _sasia, String _materiali, String _prodhuesi){
        sasia=_sasia;
        materiali=_materiali;
        prodhuesi=_prodhuesi;
    }
    public String Shifra(){
        String rez;
        if(sasia/10<1){ // ose sasia<=9
            rez="nje shifrore";
        }
        else{
            rez="shume shifrore";
        }
        return rez;
    }
    public String NumerIPlote(){
        String rez;
        int int_sasia=(int)sasia;
        if(sasia-int_sasia==0){
            rez="numer i plote";
        }
        else{
            rez="numer jo i plote";
        }
        return rez;
    }
    public void Shtypja(){
        System.out.println("Gota përbëhet prej materialit "+materiali+
                " dhe është prodhuar nga "+prodhuesi+".");
    }
    
    public static void main(String[] args) {
        Gota G1=new Gota(14.24,"Druri","Dea");
        Gota G2=new Gota();
        
        System.out.println("Shifra: "+G1.Shifra());
        System.out.println("Eshte "+G1.NumerIPlote()+".");
        G1.Shtypja();
        
        System.out.println("Shifra: "+G2.Shifra());
        System.out.println("Eshte "+G2.NumerIPlote()+".");
        G2.Shtypja();

    }
}
