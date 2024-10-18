package org.example;

import java.util.Scanner;

import static java.lang.Integer.parseInt;
import java.util.ArrayList;

import geometry2d.Circle;
import geometry2d.Rectangle;
import geometry3d.Cylinder;


public class Main {
    // Task 1 ====================================================================================================
    static class Button {
        int clicksDone;

        void click() {
            clicksDone++;
            System.out.println(clicksDone);
        }
    }

    // Task 2 ====================================================================================================
    static class Balance {
        int leftWeight = 0;
        int rightWeigh = 0;

        void addLeft() {
            leftWeight += numberInput("Добавление веса в левую чашу");
        }
        void addRight() {
            rightWeigh += numberInput("Добавление веса в правую чашу");
        }

        void result() {
            if (leftWeight > rightWeigh) {
                System.out.println("L");
            }
            else if (rightWeigh > leftWeight) {
                System.out.println("R");
            }
            else {
                System.out.println("=");
            }
        }
    }

    static int numberInput(String message) {
        String output;

        System.out.println(message);
        Scanner input = new Scanner(System.in);

        do {
            output = input.nextLine();
        }
        while (!inputFilter(output));

        return parseInt(output);
    }

    static boolean inputFilter(String input) {
        try {
            parseInt(input);
            return true;
        }
        catch (NumberFormatException e) {
            System.out.println("Введенное значение не воспринимается как числовое, введите другое значение");
            return false;
        }
    }

    // Task 3 ====================================================================================================
    static class Bell {
        boolean cycle = true;

        void sound() {
            if (cycle) {
                System.out.println("ding");
                cycle = false;
            }
            else {
                System.out.println("dong");
                cycle = true;
            }
        }
    }

    // Task 4 ====================================================================================================
    static class OddEvenSeparator {
        ArrayList<Integer> daNumbers = new ArrayList<Integer>();

        void addNumber() {
            daNumbers.add(numberInput("Введите следующее число"));
        }

        void odd() {
            for (int daNumber : daNumbers) {
                if (daNumber % 2 == 1) {
                    System.out.println(daNumber);
                }
            }
        }

        void even() {
            for (Integer daNumber : daNumbers) {
                if (daNumber % 2 == 0) {
                    System.out.println(daNumber);
                }
            }
        }
    }

    // Task 5 ====================================================================================================
    static class Table {
        int[][] tableArray = new int
                [numberInput("Введите число строк")]
                [numberInput("Введите число столбцов")];

        void initializeTable() {
            for (int[] row : tableArray)
                for (int value : row) {
                    value = 0;
                }
        }

        void getValue(int row, int column) {
            System.out.println("В ячейке [" + row + "][" + column + "] значение " + tableArray[row][column]);
        }
        void setValue(int row, int column, int value) {
            tableArray[row][column] = value;
        }
        int rows() {
            return tableArray[0].length;
        }
        int columns() {
            return tableArray[1].length;
        }
        String[][] tableToString() {
            String[][] output = new String
                    [tableArray[0].length]
                    [tableArray[1].length];

            for (int row = 0; row < tableArray[0].length; ++row)
                for (int column = 0; column < tableArray[1].length; ++column) {
                    output[row][column] = Integer.toString(tableArray[row][column]);
                }

            return output;
        }

        double average() {
            double sum = 0;

            for (int[] row : tableArray)
                for (int value : row) {
                    sum += value;
                }

            return sum / tableArray[0].length * tableArray[1].length;
        }

    }

    public static void main(String[] args) {

    }
}