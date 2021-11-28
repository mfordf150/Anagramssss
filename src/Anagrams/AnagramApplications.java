package Anagrams;
//ua.com.foxminded.anagrams;
//ua.com.foxminded.anagrams
import java.util.Scanner;

    public class AnagramApplications {

        private static final String INPUT_MESSAGE = "Input string to reverse:";
        private static final String OUTPUT_MESSAGE = "Reversed string: ";

        public static void main(String[] args) {
            Reverses reverses = new Reverses();
            String text = readText();
            String reversedText = reverses.reverseText(text);
            System.out.println(OUTPUT_MESSAGE + reversedText);
        }

        public static String readText() {
            try (Scanner in = new Scanner(System.in)) {
                System.out.println(INPUT_MESSAGE);
                return in.nextLine();
            }
        }

    }


