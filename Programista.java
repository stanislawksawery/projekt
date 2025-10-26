public class Programista extends Pracownik implements Pracuje {
    private String jezykProgramowania;

    public Programista(String imie, int wiek, String jezyk) {
        super(imie, wiek);
        this.jezykProgramowania = jezyk;
    }

    @Override
    public void przedstawSie() {
        System.out.println("Jestem programistą. Nazywam się " + getImie() + " i koduję w " + jezykProgramowania);
    }

    @Override
    public void wykonajPrace() {
        System.out.println("Piszę kod w języku " + jezykProgramowania);
    }
}
