import java.util.Scanner;

class WordReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();
        int beginIndex = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (sentence.charAt(i) == ' ' || sentence.charAt(i) == '.' || sentence.charAt(i) == '!'
                    || sentence.charAt(i) == '?' || i == sentence.length() - 1) {

                int endIndex = (i == sentence.length() - 1 && sentence.charAt(i) != ' ' && sentence.charAt(i) != '.'
                        && sentence.charAt(i) != '!' && sentence.charAt(i) != '?')
                                ? i + 1
                                : i;
                String word = sentence.substring(beginIndex, endIndex);
               if (!word.trim().isEmpty()) {
                    reverseString(word, word.length() - 1);
                } 
                if (i < sentence.length() - 1
                        && (sentence.charAt(i) == '.' || sentence.charAt(i) == '!' || sentence.charAt(i) == '?' ||  sentence.charAt(i) == ' ')) {
                    System.out.print(sentence.charAt(i));
                }
                beginIndex = i + 1;
            }
        }

        sc.close();
    }

    public static void reverseString(String word, int i) {
        if (i == -1) {
            return;
        }
        System.out.print(word.charAt(i));
        reverseString(word, i - 1);
    }
}
