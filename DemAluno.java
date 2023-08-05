import java.util.Scanner;

public class DemAluno {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Entre com o nome do aluno: ");
        String nome = ler.next();

        System.out.println("Entre com o RA (registro academico)");
        String RA = ler.next();

        int provaUm, provaDois, trabalho;

        provaUm = solicitarNota(ler, "primeira prova");
        provaDois = solicitarNota(ler, "segunda prova");
        trabalho = solicitarNota(ler, "trabalho");

        Aluno aluno = new Aluno(nome, RA, provaDois, provaUm, trabalho);

        aluno.calcular();
        aluno.situacao();
        System.out.println(aluno);

        ler.close();
    }

    private static int solicitarNota(Scanner ler, String prova) {
        int nota;
        do {
            System.out.println("Entre com a nota da " + prova + " (entre 0 e 10): ");
            nota = ler.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Valor inválido! A nota deve estar entre 0 e 10.");
            }
        } while (nota < 0 || nota > 10);
        return nota;
    }
}
