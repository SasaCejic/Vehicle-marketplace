package rs.ac.singidunum.ProdavnicaMotocikala;

public class Motocikl extends Vozilo{
    private String prenos;
    private String tipRama;

    public Motocikl(int id, String marka, String model, int godinaProizvodnje, int zapreminaMotora,
                    String gorivo, double zapreminaRezervoara, String prenos, String tipRama) {
        super(id, marka, model, godinaProizvodnje, zapreminaMotora, gorivo, zapreminaRezervoara);
        this.prenos = prenos;
        this.tipRama = tipRama;
    }

    public String getPrenos() {
        return prenos;
    }

    public void setPrenos(String prenos) {
        this.prenos = prenos;
    }

    public String getTipRama() {
        return tipRama;
    }

    public void setTipRama(String tipRama) {
        this.tipRama = tipRama;
    }

    @Override
    public String toString() {
        return "Motocikl{" +
                "prenos='" + prenos + '\'' +
                ", tipRama='" + tipRama + '\'' +
                '}';
    }
}
