package com.yangyakun.javaTool.pattern.singleton.demo01;

import java.util.ArrayList;
import java.util.List;

public class Company  {
    private List<Staff> allStaffs = new ArrayList<>();
    public void addStaff(Staff per){
        allStaffs.add(per);
    }
    public void showAllStaff(){
        for (Staff allStaff : allStaffs) {
            System.out.println("Obj:"+allStaff.toString());
        }
    }

}
