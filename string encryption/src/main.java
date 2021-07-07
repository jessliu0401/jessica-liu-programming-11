import java.util.Scanner;

public class main {
        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);
            System.out.println("Input : ");
            String input = (scan.next());

            String output = encrypt(input);
            System.out.println("Encrypted Input: " + output);

            input = decrypt(output);
            System.out.println("Original Input: " + input);

        }

        public static String encrypt(String line) {

            char ch = line.charAt(line.length() - 1);

            String word = line.substring(0, line.length() - 1);

            String newWord = ch + word + "ay";
            return newWord;
        }

        public static String decrypt(String word) {

            String sub = word.substring(1, word.length() - 2);

            String newWord = sub + word.charAt(0);
            return newWord;

        }
    }

