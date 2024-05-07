import java.util.Random;
public class Csigak {

  private String szin;
  private int tav;
  public Csigak(String szin) {
    this.szin = szin;
    this.tav = 0;
}
  public void mozgas() {
    Random rand = new Random();
    int haladas = rand.nextInt(4); // 0..3
    this.tav += haladas;
  }

  public void gyorsit() {
    Random rand = new Random();
    int haladas = 2*(rand.nextInt(4));
    this.tav += haladas;
  }


    public int getTav() {
      return tav;
    }
    public String getSzin() {
      return szin;
    }

}