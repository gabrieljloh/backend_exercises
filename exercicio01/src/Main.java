import java.util.Scanner;

public class  Main {
    public static void main(String[] args) {
        String[] listaFilmes = {"Homens de Preto", "Arrival", "Shrek", "Gladiador"};

        Scanner leitor = new Scanner(System.in);

        System.out.println("Que ambientacao voce prefere?");
        System.out.println("1- sci fi");
        System.out.println("2- medieval");
        Integer opcaoAmbientacao = leitor.nextInt();

        if (opcaoAmbientacao != 1 && opcaoAmbientacao != 2)
            return;

        System.out.println("Que genero voce prefere?");
        System.out.println("1- comedia");
        System.out.println("2- drama");
        Integer opcaoGenero = leitor.nextInt();

        if (opcaoGenero != 1 && opcaoGenero != 2)
            return;

        Integer index = (opcaoAmbientacao - 1) * 2 + (opcaoGenero - 1);

        System.out.println(listaFilmes[index]);
    }
}