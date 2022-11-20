package com.aditya.arrays;

import java.util.ArrayList;

public class LinearSearch {
    static ArrayList<Integer> list = new ArrayList();

    public LinearSearch() {
    }

    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, 6, 7, 1, 8, 8, 2};
        System.out.println(findIndex(arr, 0, 0));
    }

    static boolean isTrue(int[] arr, int index, int target) {
        if (arr[index] == target) {
            return true;
        } else {
            return index == arr.length - 1 ? false : isTrue(arr, index + 1, target);
        }
    }

    static boolean isTrue2(int[] arr, int index, int target) {
        if (index == arr.length) {
            return false;
        } else {
            return arr[index] == target || isTrue2(arr, index + 1, target);
        }
    }

    static int findIndex(int[] arr, int index, int target) {
        if (index == arr.length) {
            return -1;
        } else {
            return arr[index] == target ? index + 1 : findIndex(arr, index + 1, target);
        }
    }

    static int findIndexLast(int[] arr, int index, int target) {
        if (index == -1) {
            return -1;
        } else {
            return arr[index] == target ? index : findIndexLast(arr, index - 1, target);
        }
    }

    static void findAllIndex(int[] arr, int index, int target) {
        if (index != arr.length) {
            if (arr[index] == target) {
                list.add(index);
            }

            findAllIndex(arr, index + 1, target);
        }
    }

    static ArrayList<Integer> findAllIndex1(int[] arr, int index, int target, ArrayList<Integer> ans) {
        if (index == arr.length) {
            return ans;
        } else {
            if (arr[index] == target) {
                ans.add(index);
            }

            return findAllIndex1(arr, index + 1, target, ans);
        }
    }

    static ArrayList<Integer> findAllIndex2(int[] arr, int index, int target) {
        ArrayList<Integer> list = new ArrayList();
        if (index == arr.length) {
            return list;
        } else {
            if (arr[index] == target) {
                list.add(index);
            }

            ArrayList<Integer> ansFromBelowCalls = findAllIndex2(arr, index + 1, target);
            list.addAll(ansFromBelowCalls);
            return list;
        }
    }
}
