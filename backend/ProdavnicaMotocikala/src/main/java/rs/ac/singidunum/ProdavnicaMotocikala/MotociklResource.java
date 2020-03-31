package rs.ac.singidunum.ProdavnicaMotocikala;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MotociklResource {

    @Autowired
    private MotociklService service;

    @GetMapping("/motocikli")
    public String prikaziMotocikle(){
        return service.prikaziMotocikle();
    }

    @GetMapping("/motocikli/{id}")
    public Motocikl pronadjiMotocikl(@PathVariable int id){
        return service.pronadjiMotocikl(id);
    }

    @PostMapping("/dodaj")
    public Motocikl dodajMotocikl(@RequestBody Motocikl motocikl){
        return service.dodajMotocikl(motocikl);
    }

    @GetMapping("/bilokojimotocikl")
    public Motocikl biloKojiMotocikl(){
        return service.biloKojiMotocikl();
    }

    @GetMapping("/proizvodjaci/{id}")
    public String prikaziProizvodjaca(@PathVariable int id){
        return service.prikaziProizvodjaca(id);
    }

    @GetMapping("/modeli/{id}")
    public String prikaziModel(@PathVariable int id){return service.prikaziModel(id);}

    @GetMapping("/brojmotocikala")
    public int brojMotocikala(){
        return service.brojMotocikala();
    }

    @GetMapping("/proizvodjaci")
    public String listaProizvodjaca(){
        return service.listaProizvodjaca();
    }
}
