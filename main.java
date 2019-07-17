// import Cleric ;
public class main{
  public static void main(String[] args) {
    // ここでcrelic(名前　あさかHP、４０、MP １０)
    Crelic asaka = new Crelic("あさか", 40 ,10);
    Crelic minato = new Crelic("minato",40,8);
  asaka.selfAid();
  asaka.pray(5);
  System.out.println(asaka.name);
  System.out.println(asaka.HP);
  System.out.println(asaka.MP);

}
}
