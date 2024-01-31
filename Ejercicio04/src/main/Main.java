package main;
/*
 * Dada una cadena s, devuelve la subcadena palindrómica más larga en s.
 * 
 * Example 1:
 * Input s = "babad"
 * Output "bab"
 * 
 * Example 2:
 * Input: s = "cbbd"
 * Output: "bb"
 */

/**
 * Main
 * @author JaviLeL
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(algoritmo("cbawbwabd"));
    }
    static String algoritmo(String s){
        String resultado = s.length()==1?s:"";
        
        for(int i=0;i<s.length();i++){
            int ultimo;
            int aux = s.length();
            while((ultimo = s.lastIndexOf(s.charAt(i), aux))!=i){
                String palabraEncontrada = s.substring(i, ultimo+1);
                if (isPalndroma(palabraEncontrada) && palabraEncontrada.length()>resultado.length()) {
                    resultado = palabraEncontrada;
                    break;
                }
                aux = ultimo-1;
            }
        }
        return resultado;
    }
    static boolean isPalndroma(String s){
        for(int i=0;i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }
}