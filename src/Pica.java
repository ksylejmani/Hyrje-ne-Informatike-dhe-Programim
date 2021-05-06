public class Pica {
    private String emertimi,forma;
    private int perimetri;
    void cakto_vlerat(){
        emertimi="Tuna";
        forma="rrethore";
        this.perimetri=150;
    }
    void shtyp(){
        System.out.println(this.emertimi+
                " me formë "+this.forma+
                " ka perimetrin "+
                this.perimetri+" cm.");
    }
    void vendos_emertimin(String _emertimi){
        emertimi=_emertimi;
    }

    public void setPerimetri(int perimetri) {
        this.perimetri = perimetri;
    }
    String merr_emertimin(){
        return emertimi;
    }
    double konverto(){
        double rez=perimetri/100.0;
        return rez;
    } 
    
}
