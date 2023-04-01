import java.util.Scanner;

public class Main {
        public static void main(String[] args){
            System.out.println("Palindrome Checker \nInsert sentences or numbers here:");
            Scanner scan = new Scanner(System.in);
            String value = scan.nextLine();

            ListStack stack = new ListStack();
            ListStack stackSample = new ListStack();
            ListStack stackReversed = new ListStack();
            verifyPalindrome verification = new verifyPalindrome();

            System.out.println("The string '"+value+"' is "+(verification.stack(value, stack, stackSample, stackReversed)? "": "not ")+"palindrome.");

    }
}
