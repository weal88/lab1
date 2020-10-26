package ANDREY;

import java.lang.*;
// Вывести на экран сумму чисел массива с помощью циклов for, while, do while

public class Test {
     public static void main(String[] args) {

        int[] massiv = new int[]{15, 47, 24, 9, 1, 44, 80, 7, 2, 54};

        For ac1 = new For(massiv);
        System.out.println(ac1.printFor());
        System.out.println(ac1.printWhile());
        System.out.println(ac1.printDo());
    }
}
