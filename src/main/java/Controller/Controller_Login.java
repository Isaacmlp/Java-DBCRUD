package Controller;
import View.Login;
import Model.Model;
import View.View;

import java.awt.*;

public class Controller_Login {
    View login;
    Model modelo;

    public Controller_Login(Model modelo, View login) {
        this.modelo = modelo;
        this.login = login;
    }

    public View getLogin() {
        return login;
    }

    public void setLogin(View login) {
        this.login = login;
    }

    public Model getModelo() {
        return modelo;
    }

    public void setModelo(Model modelo) {
        this.modelo = modelo;
    }



}

