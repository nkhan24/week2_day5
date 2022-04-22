import java.util.ArrayList;

public class Gallery {

 String name;
 int till;
 ArrayList<Artwork>collection;

 public Gallery(String name, int till) {
  this.name = name;
  this.till = till;
  this.collection = new ArrayList<>();
 }

 public String getName() {
  return name;
 }

 public void setName(String name) {
  this.name = name;
 }

 public int getTill() {
  return till;
 }

 public void setTill(int till) {
  this.till = till;
 }

 public ArrayList<Artwork> getCollection() {

  return collection;
 }

 public void setCollection(ArrayList<Artwork> collection) {
  this.collection = collection;
 }

 //behaviour

 public int countPaintings(){
return this.collection.size();
 }
 public void addPainting(Artwork painting){
  this.collection.add(painting);
 };

 public int customerBuy(Artwork buy){
  return till += buy.getPrice();
 }
 public int customerSell(Artwork sell){
  return till -= sell.getPrice();
 }

}
