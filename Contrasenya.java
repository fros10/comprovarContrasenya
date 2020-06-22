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
        int letCount = 0;                   // Variable pel número de lletres utilitzades

        for (int x =0; x < Password.length(); x++) {
            char caracter = Password.charAt(x);

            if (Character.isDigit(caracter)){
                numCount ++;
            }

            if (Character.isLetter(caracter)){
                letCount ++;
            }

            length = (x + 1); // longitud total

        } // Final del bucle

        if (numCount < 1){              // Revisa que contingui al menys 1 número
            resultat = "La contrasenya ha de tenir al menys un número!";
        }

        if (letCount < 1) {             // Revisa que contingui al menys 1 lletra
            resultat = "La contrasenya ha de tenir al menys una lletra!";
        }

        if (length < 8){                // Revisa la longitud mínima de 8 caràcters
            resultat = "La contrasenya ha de tenir una longitud mínima de 8 caràcters!";
        }

            return (resultat);         // Retorna el valor resultat

    }
}