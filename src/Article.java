
public class Article {
    private String nom;
    private double prixHT;
    private static final double TVA = 0.18;

    public Article(String nom, double prixHT) {
        this.nom = nom;
        this.prixHT = prixHT;
    }

    public double prixTransport() throws PRTInfA10Exception {
        double transport = prixHT * 0.05;
        if (transport < 10) {
            throw new PRTInfA10Exception("Le prix de transport est inférieur à 10.");
        }
        return transport;
    }

    @Override
    public String toString() {
        return nom + " - " + prixHT + " HT";
    }
}