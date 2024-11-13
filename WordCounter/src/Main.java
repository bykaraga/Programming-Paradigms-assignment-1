import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String text = scanner.nextLine();

        System.out.println("Word count: " + countWords(text));
        System.out.println("Character count: " + countCharacters(text));
        System.out.println("Longest word: " + findLongestWord(text));
        System.out.println("Word frequencies: " + wordFrequency(text));
        scanner.close();
    }

    public static int countWords(String text) {
        return text.split(" ").length;
    }

    public static int countCharacters(String text) {
        return text.replace(" ", "").length();
    }

    public static String findLongestWord(String text) {
        String[] words = text.split(" ");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) longestWord = word;
        }
        return longestWord;
    }

    public static Map<String, Integer> wordFrequency(String text) {
        Map<String, Integer> frequencies = new HashMap<>();
        for (String word : text.split(" ")) {
            frequencies.put(word, frequencies.getOrDefault(word, 0) + 1);
        }
        return frequencies;
    }
}