import java.util.Scanner;

public class Contrasenya {

    public static void main(String[] args) {
     String inputPassword;  // crea variable password

        Scanner pass = new Scanner (System.in); // Creem Scanner

        System.out.print("Introudeix la contrasenya: ");      // Imprimim sol·licitud de contrasenya
        inputPassword = pass.next();            // input del password

        System.out.println(Validacio(inputPassword));   // Mètode Validacio para validar password
        System.out.println("");

        main(args);            

        pass.close();

    }

    public static String Validacio (String Password) {

        String resultat = "Contrasenya correcta!!";    // Resultat de password valido
        int length = 0;                     // Variable per la longitud de la contrasenya
        int numCount = 0;                   // Variable pel número de números utilitzats
        int upperCount = 0;                 // Variable pel número de lletres majúscules utilitzades
        int lowerCount = 0;                 // Variable pel número de lletres minúsucles utilitzades
        int simbolCount = 0;                // Variable pel número de símbols utilitzats

        for (int x =0; x < Password.length(); x++) {
            char caracter = Password.charAt(x);

            if (Character.isDigit(caracter)){
                numCount ++;
            }

            if (Character.isUpperCase(caracter)){
                upperCount ++;
            }

            if (Character.isLowerCase(caracter)){
                lowerCount ++;
            }

            if (x > 0 && x +1 < Password.length() && !(Character.isLetterOrDigit(caracter))){
                simbolCount ++;
            }

            length = (x + 1); // longitud total

        } // Final del bucle

        if (numCount < 2){              // Revisa que contingui al menys 2 números
            resultat = "La contrasenya ha de tenir al menys dos números!";
        }

        if (upperCount < 1) {             // Revisa que contingui al menys 1 lletra majúscula
            resultat = "La contrasenya ha de tenir al menys una lletra majúscula!";
        }

        if (lowerCount < 1) {             // Revisa que contingui al menys 1 lletra minúscula
            resultat = "La contrasenya ha de tenir al menys una lletra minúscula!";
        }

        if (simbolCount < 1) {             // Revisa que contingui al menys 1 símbol que no estigui ni al principi ni al final
            resultat = "La contrasenya ha de tenir al menys un caràcter especial que no estigui ni al principi ni al final!";
        }

        if (length < 10){                // Revisa la longitud mínima de 10 caràcters
            resultat = "La contrasenya ha de tenir una longitud mínima de 10 caràcters!";
        }

            return (resultat);         // Retorna el valor resultat

    }
}