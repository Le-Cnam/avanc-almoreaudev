public class VolsDouble extends Vols{
    private double majorationPourcentage;


    public VolsDouble(String date, int duree, Avion avion, double majorationPourcentage) {
        super(date, duree, avion);
        this.majorationPourcentage = majorationPourcentage;
    }

    public double getMajorationPourcentage() {
        return majorationPourcentage;
    }

    public void setMajorationPourcentage(double majorationPourcentage) {
        this.majorationPourcentage = majorationPourcentage;
    }

    public double getTotalPrice(){
        return this.duree/60.0*this.avion.getCout() * (100.0 + this.majorationPourcentage) / 100;
    }

    public String toString()
    {
        return "date " + this.date + " | duree : " + this.duree + " min | Double commande | " + this.avion.getImmatriculation() + " | " + this.getTotalPrice() + " €";
    }
}
