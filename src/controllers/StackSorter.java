package controllers;

public class StackSorter {
    public static void sort(Stack original) {
        Stack temp = new Stack();

        while (!original.isEmpty()) {
            int current = original.pop();

            // Mover elementos más grandes de temp a original
            while (!temp.isEmpty() && temp.peek() > current) {
                original.push(temp.pop());
            }

            temp.push(current);
        }

        // Devolver los elementos a la pila original
        while (!temp.isEmpty()) {
            original.push(temp.pop());
        }
    }
}
