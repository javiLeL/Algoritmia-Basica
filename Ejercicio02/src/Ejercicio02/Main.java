package Ejercicio02;

import java.util.Arrays;

/**
 * Main
 * @author Javier Gonzalo
 * @version  1.0
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(algoritmo(new int[]{2, 4, 3}, new int[]{5, 6, 4})));
    }
    public static int[] algoritmo(int[] l1, int[] l2){
        int[] resultado;
        int suma = listToNumberInvert(l1) + listToNumberInvert(l2);

        

        return new int[]{suma};
    }
    static int listToNumberInvert(int[] l){
        int num=0;
        for(int i=0;i<l.length;i++){
            num+=l[i]*Math.pow(10, i);
        }
        return num;
    }
}