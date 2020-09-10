package io.ksiegarnia.Oceny_ksiazki_service.resources;

import io.ksiegarnia.Oceny_ksiazki_service.model.Oceny;
import io.ksiegarnia.Oceny_ksiazki_service.model.UserOceny;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;
@RestController
@RequestMapping("/oceny")
public class OcenyResources {

    @RequestMapping("/{ksiazkaID}")
    public Oceny getOceny(@PathVariable("ksiazkaID") String ksiazkaID){
        return new Oceny(1,ksiazkaID);
    }


    @RequestMapping("users/{userID}")//tutaj będzie jakie user zrecenzował filmy jak narazie na sztywno
    public UserOceny     getUserOceny(@PathVariable("userID") String userID){
        List<Oceny> oceny = Arrays.asList(
                new Oceny(3,"sdasdasda"),
                new Oceny(2,"sdasddsadsadasdsadasasda"),
                new Oceny(5,"sdsda")
        );
        UserOceny userOceny = new UserOceny();
        userOceny.setUserOceny(oceny);
        return userOceny;
    }
}
