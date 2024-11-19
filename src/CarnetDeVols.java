public class CarnetDeVols {
    public Vols[] vols = new Vols[100];
    public int nbVols = 0;

    public void ajouterVol(Vols vol) {
        this.vols[this.nbVols] = vol;
        this.nbVols++;
    }

    public void afficherVols() {
        for (int i = 0; i < this.nbVols; i++) {
            System.out.println(this.vols[i].toString());
        }
        System.out.println("---------------------------------");
    }

    public void afficherVolTotalSimpleCommande()
    {
        double tempsVolTotal = 0;
        for (int i = 0; i < this.nbVols; i++) {
            if (!(this.vols[i] instanceof VolsDouble)){
                tempsVolTotal += this.vols[i].duree;
            }
        }
        System.out.println("Temps total vols simple : " + tempsVolTotal);
    }

    public void afficherVolTotalDoubleCommande()
    {
        double tempsVolTotal = 0;
        for (int i = 0; i < this.nbVols; i++) {
            if (this.vols[i] instanceof VolsDouble){
                tempsVolTotal += this.vols[i].duree;
            }
        }
        System.out.println("Temps total vols doubles : " + tempsVolTotal);
    }

    public void afficherCoutTotal(){
        double coutTotal = 0;
        for (int i = 0; i < this.nbVols; i++) {
            coutTotal += this.vols[i].getTotalPrice();
        }
        System.out.println("Total cout : " + coutTotal);
    }
}
