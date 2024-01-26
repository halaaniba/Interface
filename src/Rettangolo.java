public class Rettangolo implements Forma {
    double altezza;
    double base ;
    public Rettangolo(double altezza,double base){
        this.base = base;
        this.altezza = altezza;
    }
    public double calcolaArea(){
        return base* altezza;
    }
}
