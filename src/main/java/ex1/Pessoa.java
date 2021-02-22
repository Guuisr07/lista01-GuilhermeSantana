package ex1;

public class Pessoa {
    private String nome;
    private String dataNascimento;
    private double altura;
    private int anoAtual;
    private int anoNascimento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int getAnoAtual() {
        return anoAtual;
    }

    public void setAnoAtual(int anoAtual) {
        this.anoAtual = anoAtual;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public void mostrarDados(String nome, String dataNascimento, double altura) {
        System.out.println("O nome e " + nome + " e a data de nascimento: " + dataNascimento + " e altura " + altura);
    }

    public void calcularIdade(int anoAtual, int anoNascimento) {
        System.out.println("Idade e " + (anoAtual - anoNascimento));
    }

}
