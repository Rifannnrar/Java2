public class Rice_Cooker extends Elektronik2 {
  private Double kapasitas_menanak;
  private String aksesoris;
  public Rice_Cooker(String brand,String warna,Double berat){
    super(brand,warna,berat);
  }
  public Rice_Cooker(String brand,String warna,Double berat,Double kap_menanak,String aksesoris){
    super.setBrand(brand);
    super.setWarna(warna);
    super.setBerat(berat);
    this.kapasitas_menanak=kap_menanak;
    this.aksesoris=aksesoris;
  }
  //setter
  public void setKapasitasMenanak(Double kap_menanak){
    this.kapasitas_menanak=kap_menanak;
  }
  public void setAksesoris(String akse){
    this.aksesoris=akse;
  }
  //getter
  public String getBrand(){
    return super.getBrand();
  }
  public String getWarna(){
    return super.getWarna();
  }
  public Double getBerat(){
    return super.getBerat();
  }
  public Double getKapasitasMenanak(){
    return kapasitas_menanak;
  }
  public String getAksesoris(){
    return aksesoris;
  }
}
