package utils;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class SingValidator {

    
     public boolean isValid(String a) {
        
        Stack<Character> pilaAbierto = new Stack<>();

        for (char letra : a.toCharArray()) {
            if (letra == '(' || letra == '[' || letra == '{'){
                pilaAbierto.push(letra);
            }else{
                if (pilaAbierto.isEmpty()) {
                    return false;
                }
                char abierto = pilaAbierto.pop();
                if ((letra == ')' && abierto != '(') ||
                (letra == ']' && abierto != '[') ||
                (letra == '}' && abierto != '{')) {
                return false;
            }
            }

        }
        return true;

      }  

}
