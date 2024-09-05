package org.example;

public class PortoGrande extends BasePorto{

    public PortoGrande(String nome) {
        super(nome);
    }


    public void atracarBarco(Barco barco) {
        if (barco.getTamanho() >= 10) {
            super.atracarBarco(barco);
        } else {
            System.out.println("Barco " + barco.getNome() + " não pode atracar no " + nome + " (Tamanho pequeno demais).");
        }
    }
}
