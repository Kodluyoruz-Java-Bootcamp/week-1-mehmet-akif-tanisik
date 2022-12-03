package week1.question9;

import java.util.ArrayList;

public class MyList {

    /**
     * Default initial capacity.
     */
    private static final int DEFAULT_CAPACITY = 5;

    /**
     * The size of the String List (the number of elements it can contains).
     */
    private int maxNumberElements;

    /**
     * Shared empty String array instance used for empty instances.
     */
    private String[] a;

    /**
     * Number of indices currently in use.
     */
    private int numberUsed; // Default to 0

    /**
     * Constructs an empty list with an initial capacity of five.
     * Default number of indices currently in use is zero.
     */
    public MyList() {
        maxNumberElements = DEFAULT_CAPACITY;
        a = new String[maxNumberElements];
        numberUsed = 0;
    }

    /**
     * This method is helper method to increase the size of the String List by 7.
     */
    private void increaseCapacity() {
        String[] temp = new String[maxNumberElements + 7];

        setMaxNumberElements(maxNumberElements + 7);

        for (int i = 0; i < a.length; i++) {
            temp[i] = a[i];
        }
        this.a = temp;
    }

    /**
     * Precondition: First letter of the passing argument should be 'C' or 'c'.
     * Precondition: String list should have empty space to store new String object.
     * This method adds new String object to the String List.
     *
     * @param newElement is a String object that will be stored in String List.
     */
    public void add(String newElement) {

        if (newElement.substring(0, 1).equalsIgnoreCase("C")) {

            if (isFull()) {
                increaseCapacity();
            }

            a[numberUsed] = newElement;
            numberUsed++;
        }

    }

    /**
     * Helper method to set new capacity if the array will grow its capacity
     * @param maxNumberElements is a new capacity of an array
     */
    private void setMaxNumberElements(int maxNumberElements) {
        this.maxNumberElements = maxNumberElements;
    }

    /**
     * This method checks if the number of indices elements are equal to the current size o the String List.
     *
     * @return true if String list indices are fully used, false otherwise.
     */
    public boolean isFull() {
        return (numberUsed == maxNumberElements);
    }

    /**
     * This method simply returns the capacity of String List.
     * @return maximum number of elements that String List can store
     */
    public int getMaxCapacity() {
        return maxNumberElements;
    }

    /**
     * This method prints out the all elements that are in String list.
     * If the index is not storing any String object then it does not print that index element.
     */
    public void print() {
        for (int i = 0; i < numberUsed; i++) {
            System.out.println(a[i]);
        }
    }
}