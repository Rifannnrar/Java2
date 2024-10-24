import java.io.*;
public class utama {
  public static void main(String[] kri) throws IOException {
    BufferedReader k = new BufferedReader(new InputStreamReader(System.in));
    Rice_Cooker rice = new Rice_Cooker("","",0.0,0.0,"");

    //menu
    while(true){
      System.out.println("-----Menu Elektronik-----");
      System.out.println("1. Input Data Rice Cooker");
      System.out.println("2. Lihat Data Rice Cooker");
      System.out.println("3.Keluar");
      System.out.println("Masukkan pilihan menu: ");
      int pilihan = Integer.parseInt(k.readLine());
      System.out.println("");

      switch (pilihan) {
        case 1:
         System.out.println("-----Menu Elektronik----");
         System.out.println("Inputkan brand Rice Cooker: ");
          String brand = k.readLine();
          System.out.println("Inputkan warna: ");
          String wrna = k.readLine();
          System.out.println("Inputkan berat: ");
          Double brt = Double.parseDouble (k.readLine());
          System.out.println("Inputkan Kapasitas: ");
          Double kap_menanak= Double.parseDouble(k.readLine());
          System.out.println("Inputkan aksesoris: ");
          String akse = k.readLine();
          rice = new Rice_Cooker(brand, wrna, brt, kap_menanak,akse);
          System.out.println("");
          System.out.println("Data Berhasil Disimpan");
          System.out.println("");
          break;
          case 2:
          System.out.println("");
          System.out.println("--Lihat Data--");
          System.out.println("Brand Rice Cooker: "+rice.getBrand());
          System.out.println("Warna Rice Cooker: "+rice.getWarna());
          System.out.println("Berat Rice Cooker: "+rice.getBerat()+ " kg ");
          System.out.println("Kapasitas Menanank Rice Cooker: "+rice.getKapasitasMenanak()+"Liter");
          System.out.println("Aksesoris Rice Cooker: "+rice.getAksesoris());
          System.out.println("");
          break;
          case 3:
          System.exit(0);
          break;
      }
    }
  }
}
