public class PergatitjeKol1_Det6 {

    public static void main(String[] args) {
        int x = 13;
        int y = 2 * (x - 5); //y=16
        int z = (x + 1 > y) ? (1 - x) : (-x - y); //z=-29
        System.out.println("Rezultati:");
        System.out.println(z >= 0 ? z : -z);
        // Rezultati:
        // 29

    }
    
}
