package Ejercicio02;

/*
 * Se le proporcionan dos listas enlazadas no vacías que representan dos números enteros no negativos. Los dígitos se almacenan
 * en orden inverso y cada uno de sus nodos contiene un solo dígito. Suma los dos números y devuelve la suma como una lista
 * vinculada. Puedes asumir que los dos números no contienen ningún cero a la izquierda, excepto el propio número 0.
 * 
 * Example 1:
 * Input l1={2, 4, 3}; ls={5, 6, 4}
 * Output {7, 0, 8}
 * 
 * Example 2:
 * Input l1={0}, l2={0}
 * Output {0}
 * 
 * Example 3:
 * Input l1={9, 9, 9, 9, 9, 9, 9}; l2={9, 9, 9, 9}
 * Output {8, 9, 9, 9, 0, 0, 0, 1}
 */


import java.util.Arrays;

/**
 * Main
 * @author Javier Gonzalo
 * @version  1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(algoritmo(new int[]{9, 9, 9, 9, 9, 9, 9}, new int[]{9, 9, 9, 9})));
    }

    /**
     * Metodo que pide el enunciado
     * @param l1
     * @param l2
     * @return
     */
    public static int[] algoritmo(int[] l1, int[] l2){
        int suma = listToNumberInvert(l1) + listToNumberInvert(l2);
        int[] resultado=new int[String.valueOf(suma).length()];
        for(int i=0;i<resultado.length;i++){
            resultado[i]=suma%10;
            suma/=10; 
        }
        return resultado;
    }
    /**
     * Metodo capaz de pasar la lista a su numero invertido es decir de la lista {1, 2, 3} -> 321
     * @param l
     * @return
     */
    static int listToNumberInvert(int[] l){
        int num=0;
        for(int i=0;i<l.length;i++){
            num+=l[i]*Math.pow(10, i);
        }
        return num;
    }
}