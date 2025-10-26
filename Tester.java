public class Tester extends Pracownik implements Pracuje {
    private boolean automatyzujacy;

    public Tester(String imie, int wiek, boolean automatyzujacy) {
        super(imie, wiek);
        this.automatyzujacy = automatyzujacy;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem testerem. Nazywam się " + getImie() +
                ". Testuję " + (automatyzujacy ? "automatycznie" : "manualnie"));
    }

    @Override
    public void wykonajPrace() {
        System.out.println("Wykonuję testy " + (automatyzujacy ? "automatyczne" : "manualne") + " aplikacji.");
    }
}
