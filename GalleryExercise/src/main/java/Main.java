public class Main {
    public static void main(String[] args) {
        Artist person1 = new Artist("Jeff");
        Gallery art = new Gallery("Javallery", 100);
        Artwork paint = new Artwork("Paintava", person1,4,"Yes");
        Customer customer1 = new Customer("Pete", 25);

        art.addPainting(paint);

        System.out.println(art.collection);


    }



}
