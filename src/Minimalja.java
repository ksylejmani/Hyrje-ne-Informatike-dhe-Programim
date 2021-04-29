public class Minimalja {

    public static void main(String[] args) {
        int x=4,y=-1,z=2;
        int min=minimalja2(x,y,z);
        System.out.println("Minimalja: "+min);
    }
    static int minimalja(int a, int b, int c){
        int min;
        min=a;
        if(b<min){
            min=b;
        }
        if(c<min){
            min=c;
        }
        return min;
    }
    static int minimalja2(int a, int b, int c){
        int min;
        if(a<b&&a<c){
            min=a;
        }else if(b<a &&b<c){
            min=b;
        }
        else{
            min=c;
        }
        return min;
    }
    
}
