import java.util.Objects;
import java.util.regex.*;

public class Avion {
    private String immatriculation;
    private double cout;

    public Avion(String immatriculation, int cout) {

        String regex = "^[A-Z]-[A-Z]{4}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(immatriculation);

        if (matcher.matches()) {
            this.immatriculation = immatriculation;
        }else {
            System.out.println("Invalid immatriculation");
            this.immatriculation = null;
        }
        this.cout = cout;

    }

    public String getImmatriculation() {
        return immatriculation;
    }

    public void setImmatriculation(String immatriculation) {
        this.immatriculation = immatriculation;
    }

    public double getCout() {
        return cout;
    }

    public void setCout(int cout) {
        this.cout = cout;
    }

    @Override
    public String toString() {
        return this.immatriculation + " | " + this.cout + " €";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Avion avion)) return false;
        return cout == avion.cout && Objects.equals(immatriculation, avion.immatriculation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(immatriculation, cout);
    }
}
