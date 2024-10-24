public class Elektronik2 {
  private static String brand,warna;
  private Double berat;
  public Elektronik2(){
  }
  public Elektronik2(String brand,String warna,Double berat){
    this.brand=brand;
    this.warna=warna;
    this.berat=berat;
  }
  // setter
  public void setBrand(String brand){
    this.brand=brand;
  }
  public void setWarna(String Warna){
    this.warna=warna;
  }
  public void setBerat(Double berat){
    this.berat=berat;
  }
  //getter
  public String getBrand(){
    return brand;
  }
  public String getWarna(){
    return warna;
  }
  public Double getBerat(){
    return berat;
  }
}
