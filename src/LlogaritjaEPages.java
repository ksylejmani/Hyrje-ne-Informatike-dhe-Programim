import java.util.Scanner;
public class LlogaritjaEPages {

    public static void main(String[] args) {
        int od,om,on,llp;
        Scanner lexo=new Scanner(System.in);
        System.out.print("Sa ore diten: ");
        od=lexo.nextInt();//10
        System.out.print("Sa ore mbremje: ");
        om=lexo.nextInt();//15
        System.out.print("Sa ore naten: ");
        on=lexo.nextInt();//15
        System.out.print("Lloji i punetorit: ");
        llp=lexo.nextInt();//2
        int paga;
        switch(llp){
            case 1:
                paga=3*od+4*om+5*on;
                break;
            case 2:
                paga=3*od+4*om+5*on+10;
                break;
            case 3:
                paga=3*od+4*om+5*on+20;
                break;
            default:
                paga=60;
                break;
        }
        System.out.println("Paga="+paga+"€");
    }
    
}
