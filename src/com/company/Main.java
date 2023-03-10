package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int getRandom(int min, int max) {                     //Функция для рандомных чисел в диапазоне от min до max
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public static void main(String[] args) {
	    int [][] array = new int[10][10];
	    byte [] arrayNum = new byte[array.length * array[0].length];
        int num = getRandom(1, array.length * array[0].length);

        for (int i = 0; i < arrayNum.length; i++) {         //Зполнение массива для отслефивания повторения чисел
            arrayNum[i] = 1;
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                while (arrayNum[num - 1] < 1) num = getRandom(1, array.length * array[0].length);

                array[i][j] = num;
                arrayNum[num - 1] = 0;

            }
        }

        System.out.println(Arrays.toString(arrayNum));

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print(array[i][j] + ", ");
            }
            System.out.println();
        }


        


    }
}
