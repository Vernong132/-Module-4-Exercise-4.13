import java.util.Scanner;

public class VowelChecker {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        // Prompt user to input a letter 
        System.out.print("Please enter a letter: ");
        String letter = input.nextLine();
        char alpha = letter.charAt(0);

        if (Character.isLetter(alpha))
        {
            switch(Character.toUpperCase(alpha))
            {
                case 'A': System.out.println(alpha + " is a Vowel"); break;
                case 'E': System.out.println(alpha + " is a Vowel"); break;
                case 'I': System.out.println(alpha + " is a Vowel"); break;
                case 'O': System.out.println(alpha + " is a Vowel"); break;
                case 'U': System.out.println(alpha + " is a Vowel"); break;
                default : System.out.println(alpha + " is a Consonant");
                
            }
        }
        else {
            System.out.println(alpha + " is an invalid input");
        }
            input.close();


    }
}
// Pseudocode
// START
    // DECLARE input (Scanner)
    
    // PRINT "Please enter a letter: "
    // READ letter from input

    // EXTRACT the first character from letter into alpha

    // IF alpha is a letter THEN
        // CONVERT alpha to uppercase (alpha = Character.toUpperCase(alpha))

        // SWITCH (alpha):
            // CASE 'A':
                // PRINT alpha + " is a Vowel"
                // BREAK
            // CASE 'E':
                // PRINT alpha + " is a Vowel"
                // BREAK
            // CASE 'I':
                // PRINT alpha + " is a Vowel"
                // BREAK
            // CASE 'O':
                // PRINT alpha + " is a Vowel"
                // BREAK
            // CASE 'U':
                // PRINT alpha + " is a Vowel"
                // BREAK
            // OTHERS            
                // DEFAULT:
                // PRINT alpha + " is a Consonant"
        // END SWITCH

    // ELSE
        // PRINT alpha + " is an invalid input"
    // END IF

    // CLOSE input
// END
