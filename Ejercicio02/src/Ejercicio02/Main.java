package Ejercicio02;
// 1
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
        int suma = listToNumberInvert(l1) + listToNumberInvert(l2);
        int[] resultado=new int[String.valueOf(suma).length()];
        for(int i=0;i<resultado.length;i++){
            resultado[resultado.length-i-1]=suma%10;
            suma/=10; 
        }
        return resultado;
    }
    static int listToNumberInvert(int[] l){
        int num=0;
        for(int i=0;i<l.length;i++){
            num+=l[i]*Math.pow(10, i);
        }
        return num;
    }
}