package ex2;

import java.util.ArrayList;

public class Agenda {
    public static void main(String[] args) {
        ArrayList<String> agenda = new ArrayList<String>();

        agenda.add("Caio, 11-95908823");
        agenda.add("Davi, 11-97065432");
        agenda.add("Joao Pedro, 11-96758493");

        System.out.println("Contatos: " + agenda);
        System.out.println("Numero de contatos: " + agenda.size());
        System.out.println("Removendo contato: " + agenda.remove(0));
        System.out.println("Lista atualizada: " + agenda);
        System.out.println("Removendo todos os contatos: ");
        agenda.clear();
        System.out.println(agenda);
    }

}
