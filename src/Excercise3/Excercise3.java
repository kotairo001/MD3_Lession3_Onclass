package Excercise3;

import java.util.Arrays;
import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        int array1Size = 2;
        int [] array1 = new int[array1Size];
        int array2Size = 3;
        int [] array2 = new int[array2Size];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Array number 1");
        for (int i = 0; i < array1.length; i++) {
            System.out.println("Input number " + (i+1));
            array1[i] = scanner.nextInt();
        }
        System.out.println("Array number 2");
        for (int i = 0; i < array2.length; i++) {
            System.out.println("Input number " + (i+1));
            array2[i] = scanner.nextInt();
        }
        int [] array3 = new int[array1Size+array2Size];
        for (int i = 0; i < array1.length; i++) {
            array3[i] = array1[i];
        }
        for (int i = 0; i < array2.length; i++) {
            array3[array1Size+i] = array2[i];
        }
        System.out.println(Arrays.toString(array3));
    }


}
