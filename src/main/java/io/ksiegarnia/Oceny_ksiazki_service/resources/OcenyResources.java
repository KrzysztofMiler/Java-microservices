package io.ksiegarnia.Oceny_ksiazki_service.resources;

import io.ksiegarnia.Oceny_ksiazki_service.model.Oceny;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping("/oceny")
public class OcenyResources {

    @RequestMapping("/{ksiazkaID}")
    public Oceny getOceny(@PathVariable("ksiazkaID") String ksiazkaID){
        return new Oceny(1,ksiazkaID);
    }

}
