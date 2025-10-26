public class Pracownik {
    private String imie;
    private int wiek;

    public Pracownik(String imie, int wiek) {
        this.imie = imie;
        this.wiek = wiek;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        if (wiek > 0) this.wiek = wiek;
    }

    public void przedstawSie() {
        System.out.println("cześć jestem pracownikiem. nazywam sie " + imie + ", mam " + wiek + " lat.");
    }
}
