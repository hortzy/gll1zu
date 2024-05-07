
public class Main {
    public static void main(String[] args) {

        Csigak[] csiga = {new Csigak("Piros"), new Csigak("Zold"), new Csigak("Kek")};
        Verseny verseny = new Verseny(csiga, 5);
        Tipp.tippel();
        verseny.startverseny();
        Csigak gyoztes = verseny.gyoztes();
        System.out.println("A gyoztes a " + gyoztes.getSzin() + " csiga " + gyoztes.getTav() + " egyseggel!");



        }
    }
