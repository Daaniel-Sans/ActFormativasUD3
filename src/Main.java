import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("1. Imprime los números del 1 al 10.\n");

        int i =1;
        while(i<=10){
            System.out.println(i);
            i++;
        }

        System.out.println("\n");
        System.out.println("2. Imprime los números del 10 al 1\n");

        int ib =10;
        while(ib>=1){
            System.out.println(ib);
            ib--;
        }

        System.out.println("\n");
        System.out.println("3. Imprime la suma de los números del 1 al 10.\n");

        int ic = 1;
        int sum = 0;

        while (ic <= 10) {
            sum += ic;
            ic++;
            System.out.println(sum);
        }

        System.out.println("\n");
        System.out.println("4. Imprime los números del 1 al 20 saltando de 2 en 2.\n");

        int id = 1;
        while (id <= 20) {
            System.out.println(id);
            id += 2;
        }

        System.out.println("\n");
        System.out.println("5. Calcula el factorial del número 8\n");

        int ie = 8;
        int fact = 1;
        while(ie>1){
            fact = fact * ie;
            System.out.println(fact);
            ie--;
        }

        System.out.println("\n");
        System.out.println("6. Genera un número aleatorio entre 1 y 10" + "\n" + "y pide al usuario que introduzca un número." + "\n" + "Si acierta, imprime un mensaje de éxito." + "\n" + "Si no, imprime un mensaje de error" + "\n" + "y repite infinitamente hasta que acierte.\n" +
                "(" + "int aleatorio = new Random().nextInt(10) + 1" + ")" + "\n");

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int aleatorio = random.nextInt(10) + 1;
        int num;

        while (true) {
            System.out.print("Introduce un número entre 1 y 10: ");
            num = scanner.nextInt();

            if (num == aleatorio) {
                System.out.println("¡¡Correcto!! Has acertado 🎉🎉🎉😊");
                break;
            } else {
                System.out.println("¡¡Incorrecto!! ❌ Inténtalo de nuevo.");
            }
        }

        System.out.println("\n");
        System.out.println("7. Imprime los números divisibles entre 3 que hay entre el 1 y el 50.\n");

        //Según los ejercicios ahora debería usar if para nombrar la variable "i", pero usaré "ig" para evitar confusiones

        int ig = 1;

        while (ig <= 50) {
            if (ig % 3 == 0) {
                System.out.println(ig);
            }
            ig++;
        }
    }
}