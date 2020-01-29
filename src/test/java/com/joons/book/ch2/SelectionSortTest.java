package com.joons.book.ch2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SelectionSortTest {

    @Test
    public void constantTimeTest() {
        int[] a = {7, 3, 9};
        System.out.println(Arrays.toString(a));
        SelectionSort.swapElements(a, 0, 1);
        assertEquals(3, a[0]);
        assertEquals(7, a[1]);
    }

    @Test
    public void linearTimeTest() {
        int[] a = {5, 3, 1, 2, 7, 3, 6, 9};
        int indexLowest = SelectionSort.indexLowest(a, 5);
        assertEquals(5, indexLowest);
        indexLowest = SelectionSort.indexLowest(a, 0);
        assertEquals(2, indexLowest);
    }

    @Test
    public void quadraticTimeTest() {
        int[] a = {5, 3, 1, 2, 7, 3, 6, 9};
        SelectionSort.selectionSort(a);
        System.out.println(Arrays.toString(a));
    }
}
