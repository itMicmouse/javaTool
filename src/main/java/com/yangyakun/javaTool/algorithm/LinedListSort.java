package com.yangyakun.javaTool.algorithm;

import java.util.LinkedList;

public class LinedListSort {
    public static void main(String[] args) {
        LinkedList<Mahjong> lists = new LinkedList();
        lists.add(new Mahjong(1,7));
        lists.add(new Mahjong(2,2));
        lists.add(new Mahjong(3,6));
        lists.add(new Mahjong(1,5));
        lists.add(new Mahjong(2,4));
        lists.add(new Mahjong(1,8));
        lists.add(new Mahjong(3,9));
        lists.add(new Mahjong(2,3));
        lists.add(new Mahjong(1,2));

        System.out.println(lists);
        radixSort(lists);
        System.out.println(lists);
    }

    public static void radixSort(LinkedList<Mahjong> list){

        System.out.println(list.size());

        LinkedList[] rankList = new LinkedList[9];
        for (int i = 0; i < rankList.length; i++) {
            rankList[i] = new LinkedList();
        }

        while (list.size()>0){
            Mahjong remove = list.remove();
            rankList[remove.rank-1].add(remove);
        }

        for (int i = 0; i < rankList.length; i++) {
            list.addAll(rankList[i]);
        }


        LinkedList[] suitList = new LinkedList[3];
        for (int i = 0; i < suitList.length; i++) {
            suitList[i] = new LinkedList();
        }
        while (list.size()>0){
            Mahjong remove = list.remove();
            suitList[remove.suitNum-1].add(remove);
        }
        for (int i = 0; i < suitList.length; i++) {
            list.addAll(suitList[i]);
        }
    }
}
