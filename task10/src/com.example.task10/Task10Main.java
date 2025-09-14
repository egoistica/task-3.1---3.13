package com.example.task10;

import java.util.Arrays;

public class Task10Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:

        int[] arr = {5, 4, -7, 2};
        System.out.println(numMin(arr));

    }

    static int numMin(int[] arr) {

        int num = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<=num) {
                num = arr[i];
                index = i;
            }
        }
        return index;
    }

}