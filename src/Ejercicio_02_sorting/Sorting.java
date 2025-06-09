package Ejercicio_02_sorting;

public class Sorting {
    public static void main(String[] args) {
        // Aquí puedes probar el código de ordenamiento
        // Por ejemplo, crear una pila y ordenar sus elementos
        controllers.Stack pila = new controllers.Stack();
        pila.push(5);
        pila.push(2);
        pila.push(3);
        pila.push(1);
        pila.push(4);

        System.out.println("Pila antes de ordenar:");
        pila.printStack();

        controllers.StackSorter.sort(pila);

        System.out.println("Pila después de ordenar:");
        pila.printStack();
    }
}
