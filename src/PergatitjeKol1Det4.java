
public class PergatitjeKol1Det4 {

    public static void main(String[] args) {
        int a=12,b=4,c=9;
        switch (a / 2) {//12/6=6
        case 5:
            System.out.println((b + c + 1));
            break;
        case 6:
            System.out.println(c-a); //9-12=-3
            break;
        case 7:
            System.out.println(b-c);
            break;
        default: 
            System.out.println((a + b + c)); 
            //break;
        }
    }
}
