public abstract class TangibleAsset {
  private String name;
  private int price;
  private String color;
  public String getName() {return this.name;}
  public int getPrice() {return this.price;}
  public String getColor() {return this.color;}
  public TangibleAsset(String name, int price, String color) {
    this.name = name;
    this.price = price;
    this.color = color
 }
}
public class book extends TangibleAsset {
 private String isbn;
 public String getIsbn() {return this.isbn;}
 public book(String isbn, String name, int price, String color){
   this.isbn = isbn;
   super(name, price, color);
 }
}
public class computer extends TangibleAsset {
private String makerName;
public String getmakerName() {return this.MakerName;}
public computer(String MakerName, String name, int price, String color){
  this.MakerName = MakerName;
  super(name, price, color);
}
