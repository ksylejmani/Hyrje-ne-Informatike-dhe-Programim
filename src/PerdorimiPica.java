public class PerdorimiPica {

    public static void main(String[] args) {
        Pica p=new Pica();
        p.cakto_vlerat();
        p.shtyp();
        p.vendos_emertimin("Margarita");
        p.setPerimetri(190);
        p.shtyp();
        System.out.println("Perimetri ne njesine meter eshte: "+p.konverto());
    }
    
}
