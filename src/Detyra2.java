public class Detyra2 {

    public static void main(String[] args) {
        int x = 345;
        int c = x % 10; // c=5
        int b = (x / 10) % 10; // b=4
        int a = x / 100; // a=3
        int y = 100 * c + 10 * b + a; // y=100*5+10*4+3=543
        System.out.println("Numri në renditjen e kundërt është: " + y);

    }
    
}
