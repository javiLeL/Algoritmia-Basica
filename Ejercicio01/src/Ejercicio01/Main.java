package Ejercicio01;
/*
 * Dada una matriz de números enteros y un objetivo entero, devuelva índices de los dos números de manera que sumen el objetivo. 
 * Puede suponer que cada entrada tendría exactamente una solución y no puede utilizar el mismo elemento dos veces. 
 * Puede devolver la respuesta en cualquier orden.
 * 
 * Example 1:
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 * 
 * Example 2:
 * Input: nums = [3,2,4], target = 6
 * Output: [1,2]
 * 
 * Example 3:
 * Input: nums = [3,3], target = 6
 * Output: [0,1]
 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
/**
 * main
 * @author Javier Gonzalo
 * @version  1.0
 */
public class Main {
    public static void main(String[] args) {
        List <Integer> nums = new ArrayList<>();
        int numero, count = 1;
        do{
            System.out.print("Introduzca el "+count+"º numero de la cadena: ");
            numero = new Scanner(System.in).nextInt();
            if(numero!=0){
                nums.add(numero);
                count++;
            }
        }while(numero!=0);
        System.out.println(nums);
        System.out.print("Introduzca un target: ");
        int suma = new Scanner(System.in).nextInt();
        
        int[] respuesta;
        if((respuesta=buscarSuma(nums, suma)) != null){
            System.out.println(Arrays.toString(respuesta));
        }else{
            System.out.println("Error no se encuentra ninguna suma");
        }
    }
    public static int[] buscarSuma(List <Integer> nums, int suma){
        for(int i=0;i<nums.size();i++){
            for(int j=i;j<nums.size();j++){
                if(nums.get(i)+nums.get(j)==suma && i!=j){
                    return new int[]{i, j};
                }
            }
        }
        return null;
    }
}