import java.util.ArrayList;

public class Artist {

    String name;
    ArrayList<Artwork>collection;

    public Artist(String name) {
        this.name = name;
        this.collection = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Artwork> getCollection() {
        return collection;
    }

    public void setCollection(ArrayList<Artwork> collection) {
        this.collection = collection;
    }

}
