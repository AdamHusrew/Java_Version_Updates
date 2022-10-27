package org.cydeo;

public class ArraySorting {
    public static void main(String[] args) {


        ArraySorting as = new ArraySorting();
        as.sort(new QuickSort());
        as.sort(new BubbleSort());

    }

    private void sort(Sorting sorting){
        sorting.sort();
    }
}