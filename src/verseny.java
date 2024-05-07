import java.util.Random;
public class verseny {
    private Csigak[] csiga;
    private int kor;

    public verseny(Csigak[] csiga, int kor) {
        this.csiga = csiga;
        this.kor = kor;
    }

    public void startVerseny() {
        Random rand = new Random();

        for (int i = 0; i < kor; i++) {
            System.out.println((i + 1) +"Kör: ");

            if (rand.nextInt(100) < 20) {
                int randomIndex = rand.nextInt(csiga.length);
                csiga[randomIndex].gyorsit();
            }
                for (Csigak csiga : csiga) {
                    csiga.mozgas();
                    System.out.println(csiga.getSzin() + " csiga haladt " + csiga.getTav() + " egységet.");
                }
                System.out.println();
        }
    }

    public Csigak nyertes() {
        Csigak nyertes = csiga[0];
        for (Csigak csiga : csiga) {
            if (csiga.getTav() > nyertes.getTav()) {
                nyertes = csiga;
            }
        }
        return nyertes;
    }
}

}
