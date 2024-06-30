import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual a nota 1? ");
        double nota1 = scanner.nextInt();

        System.out.print("Qual a nota 2? ");
        double nota2 = scanner.nextInt();

        System.out.print("Qual a nota 3? ");
        double nota3 = scanner.nextInt();

        double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("A média do aluno é: " + media);
    }
}