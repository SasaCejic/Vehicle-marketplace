package rs.ac.singidunum.ProdavnicaMotocikala;

public class Vozilo {
    private int id;
    private String marka;
    private String model;
    private int godinaProizvodnje;
    private int zapreminaMotora;
    private String gorivo;
    private double zapreminaRezervoara;

    public Vozilo(int id, String marka, String model, int godinaProizvodnje, int zapreminaMotora, String gorivo, double zapreminaRezervoara) {
        this.id = id;
        this.marka = marka;
        this.model = model;
        this.godinaProizvodnje = godinaProizvodnje;
        this.zapreminaMotora = zapreminaMotora;
        this.gorivo = gorivo;
        this.zapreminaRezervoara = zapreminaRezervoara;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getGodinaProizvodnje() {
        return godinaProizvodnje;
    }

    public void setGodinaProizvodnje(int godinaProizvodnje) {
        this.godinaProizvodnje = godinaProizvodnje;
    }

    public int getZapreminaMotora() {
        return zapreminaMotora;
    }

    public void setZapreminaMotora(int zapreminaMotora) {
        this.zapreminaMotora = zapreminaMotora;
    }

    public String getGorivo() {
        return gorivo;
    }

    public void setGorivo(String gorivo) {
        this.gorivo = gorivo;
    }

    public double getZapreminaRezervoara() {
        return zapreminaRezervoara;
    }

    public void setZapreminaRezervoara(double zapreminaRezervoara) {
        this.zapreminaRezervoara = zapreminaRezervoara;
    }

    @Override
    public String toString() {
        return "Vozilo{" +
                "id=" + id +
                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", godinaProizvodnje=" + godinaProizvodnje +
                ", zapreminaMotora=" + zapreminaMotora +
                ", gorivo='" + gorivo + '\'' +
                ", zapreminaRezervoara=" + zapreminaRezervoara +
                '}';
    }

}
