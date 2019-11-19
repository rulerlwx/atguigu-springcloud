package com.demo;

public class BinarySearchNoRec {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9, 25, 68, 88, 90};
        int index = binarySearchNoRec(arr, -88);
        System.out.println(index);
    }

    /**
     *
     * @param arr 数组，升序
     * @param target 要查找的数
     * @return 对应下标，-1表示没找到
     */
    public static int binarySearchNoRec(int[] arr,int target){
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
}
