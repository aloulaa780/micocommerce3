
public class TestArticle {
    public static void main(String[] args) {
        try {
            Article tv = new Fragile("LG", 7000.00, "Protection renforcée");
            System.out.println("Prix de transport pour TV : " + tv.prixTransport());

            Article a1 = new Article("Samsung", 740.00);
            System.out.println("Prix de transport pour A1 : " + a1.prixTransport());
        } catch (PRTInfA10Exception e) {
            System.out.println(e.getMessage());
        }
    }
}