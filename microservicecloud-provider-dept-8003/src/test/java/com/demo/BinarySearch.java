package com.demo;

public class BinarySearch {
    public static void main(String[] args) {
//        int[] a = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] a = {9,8,7,6,5,4,3,2,1};
        int index = binarySearch(a, 0, a.length - 1, 6);
        System.out.println("index="+index);
    }

    /**
     * @param a 数组
     * @param left 左边下标索引
     * @param right 右边下标索引
     * @param findVal 要查找的值
     * @return 返回findVal对应的索引，-1代表找不到
     */
    public static int binarySearch(int[] a, int left, int right, int findVal) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right) / 2;
        int midVal = a[mid];
        if (findVal > midVal) {
            return binarySearch(a, mid + 1, right, findVal);
        }else if(findVal < midVal) {
            return binarySearch(a, left, mid - 1, findVal);
        }else {//findVal == midVal
            return mid;
        }
    }
}
