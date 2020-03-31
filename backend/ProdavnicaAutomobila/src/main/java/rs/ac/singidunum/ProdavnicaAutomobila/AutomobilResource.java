package rs.ac.singidunum.ProdavnicaAutomobila;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AutomobilResource {


    @Autowired
    private AutomobilService service;

    @GetMapping("/automobili")
    public String prikaziAutomobile(){
        return service.prikaziAutomobile();
    }

    @GetMapping("/automobili/{id}")
    public Automobil pronadjiAutomobil(@PathVariable int id){
        return service.pronadjiAutomobil(id);
    }

    @PostMapping("/dodaj")
    public Automobil dodajAutomobil(@RequestBody Automobil automobil){
        return service.dodajAutomobil(automobil);
    }

    @GetMapping("/bilokojiautomobil")
    public Automobil biloKojiAutomobil(){
        return service.biloKojiAutomobil();
    }

    @GetMapping("/proizvodjaci/{id}")
    public String prikaziProizvodjaca(@PathVariable int id){
        return service.prikaziProizvodjaca(id);
    }

    @GetMapping("/modeli/{id}")
    public String prikaziModel(@PathVariable int id){return service.prikaziModel(id);}

    @GetMapping("/brojautomobila")
    public int brojAutomobila(){
        return service.brojAutomobila();
    }

    @GetMapping("/proizvodjaci")
    public String listaProizvodjaca(){
        return service.listaProizvodjaca();
    }
}
