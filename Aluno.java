public class Aluno {
    private final String nome;
    private final String ra;
    private  int provaDois;
    private  int provaUm;
    private  int trabalho;
    private double notaFinal;


    public Aluno(String nome, String ra, int provaDois, int provaUm, int trabalho) {
        this.nome = nome;
        this.ra = ra;
        this.provaDois = provaDois;
        this.provaUm = provaUm;
        this.trabalho = trabalho;

    }



    public void calcular() {
        notaFinal = ((provaUm * 3.5) + (provaDois * 3.5) + (trabalho * 3.0));
        System.out.println(notaFinal);

    }

    public void situacao() {

        if (notaFinal >= 70) {
            System.out.println("Aluno aprovado");
        } else {
            System.out.println("Aluno reprovado");
        }
    }


    @Override
    public String toString() {
        return "Nome: " + nome + " | R.A.: " + ra + " | Nota Final: " + notaFinal;
    }

    }



