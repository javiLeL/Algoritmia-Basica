package main;
/*
 * Dada una cadena s, encuentre la longitud de la subcadena más larga sin caracteres repetidos.
 * 
 * Example 1:
 * Input: abcabcbb
 * Output: 3
 * 
 * Example 2:
 * Input: bbbbb
 * Output: 1
 * 
 * Example 3:
 * Imput: pwwkew
 * Output: 3
 */

/**
 * Main
 * @author javier
 * @version 1.0.2
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(algoritmo("abcabdbb"));
    }
    /**
     * Metodo que alberga el algoritmo solicitado
     */
    public static int algoritmo(String s){
        int aux = 0, resultado = 0;
        for(int i=1;i<s.length();i++){
            while (isRepetido(s.substring(aux, i))) {
                aux+=1;
            }
            resultado = resultado<=s.substring(aux, i).length()?s.substring(aux, i).length():resultado;
            System.out.println(s.substring(aux, i));
        }
        return resultado;
    }
    /**
     * Metodo que busca que ningun caracter se repita en el String que se le pasa.
     * @param s
     * @return
     */
    public static boolean isRepetido(String s){
        for (int i = 0; i < s.length(); i++) {
            for (int j = i; j < s.length(); j++) {
                if(s.charAt(i)==s.charAt(j) && i!=j){
                    return true;
                }
            }
        }
        return false;
    }
}