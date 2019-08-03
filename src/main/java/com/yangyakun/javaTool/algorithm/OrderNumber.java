package com.yangyakun.javaTool.algorithm;

public class OrderNumber {
    public static void main(String[] args) {
        int[] array = new int[]{3,1,5,8,2,9,4,6,7};
        for (int i : array) {
            System.out.print(i + " ");
        }

        System.out.println("");

//        bubbleSor(array);
        selectSort(array);

        for (int i : array) {
            System.out.print(i + " ");
        }
    }


    private static void bubbleSor(int[] array){  //3-5个数据  
        for (int i = array.length-1; i >0 ; i--) {
            boolean flag = true;
            for (int j=0;j<i;j++){
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                    flag = false;
                }
            }
            if(flag){
                break;
            }
        }
    }

    private static void selectSort(int[] array){
        for (int i = 0; i < array.length - 1; i++) {
             int index = i;
            for (int j = i+1; j < array.length; j++) {
                if(array[j]<array[index]){
                    index  = j;
                }
            }
            if(index!=i){
                int temp = array[index];
                array[index] = array[i];
                array[i] = temp;
            }
        }
    }
}
