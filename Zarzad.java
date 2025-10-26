public class Zarzad extends Pracownik implements Pracuje {
    private String stanowisko;

    public Zarzad(String imie, int wiek, String stanowisko) {
        super(imie, wiek);
        this.stanowisko = stanowisko;
    }

    public String getStanowisko() {
        return stanowisko;
    }

    public void setStanowisko(String stanowisko) {
        this.stanowisko = stanowisko;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem " + getImie() + ", mam " + getWiek() + " lat i jestem na stanowisku: " + stanowisko);
    }

    @Override
    public void wykonajPrace() {
        System.out.println("Zarządzam firmą i podejmuję decyzje strategiczne.");
    }
}
