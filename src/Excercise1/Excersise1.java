package Excercise1;

import java.util.Arrays;
import java.util.Scanner;

public class Excersise1 {
    public static void main(String[] args) {
        int [] array = {10,4,6,7,8};
        Scanner scanner = new Scanner(System.in);
        int X;
        int index_del = 0;
        System.out.println(Arrays.toString(array));
        System.out.println("Input the number you want to delete");
        X = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==X) {
                index_del = i;
                break;
            }
        }
        for (int j = index_del; j < array.length; j++) {
            System.out.println(j);
            if (j != array.length -1) {
                array[j]=array[j+1];
            } else {
                array[j] = 0;
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
