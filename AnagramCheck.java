import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first word:");
        String s1 = input.nextLine();
        System.out.println("Enter the second word:");
        String s2 = input.nextLine();
        AnagramCheck(s1, s2); 
    }

    public static void AnagramCheck(String a, String b) {
        if (a.length() != b.length()) {
            System.out.println("They are not anagrams.");
            return; 
        }
        char[] sen1 = new char[a.length()];
        char[] sen2 = new char[b.length()];
        for (int i = 0; i < a.length(); i++) {
            sen1[i] = a.charAt(i);
        }
        for (int i = 0; i < b.length(); i++) {
            sen2[i] = b.charAt(i);
        }
        Arrays.sort(sen1);
        Arrays.sort(sen2);
        for (int i = 0; i < sen1.length; i++) {
            if (sen1[i] != sen2[i]) {
                System.out.println("They are not anagrams.");
                return; 
            }
        }
        System.out.println("They are anagrams.");
    }
}
