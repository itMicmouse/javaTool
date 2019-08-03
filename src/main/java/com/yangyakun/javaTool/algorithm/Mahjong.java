package com.yangyakun.javaTool.algorithm;

public class Mahjong {

    public Mahjong(int suitNum, int rank) {
        this.suitNum = suitNum;
        this.rank = rank;
    }

    public int suitNum;  // 1 筒 2 条 3 万
    public int rank;    //对应的数字

    @Override
    public String toString() {
        return  "("+suitNum +"：" +rank + ")";
    }
}
