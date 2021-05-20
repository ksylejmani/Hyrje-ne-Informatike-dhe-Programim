
import java.util.Scanner;

public class Teksti {
    private String teksti1, teksti2;
    private int numri;
    Teksti(){
        teksti1="Ilire Dardani";// I. D. 
        teksti2="Kurr mos thuaj kurr";
        numri=10;
    }
    Teksti(boolean nga_tastiera){
        Scanner s=new Scanner(System.in);
        System.out.print("Cakto tekstin 1: ");
        teksti1=s.nextLine();
        System.out.print("Cakto tekstin 2: ");
        teksti2=s.nextLine();
        System.out.print("Cakto numrin: ");
        numri=s.nextInt();
    }

    public String getTeksti1() {
        return teksti1;
    }

    public String getTeksti2() {
        return teksti2;
    }

    public int getNumri() {
        return numri;
    }
    
    String bashko(){
        String rez;
        rez=teksti1+" "+numri+" "+teksti2;
        return rez;
    }
    void shtyp_tekstet(){
        for(int i=1;i<=numri;i++){
            if(i%2!=0){
                System.out.println(teksti1);
            }
            else{
                System.out.println(teksti2);
            }
        }
    }
    int numro_hapesirat(String txt){
        int k=0;
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)==' '){
                k++;
            }
        }
        return k;
    }
    int gjeje_hapesiren(String txt){
        int k=-1;
        for(int i=0;i<txt.length();i++){
            if(txt.charAt(i)==' '){
                k=i;
                break;
            }
        }
        return k;
    }
    void shtyp_inicialet(String emri){
        String s=emri.charAt(0)+". "+emri.charAt(1+gjeje_hapesiren(emri))+".";
        System.out.println(s);
    }
    public static void main(String[] args) {
        Teksti t=new Teksti();
        //System.out.println(t.bashko());
        //t.shtyp_tekstet();
        System.out.println("Numri i hapesirave eshte "+
                t.numro_hapesirat(t.getTeksti1()));
        t.shtyp_inicialet("Mimoza Limani");
    }
    
}
