package utils;

import java.util.Stack;

public class StackSorter {
//a
    public void sortStack(Stack<Integer> stack){

        Stack<Integer> ordenar = new Stack<>();

        while(!stack.isEmpty()){
            int aux = stack.pop();

            while(!ordenar.isEmpty() && ordenar.peek()>aux){
                stack.push(ordenar.pop());
            }
            ordenar.push(aux);
        }

        while (!ordenar.isEmpty()) {
            stack.push(ordenar.pop());
        }
    }

    
}
