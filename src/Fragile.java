public class Fragile extends Article {
    private String emballage;

    public Fragile(String nom, double prixHT, String emballage) {
        super(nom, prixHT);
        this.emballage = emballage;
    }

    public Fragile(String nom, double prixHT) {
        this(nom, prixHT, "Standard");
    }

    @Override
    public double prixTransport() throws PRTInfA10Exception {
        double normalTransport = super.prixTransport();
        return 2 * normalTransport; // Prix de transport doublé pour les articles fragiles
    }
}
