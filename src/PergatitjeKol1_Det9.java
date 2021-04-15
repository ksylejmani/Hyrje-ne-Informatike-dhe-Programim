/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KadriS
 */
public class PergatitjeKol1_Det9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            int i=1;
            while(i<=10) {
                if(i==6){
                    i++;
                    continue;
                }
                System.out.print (i+" " );
                i++;
            }
            System.out.println();
    }
    
}
