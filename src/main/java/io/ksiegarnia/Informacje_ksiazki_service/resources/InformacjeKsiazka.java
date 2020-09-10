package io.ksiegarnia.Informacje_ksiazki_service.resources;

import io.ksiegarnia.Informacje_ksiazki_service.models.Ksiazka;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ksiazka")
public class InformacjeKsiazka {

    @RequestMapping("/{ksiazkaID}")
    public Ksiazka getKsiazka(@PathVariable("ksiazkaID") String ksiazkaID){
        return new Ksiazka(ksiazkaID,"test");
    }
}
