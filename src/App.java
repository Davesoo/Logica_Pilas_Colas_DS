import java.util.Scanner;
import controllers.Stack;
import controllers.StackSorter;
import Ejercicio_01_sign.SignValidator;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc;

        do {
            System.out.println("\n---- MENÚ PRINCIPAL ----");
            System.out.println("1. Validar signos");
            System.out.println("2. Ordenar pila");
            System.out.println("3. Salir");
            System.out.print("Opción: ");
            opc = sc.nextInt();
            sc.nextLine();

            switch (opc) {
                case 1:
                    System.out.print("Ingresa expresión: ");
                    String expr = sc.nextLine();
                    boolean isValid = SignValidator.isValid(expr);
                    System.out.println("¿Signos válidos? " + isValid);
                    break;

                case 2:
                    Stack pila = new Stack();
                    pila.push(2);
                    pila.push(4);
                    pila.push(1);
                    pila.push(3);
                    pila.push(5);
                    pila.push(0);
                    pila.push(6);
                    pila.push(8);
                    pila.push(10);
                    pila.push(9);
                    pila.push(7);

                    System.out.println("Pila antes de ordenar:");
                    pila.printStack();

                    StackSorter.sort(pila);

                    System.out.println("Pila ordenada:");
                    pila.printStack();
                    break;
            }

        } while (opc != 3);

        sc.close();
        System.out.println("Programa finalizado.");
    }
}
