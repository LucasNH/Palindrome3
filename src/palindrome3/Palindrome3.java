/*
 * Author: Lucas Noritomi-Hartwig
 * Date created: February 21, 2020
 * Date last edited: February 21, 2020
 * Program title: Palindrome3.java
 * This program will allow the user to enter a phrase
 * and determine if the phrase is a palindrome.
 */
package palindrome3;

import javax.swing.JOptionPane;

public class Palindrome3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Prompting user for input string
        String input = JOptionPane.showInputDialog("Words that are the same "
                + "forwards and backwards are called palindromes.\nThis program"
                + " determines if a phrase is a palindrome.\n\nEnter a phrase(do"
                + " not include a punctuation mark):");

        // Removing spaces from input before reversal
        String inputWOSpaces = input.replaceAll(" ", "");

        // Reversing input string
        String reversed = "";
        for (int j = inputWOSpaces.length() - 1; j >= 0; j--) {
            reversed += inputWOSpaces.charAt(j);
        }

        // Ignoring lower and uppercase
        String inputLower = inputWOSpaces.toLowerCase();
        String reversedLower = reversed.toLowerCase();

        // Outputting whether the input string is palindromic or not
        if (inputLower.equals(reversedLower)) {
            JOptionPane.showMessageDialog(null, input + " IS a palindrome");
        } else {
            JOptionPane.showMessageDialog(null, input + " is NOT a palindrome");
        }
    }

}
