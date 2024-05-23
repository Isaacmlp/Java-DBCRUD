package Controller;
import Model.Modelo;
import View.Vista;
import View.Login;

public class Controller_Login {
    Login login;
    Modelo modelo;

    public Controller_Login(Modelo modelo, Login login) {
        this.modelo = modelo;
        this.login = login;
    }

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

}

