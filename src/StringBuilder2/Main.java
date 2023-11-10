package StringBuilder2;

public class Main {
    public static void main(String[] args) {

        String word = "La macchina di filippo";

        String result = findUnicodeInWord(word, 7);

        System.out.println(result);
    }
    public static String findUnicodeInWord(String word, int index) {

        StringBuilder answer = new StringBuilder();

        if (index < 0 || index >= word.length()) {
            answer.append("errore");
        } else {
            answer.append(word.codePointAt(index));
        }
        return answer.toString();
    }
}