package getter1;

import getter1.Studente;

public class StudenteMain {
    public static void main(String[] args) {
        Studente studente1 = new Studente(" Fabio ", " Genovese ",1);

        System.out.println("il nome dello studente1 è :" + studente1.getNome());

        System.out.println("il nome dello studente1 è cambiato in: " + studente1.setNome(" Giulio "));

        System.out.println("il cognome dello studente1 è:" + studente1.getCognome());

        System.out.println("il cognome dello studente1 è cambiato in:" + studente1.setCognome(" Marciante "));

        System.out.println("l'indentificativo dello studente1 è: " + studente1.getIdentificativo());

        System.out.println("i dati dello studente1 sono : " + studente1);
    }
}
