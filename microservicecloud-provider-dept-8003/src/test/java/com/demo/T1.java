package com.demo;

import org.junit.Test;

import java.util.Arrays;

public class T1 {
    @Test
    public void test5(){
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
//        int index = binarySearchNoRec(arr, 8);
        int index = binarySearchRecursion(arr, 0, arr.length - 1, 8);
        System.out.println(index);
    }

    private int binarySearchRecursion(int[] arr, int left, int right, int target) {
        if (right < left) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = arr[mid];
        if (midVal == target) {
            return mid;
        } else if (target > midVal) {
            return binarySearchRecursion(arr, mid + 1, right, target);
        } else {
            return binarySearchRecursion(arr, left, mid - 1, target);
        }
    }


    public int binarySearchNoRec(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left+right)/2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return -1;
    }

    @Test
    public void test4() {
        int[] arr = {1, 4, 7, 3, 9, 6, 5};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //sout
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ",");
        }
    }

    @Test
    public void test() {
        System.out.println(3 / 2);
    }

    @Test
    public void test3() {
        Integer[] arr = {4, 2, 7, 1, 9, 6};
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] < arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    @Test
    public void test2() {
        Integer[] arr = {4, 2, 7, 1, 9, 6};
        Arrays.sort(arr, (o1, o2) -> o1.compareTo(o2));
        for (Integer i : arr) {
            System.out.print(i);
        }
    }

    @Test
    public void test1() {
        int a = 100, b = 100, c = 666, d = 666;
        System.out.println(a == b);
        System.out.println(c == d);
    }
}
