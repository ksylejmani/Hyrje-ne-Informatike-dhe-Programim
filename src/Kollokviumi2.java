
public class Kollokviumi2 {
    int llogarit(int x){
        int rez;
        if(x==1){
            rez=2;
        }
        else{
            rez=x-2;
        }
        return rez;
    }
    int alfa(int a, int x) {// a=3, x=-1
        int b = a - x; // b=4
        return b * 2+x; //7
    }
    int beta(int b) {// b=7
        int a = (b == 1) ? (b - 5) : (b - 1); //a=6
    return a * b; //42
    }  
    double mesatarja(int a, int b){
        double mes=(a+b)/2.0;
        return mes;
    }
    double mesatarja(int a, int b, int c){
        double mes=(a+b+c)/3.0;
        return mes;
    }
    double faktorieli(int m){
        double f=1;
        for(int i=1;i<=m;i++){
            f=f*i;
        }
        return f;
    }
    double funksioni_y(int a){
        double y=faktorieli(a+2)+faktorieli(a-1)+5;
        return y;
    }
    public static void main(String[] args) {
        Kollokviumi2 k2=new Kollokviumi2();
        System.out.println("Rezultati 1: "+k2.llogarit(3));
        System.out.println("Rezultati 2: "+k2.beta(k2.alfa(3,-1)));
        System.out.println("Mesatarja per dy numra: "+k2.mesatarja(4, 5));
        System.out.println("Mesatarja per tre numra: "+k2.mesatarja(4, 5,5));
        System.out.println("y="+k2.funksioni_y(3));
    }
    
}
