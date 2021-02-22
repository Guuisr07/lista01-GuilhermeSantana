package ex5;

public class Data {
    int mes;
    int dia = 31;
    int ano = 365;

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirData(int mes, int dia, int ano) {
        System.out.println("Data: " + "" + mes + "/" + "" + dia + "/" + "" + ano);
    }

    public void calculoQuantidadeDias(int mes) {
        switch(mes) {
            case 2:
                dia -= 2;
            case 4: case 6: case 9: case 11:
                dia --;
        }
        int calc = ano - dia;
        System.out.println("A quantidade de dias ate o mes de " + mes + " e de " + calc);
    }
}
