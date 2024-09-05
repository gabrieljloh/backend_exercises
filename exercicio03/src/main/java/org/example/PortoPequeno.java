package org.example;

public class PortoPequeno extends BasePorto {

    public PortoPequeno(String nome) {
        super(nome);
    }


    public void atracarBarco(Barco barco) {
        if (barco.getTamanho() <= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println("Barco " + barco.getNome() + " não pode atracar no " + nome + " (Tamanho grande demais).");
        }
    }

}