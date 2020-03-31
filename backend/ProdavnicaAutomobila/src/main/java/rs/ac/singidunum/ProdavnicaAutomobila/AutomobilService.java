package rs.ac.singidunum.ProdavnicaAutomobila;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class AutomobilService {
    private static List<Automobil> automobili = new ArrayList<Automobil>();

    static{
        automobili.add(new Automobil(0,"Audi","A5",2018,2500,
                "benzin",58.0,5,100.0));
        automobili.add(new Automobil(1,"BMW","420d",2017,2000,
                "benzin",57.0,4,90.5));
        automobili.add(new Automobil(2,"Mercedes","E 300",2017,2000,
                "dizel",66.0,2,60.0));
    }

    public String prikaziAutomobile(){
        String prikaz = "[";

        for(Automobil a: automobili){

            prikaz += " {" + "id: " + a.getId() +
                    ", marka: " + a.getMarka() +
                    ", model: " + a.getModel() +
                    ", godinaProizvodnje: " + a.getGodinaProizvodnje() +
                    ", zapreminaMotora: " + a.getZapreminaMotora() +
                    ", gorivo: " + a.getGorivo() +
                    ", zapreminaRezervoara: " + a.getZapreminaRezervoara() +
                    ", brojVrata: " + a.getBrojVrata() +
                    ", zapreminaPrtljaznika: " + a.getZapreminaPrtljaznika() +
                    "} ,";

        }
        prikaz = prikaz.substring(0,prikaz.length()-1);
        prikaz += "]";

        return prikaz;
    }
    public Automobil pronadjiAutomobil(int id){
        return automobili.get(id);
    }

    public Automobil dodajAutomobil(Automobil automobil){
        automobili.add(automobil);
        return automobil;
    }

    public Automobil biloKojiAutomobil(){
        Random r = new Random();
        int n = r.nextInt(automobili.toArray().length);
        return automobili.get(n);
    }

    public String prikaziProizvodjaca(int id){
        return automobili.get(id).getMarka();
    }

    public String prikaziModel(int id){return automobili.get(id).getModel();}

    public int brojAutomobila(){
        return automobili.toArray().length;
    }

    public String listaProizvodjaca(){
        String proizvodjaci = "";
        Set<String> setProizvodjaca = new LinkedHashSet<>();

        for (int i = 0; i < automobili.toArray().length; i++) {
            setProizvodjaca.add(automobili.get(i).getMarka());
        }

        for(String s: setProizvodjaca){
            proizvodjaci += s + " ";
        }
        return proizvodjaci;
    }

}
