import java.util.Stack;
import utils.SingValidator;
import utils.StackSorter;
import utils.QueuePalindrome;

public class App {

    public static void main(String[] args) throws Exception {
        runSignValidator();
        runStackSorter();
        runQueuePalindrome();

    }

    private static void runSignValidator() {
        SingValidator signValidator = new SingValidator();

        String cadena1 = "(([]{}))"; 
        String cadena2 = "{[((";  

        System.out.println("Ejercicio 01: Validación de Signos");
        System.out.println("Cadena: " + cadena1 + " | Resultado: " + signValidator.isValid(cadena1));
        System.out.println("Cadena: " + cadena2 + " | Resultado: " + signValidator.isValid(cadena2));
    }

    private static void runStackSorter() {
        Stack<Integer> stack = new Stack<>();

        stack.push(15);
        stack.push(8);
        stack.push(42);
        stack.push(4);
        stack.push(23);

        StackSorter sorter = new StackSorter();

        System.out.println("\nEjercicio 02: Ordenar Stack");
        System.out.println("Stack original: " + stack);

        sorter.sortStack(stack);

        System.out.println("Stack ordenado: " + stack);
        System.out.println("Tope esperado: " + stack.peek());
    }

    private static void runQueuePalindrome() {
        QueuePalindrome queuePalindrome = new QueuePalindrome();

        System.out.println("\nEjercicio 03: Palíndromo usando Colas");
        
        System.out.println("reconocer    | Resultado: " + queuePalindrome.isPalindrome("reconocer"));    
        System.out.println("somos        | Resultado: " + queuePalindrome.isPalindrome("somos"));        
        System.out.println("programacion | Resultado: " + queuePalindrome.isPalindrome("programacion")); 
    }
}
