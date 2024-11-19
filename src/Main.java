import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Avion cessna150 = new Avion("F-BUBK", 100);
        Avion dr400 = new Avion("F-GKQA", 130);
        CarnetDeVols carnet = new CarnetDeVols();

        carnet.ajouterVol(new Vols("10/11/2018", 60, cessna150));
        carnet.ajouterVol(new VolsDouble("11/11/2018", 180, dr400, 15));
        carnet.ajouterVol(new Vols("12/11/2018", 30, cessna150));

        carnet.afficherVols();
        carnet.afficherVolTotalSimpleCommande();
        carnet.afficherVolTotalDoubleCommande();
        carnet.afficherCoutTotal();

    }
}
