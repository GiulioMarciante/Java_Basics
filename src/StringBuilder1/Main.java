package StringBuilder1;
/*Scrivi un programma Java che abbia un metodo che prenda due stringhe e le compari lessico-graficamente.

Il metodo dovrà restituire "Le due stringhe sono uguali" o "Le due stringhe sono differenti" basandosi sul risultato del confronto.
Per la creazione della stringa di risultato dovrebbe essere utilizzato StringBuilder.*/
public class Main {
    public static void main(String[] args) {

        String word1 = "Patata e Banana";

        String word2 = "Patata ";

        System.out.println(compareWords(word1, word2));
    }

    public static String compareWords(String word1, String word2) {

        int result = word1.compareTo(word2);

        StringBuilder answer = new StringBuilder();
        answer.append("Le due stringhe sono ");

        if (result != 0) {
            answer.append("differenti");
        } else answer.append("uguali");

        return answer.toString();
    }
}
