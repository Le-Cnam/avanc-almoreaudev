public class Vols {
    public String date;
    public double duree;
    public Avion avion;

    public Vols(String date, int duree, Avion avion) {
        this.date = date;
        this.duree = duree;
        this.avion = avion;
    }

    public double getTotalPrice(){
        return this.duree/60.0*this.avion.getCout();
    }

    public String toString()
    {
        return "date " + this.date + " | duree : " + this.duree + " min | Commandant de Bord | " + this.avion.getImmatriculation() + " | " + this.getTotalPrice() + " €";
    }

}
