package org.dz1;

import java.util.ArrayList;
import java.util.List;

class User {
    private String login;
    private String password;
    private Basket basket;

    public User(String login, String password) {
        this.login = login;
        this.password = password;
        this.basket = new Basket();
    }

    public Basket getBasket() {
        return basket;
    }
}
