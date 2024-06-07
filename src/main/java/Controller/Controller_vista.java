package Controller;

import Model.Modelo;
import View.Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller_vista implements ActionListener {
    Vista vista;
    Modelo modelo;

    public Controller_vista(Vista vista) {
        this.vista = vista;
        modelo = new Modelo();
       }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}