package ex6;

public class Tempo {
    int hora;
    int minutos;
    int segundos;

    Tempo() {
        hora = 0;
        minutos = 0;
        segundos = 0;
    }

    Tempo(int hora, int minutos, int segundos){
        System.out.println("Horario - " + "" + hora + ":" + "" + minutos + ":" + "" + segundos);
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinutos() {
        return minutos;
    }

    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public int getSegundos() {
        return segundos;
    }

    public void setSegundos(int segundos) {
        this.segundos = segundos;
    }

}
