package StringBuilder2;

public class Main {
    public static void main(String[] args) {

        String word = "La macchina di filippo";

        int index = 5;

        StringBuilder result = findUnicodeInWord(word, index);

        System.out.println(result);
    }

    public static StringBuilder findUnicodeInWord(String word, int index) {

        StringBuilder answer = new StringBuilder();

        if (index < 0 || index >= word.length()) {
            answer.append("errore");
        } else {
            answer.append(word.codePointAt(index));
        }
        return answer;
    }
}