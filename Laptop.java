public class Laptop extends elektronik {
  private String NamaModel = "V14";

  public static void main(String[] args) {
      elektronik lap = new elektronik();
      Laptop laptop1 = new Laptop();

      lap.spesifikasi();
      System.out.println("Brand Laptop: " + lap.brand + " " + laptop1.NamaModel);
  }
}
