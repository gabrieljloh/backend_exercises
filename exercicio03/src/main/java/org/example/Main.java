package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Barco> barcos = new ArrayList<>();
        barcos.add(new Barco("1", 5));
        barcos.add(new Barco("2", 8));
        barcos.add(new Barco("3", 12));
        barcos.add(new Barco("4", 10));
        barcos.add(new Barco("5", 15));


        PortoPequeno portoPequeno = new PortoPequeno("Porto Pequeno");
        PortoGrande portoGrande = new PortoGrande("Porto Grande");


        for (Barco barco : barcos) {
            if (barco.getTamanho() <= 10) {
                portoPequeno.atracarBarco(barco);
            } else {
                portoGrande.atracarBarco(barco);
            }
        }
    }
}