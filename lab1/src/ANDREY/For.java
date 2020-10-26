package ANDREY;

import java.lang.*;

public class For {
    private int[] arguments;
    private int summa;
    private int counter = 0;

    public For (int[] arguments) {
        this.arguments = arguments;
    }

    public int printFor() {
        summa = 0;
        for (int i = 0; i < arguments.length; i++) {
            summa = summa + arguments[i];
        }
        return summa;
    }

    public int printWhile() {
        counter = 0;
        summa = 0;
        while (counter < arguments.length) {
            summa = summa + arguments[counter];
            counter++;
        }
        return summa;
    }

    public int printDo() {
        counter = 0;
        summa = 0;
        do {
            summa = summa + arguments[counter];
            counter++;
        } while (counter < arguments.length);
        return summa;
    }
}
