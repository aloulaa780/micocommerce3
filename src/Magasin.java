import java.util.ArrayList;

public class Magasin {
    private ArrayList<Article> articles;

    public Magasin() {
        articles = new ArrayList<>();
    }

    public boolean add(Article article) {
        return articles.add(article);
    }

    @Override
    public String toString() {
        return articles.toString();
    }
}