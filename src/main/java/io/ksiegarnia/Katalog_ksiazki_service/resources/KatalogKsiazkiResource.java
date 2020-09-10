package io.ksiegarnia.Katalog_ksiazki_service.resources;

import io.ksiegarnia.Katalog_ksiazki_service.models.KatalogItem;
import io.ksiegarnia.Katalog_ksiazki_service.models.Ksiazka;
import io.ksiegarnia.Katalog_ksiazki_service.models.Oceny;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/katalog")
public class KatalogKsiazkiResource {

    @Autowired//referencja do bean w Applicaton
    private RestTemplate restTemplate;

    @RequestMapping("/{userID}")
    public List<KatalogItem> getCatalog(@PathVariable("userID") String userID){

        List<Oceny> oceny = Arrays.asList(
                new Oceny(3,"sdasdasda"),
            new Oceny(2,"sdasddsadsadasdsadasasda"),
            new Oceny(5,"sdsda")
        );

        return oceny.stream().map(ocena -> {
            Ksiazka ksiazka = restTemplate.getForObject("http://localhost:8081/ksiazka/" + ocena.getKsiazkaID(), Ksiazka.class);
            return new KatalogItem(ksiazka.getNazwa(),"asd",ocena.getOcena());
        }).collect(Collectors.toList());


        //return Collections.singletonList(new KatalogItem(userID,"asd",3));//testowe
    }
}
