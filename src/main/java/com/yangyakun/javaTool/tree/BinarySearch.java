package com.yangyakun.javaTool.tree;


public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[]{29, 1, 13, 20, 22, 9, 2, 34, 35, 4};

        quickSort(array, 0, array.length - 1);

        mergeSort(array,0,array.length-1);


        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        int key = 22;
        System.out.println(binarySearch(array, 0, array.length, key));
    }

    //二分查找
    private static int binarySearch(int[] array, int fromIndex, int toIndex, int key) {
        int low = fromIndex;
        int high = toIndex - 1;

        while (low <= high) {
            int middle = (high + low) / 2;
            int middleValue = array[middle];

            if (middleValue > key) {
                high = middle - 1;
            } else if (middleValue < key) {
                low = middle + 1;
            } else {
                return middle;
            }
        }
        return 0;
    }

    //快速排序
    private static void quickSort(int[] array, int begin, int end) {
        if (end - begin <= 0) return;
        int x = array[begin];
        int low = begin;
        int high = end;
        boolean direction = true;
        L1:
        while (low < high) {
            if (direction) {//从右往左找
                for (int i = high; i > low; i--) {
                    if (array[i] <= x) {
                        array[low++] = array[i];
                        high = i;
                        direction = !direction;
                        continue L1;
                    }
                }
                high = low;
            } else {//从左往右找
                for (int i = low; i < high; i++) {
                    if (array[i] >= x) {
                        array[high--] = array[i];
                        low = i;
                        direction = !direction;
                        continue L1;
                    }
                }
                low = high;
            }

        }
        array[low] = x;

        quickSort(array, begin, low - 1);
        quickSort(array, low + 1, end);
    }


    private static void mergeSort(int[] array, int left, int rigth){

        if(left == rigth){
            return;
        }else {
            int middle  = (rigth+left)/2;
            mergeSort(array,left,middle);
            mergeSort(array,middle+1,rigth);
            merge(array,left,middle+1,rigth);
        }
    }


    /**
     * 归并排序
     * 1 2 5 9   3 4 10 11
     */
    private static void merge(int[] array, int left, int middle, int right) {
        int leftSize = middle - left;
        int rightSize = right - middle + 1;

        int[] leftValue = new int[leftSize];
        int[] rightValue = new int[rightSize];

        for (int i = left; i < middle; i++) {
            leftValue[i - left] = array[i];
        }

        for (int i = middle; i <= right; i++) {
            rightValue[i - middle] = array[i];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i<leftSize&&j<rightSize){
            if(leftValue[i]<rightValue[j]){
                array[k] = leftValue[i];
                i++; k++;
            }else {
                array[k] = rightValue[j];
                j++; k++;
            }
        }
        while (i<leftSize){
            array[k] = leftValue[i];
            k++;i++;
        }
        while (j<rightSize){
            array[k] = rightValue[j];
            k++;j++;
        }


    }
}
