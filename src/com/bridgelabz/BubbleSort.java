package com.bridgelabz;

/**
 * Program to Read the integer values using Bubble Sort Method
 * printed the result in sorted ordered list
 *
 * @author Sunil
 * @version 16.0
 * @since 23/08/2021
 */
public class BubbleSort {
    /*
     * Declaring Main Method Here
     * reading the Inetger Array
     * Printing the Array Before and after Sorting
     */
    public static void main(String[] args) {
        Integer[] intArray = getIntegerList();
        Utility.display(intArray, "Array List Before Sorting");
        applyBubbleSort(intArray);
        Utility.display(intArray, "Arrey List After Sorting");
    }

    /*
     * Method To Apply The Bubble Sort
     */
    private static void applyBubbleSort(Integer[] intArray) {
        int n = intArray.length;
        for (int i = 0; i < n - 1; i++)
            for (int j = 0; j < n - i - 1; j++)
                if (intArray[j] > intArray[j + 1]) {
                    int temp = intArray[j];
                    intArray[j] = intArray[j + 1];
                    intArray[j + 1] = temp;
                }
    }

    /*
    Method To Take The Position Values For Bubble Sorting
    Entering the Array Size and Values from User end
     */
    private static Integer[] getIntegerList() {
        System.out.println("Enter the Size of the int array: ");
        int size = Utility.getInteger();
        Integer[] intArray = new Integer[size];//Declaring Array
        //For Loop To Enter The Values Into Array
        for (int position = 0; position < intArray.length; position++) {
            System.out.println("Enter the int value for position " + position);
            intArray[position] = Utility.getInteger();//Taking The Position
        }
        return intArray;//Return intArray
    }
}
