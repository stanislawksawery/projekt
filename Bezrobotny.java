public class Bezrobotny implements Pracuje {
    private String imie;
    private int wiek;
    private boolean szukaPracy;

    public Bezrobotny(String imie, int wiek, boolean szukaPracy) {
        this.imie = imie;
        this.wiek = wiek;
        this.szukaPracy = szukaPracy;
    }

    public void przedstawSie() {
        System.out.println("cześć jestem " + imie + ", mam " + wiek + " lat i jestem bezrobotny(i gram w cs2 z bursiakiem).");
    }

    @Override
    public void wykonajPrace() {
        if (szukaPracy) {
            System.out.println(imie + " szuka pracy.");
        }
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

    public boolean isSzukaPracy() {
        return szukaPracy;
    }

    public void setSzukaPracy(boolean szukaPracy) {
        this.szukaPracy = szukaPracy;
    }
}
