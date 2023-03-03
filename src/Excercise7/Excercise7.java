package Excercise7;

import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        int [][] array = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int total=0;
        for (int i = 0; i < array.length; i++) {
            total+=array[i][i];
        }
        System.out.println("Total: " + total);
    }
}
