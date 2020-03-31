package rs.ac.singidunum.ProdavnicaMotocikala;

import org.springframework.stereotype.Component;

import java.util.*;

@Component
public class MotociklService {
    private static List<Motocikl> motocikli = new ArrayList<Motocikl>();

    static{
        motocikli.add(new Motocikl(0,"Honda","CB500F",2019,500,
                "benzin",17.1,"lanac","Steel Diamond"));
        motocikli.add(new Motocikl(1,"Honda","NC750S",2018,750,
                "benzin",14.1,"kaiš","Diamond - steel pipe"));
        motocikli.add(new Motocikl(2,"Yamaha","XSR900",2019,900,
                "benzin",19.0,"lanac","Steel"));
    }

    public String prikaziMotocikle(){
        String prikaz = "[";

        for(Motocikl m: motocikli){

            prikaz += " {" + "id: " + m.getId() +
                    ", marka: " + m.getMarka() +
                    ", model: " + m.getModel() +
                    ", godinaProizvodnje: " + m.getGodinaProizvodnje() +
                    ", zapreminaMotora: " + m.getZapreminaMotora() +
                    ", gorivo: " + m.getGorivo() +
                    ", zapreminaRezervoara: " + m.getZapreminaRezervoara() +
                    ", prenos: " + m.getPrenos() +
                    ", tipRama: " + m.getTipRama() +
                    "} ,";

        }
        prikaz = prikaz.substring(0,prikaz.length()-1);
        prikaz += "]";

        return prikaz;
    }

    public Motocikl pronadjiMotocikl(int id){
        return motocikli.get(id);
    }

    public Motocikl dodajMotocikl(Motocikl motocikl){
        motocikli.add(motocikl);
        return motocikl;
    }


    public Motocikl biloKojiMotocikl(){
        Random r = new Random();
        int n = r.nextInt(motocikli.toArray().length);
        return motocikli.get(n);
    }

    public String prikaziProizvodjaca(int id){
        return motocikli.get(id).getMarka();
    }

    public String prikaziModel(int id){return motocikli.get(id).getModel();}

    public int brojMotocikala(){
        return motocikli.toArray().length;
    }

    public String listaProizvodjaca(){
        String proizvodjaci = "";
        Set<String> setProizvodjaca = new LinkedHashSet<>();

        for (int i = 0; i < motocikli.toArray().length; i++) {
            setProizvodjaca.add(motocikli.get(i).getMarka());
        }

        for(String s: setProizvodjaca){
            proizvodjaci += s + " ";
        }

        return proizvodjaci;
    }
}
