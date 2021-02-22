package ex3;

public class Aluno {
    int matricula;
    String nome;
    double notaProva1;
    double notaProva2;
    double notaTrabalho;
    double media;

    public void mostrarAluno(String nome, int matricula) {
        System.out.println("Aluno: " + nome + "\nMatricula: " + matricula);
    }

    public void calculoMedia(double notaProva1, double notaProva2, double notaTrabalho) {
        media = (notaProva1 + notaProva2 + notaTrabalho) / 3;
        System.out.println("Media do aluno: " + media);
    }

    public void situacaoAluno() {
        if(media >= 6) {
            System.out.println("Aluno aprovado!");
        }else if(media >= 4 && media <= 6) {
            System.out.println("Aluno de IFA!");
        }else {
            System.out.println("Aluno reprovado!");
        }
    }
}
