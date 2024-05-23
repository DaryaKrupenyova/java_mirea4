package  prac1_package;

import java.lang.*;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Main arr_sort = new Main();
        Scanner scan = new Scanner(System.in);

        System.out.print("Введите кол-во элементов: ");
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++){
            arr[i] = scan.nextInt();
        }

        System.out.print("Введённый массив: ");
        arr_sort.arr_print(arr);

        arr_sort.sorting(arr);

        System.out.print("Отсортированный массив: ");
        arr_sort.arr_print(arr);

        /*
        Тест:
        7
        100 34 -67 0 3 -2900 11
        */
    }
}
