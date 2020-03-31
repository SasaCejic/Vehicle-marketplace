package rs.ac.singidunum.ProdavnicaAutomobila;

public class Automobil extends Vozilo{
    private int brojVrata;
    private double zapreminaPrtljaznika;

    public Automobil(int id, String marka, String model, int godinaProizvodnje, int zapreminaMotora,
                     String gorivo, double zapreminaRezervoara, int brojVrata, double zapreminaPrtljaznika) {
        super(id, marka, model, godinaProizvodnje, zapreminaMotora, gorivo, zapreminaRezervoara);
        this.brojVrata = brojVrata;
        this.zapreminaPrtljaznika = zapreminaPrtljaznika;
    }

    public int getBrojVrata() {
        return brojVrata;
    }

    public void setBrojVrata(int brojVrata) {
        this.brojVrata = brojVrata;
    }

    public double getZapreminaPrtljaznika() {
        return zapreminaPrtljaznika;
    }

    public void setZapreminaPrtljaznika(double zapreminaPrtljaznika) {
        this.zapreminaPrtljaznika = zapreminaPrtljaznika;
    }

    @Override
    public String toString() {
        return "Automobil{" +
                "brojVrata=" + brojVrata +
                ", zapreminaPrtljaznika=" + zapreminaPrtljaznika +
                '}';
    }

}
