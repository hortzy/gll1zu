public class Tipp {

    private int tipp;
    public void tippel(){
        System.out.println("Kérlek add meg a tippedet, hogy a Kek, Zold vagy Piros csiga fog nyerni: ");
        tipp = Csigak.nextLine();
        System.out.println("tippem: " + tipp);
    }


}
