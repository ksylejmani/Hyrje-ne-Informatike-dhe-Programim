
import java.util.Scanner;


public class DetyraMeVargje {

    public static void main(String[] args) {
        int vlerat[]={1,2,2,6,9,3,5,7};
        System.out.println("Shuma: "+shuma(vlerat));
        System.out.println("Numri i vlerave çift: "+numro_cift(vlerat));
        System.out.println("Vlera maksimale: "+vlera_max(vlerat));
        EshtePalindrom(vlerat);
    }
    static int shuma(int v[]){
        int rez=0;
        for(int i=0;i<v.length;i++){
            rez+=v[i];
        }
        return rez;
    }
    static int numro_cift(int v[]){
        int rez=0;
        for(int i=0;i<v.length;i++){
            if(v[i]%2==0)
                rez++;
        }
        return rez;
    }
    static int vlera_max(int v[]){
        int vleraMadhe =v[0];
        for(int i=1; i<v.length; i++) {
            if(v[i] > vleraMadhe) {
                    vleraMadhe = v[i];
            }
        }
        return vleraMadhe;
    }
    static void EshtePalindrom(int v[]){
        for(int i=0;i<v.length/2;i++){
            if(v[i]!=v[v.length-1-i]){
                System.out.println("Vargu nuk eshte palindrom.");
                return;
            }
        }
        System.out.println("Vargu eshte palindrom.");
    }
    public static void main2(String[] args) {
		Scanner h = new Scanner(System.in);
		System.out.print("Sa vlera deshironi ti merrni: ");
		int nr = h.nextInt();
		
		int vargu [] = new int[nr];
		
		System.out.print("Shenoni vlerat: ");
		for(int i=0; i<nr; i++) {
			vargu[i] = h.nextInt();		
		}
		int vleraMadhe =0;
		for(int i=0; i<nr; i++) {
			if(vargu[i] > vleraMadhe) {
				vleraMadhe = vargu[i];
			}
		}
		System.out.println("Vlera me e madhe ne varg eshte: " + vleraMadhe);

	}
    
}
