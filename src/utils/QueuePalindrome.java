package utils;
import java.util.LinkedList;
import java.util.Queue;
public class QueuePalindrome {
    
    public boolean isPalindrome(String text){

        Queue<Character> colaOriginal = new LinkedList<>();
        Queue<Character> colaORevertida = new LinkedList<>();

        for (int i = 0; i < text.length(); i++) {
            colaOriginal.offer(text.charAt(i));   
        }

        for (int i = 0; i < text.length(); i++) {
            char letra = text.charAt(i); 
            int tamano = colaORevertida.size();
            colaORevertida.offer(letra);

            for (int j = 0; j < tamano; j++) {
            char letraMovida = colaORevertida.poll(); 
            colaORevertida.offer(letraMovida); 
            }
        }

        while (!colaOriginal.isEmpty()) {
            char letraO = colaOriginal.poll();
            char letraR = colaORevertida.poll();

            if(letraO!=letraR){
                return false;
            }
            
        }
            return true;
        }       
       
        
    }

