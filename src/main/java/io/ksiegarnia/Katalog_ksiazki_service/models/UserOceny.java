package io.ksiegarnia.Katalog_ksiazki_service.models;

import java.util.List;

public class UserOceny {
    private List<Oceny> userOceny;

    public UserOceny() {
    }

    public List<Oceny> getUserOceny() {
        return userOceny;
    }

    public void setUserOceny(List<Oceny> userOceny) {
        this.userOceny = userOceny;
    }
}
