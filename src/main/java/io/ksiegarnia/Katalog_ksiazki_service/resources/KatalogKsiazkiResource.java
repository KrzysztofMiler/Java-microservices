package io.ksiegarnia.Katalog_ksiazki_service.resources;

import io.ksiegarnia.Katalog_ksiazki_service.models.KatalogItem;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/katalog")
public class KatalogKsiazkiResource {

    @RequestMapping("/{userID}")
    public List<KatalogItem> getCatalog(@PathVariable("userID") String userID){
        return Collections.singletonList(new KatalogItem("ks","asd",3));//testowe
    }
}
