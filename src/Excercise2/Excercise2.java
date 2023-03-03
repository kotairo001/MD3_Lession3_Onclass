package Excercise2;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        int[] array = {10, 4, 6, 8, 7};
        int[] newArray = new int[6];
        int x;
        int index;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Your array: " + Arrays.toString(array));
        System.out.println("Input the number you want to add");
        x = scanner.nextInt();
        System.out.println("Input the array's index you want to add");
        index = scanner.nextInt();
        if (index < -1 || index > array.length) {
            System.out.println("Can not add the number to that index");
        } else {
            for (int i = 0; i < index; i++) {
                newArray[i] = array[i];
            }
            for (int i = index; i <= array.length ; i++) {
                newArray[i] = array[i -1];
            }
            newArray[index-1] = x;
        }
        System.out.println(Arrays.toString(newArray));
    }
}
