package com.yangyakun.javaTool.clone;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 测试HashMap的深拷贝和浅拷贝
 * @author Scott007
 * @date 2013.5.15
 * */

public class TestMapcopy {

    public static HashMap<String, String> map1 = new HashMap<>();
    public static HashMap<String, String> map2 = new HashMap<>();

    public TestMapcopy(){
        map1.put("1", "1");
        map1.put("2", "2");
        map1.put("3", "3");
    }

    public void cloneMapShallow(){
        map2 = map1;
        map2.remove("1");
    }

    public void cloneMapDeep1(){
        map2.putAll(map1);
        map2.remove("1");
    }

    @SuppressWarnings("unchecked")
    public void cloneMapDeep2(){
        map2 = (HashMap<String, String>) map1.clone();
        map2.remove("1");
    }

    @SuppressWarnings("rawtypes")
    public void printMap(Map map){
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            System.out.println("key=" + key + " value=" + value);
        }
    }

    public static void main(String args[]){
        TestMapcopy test = new TestMapcopy();
        System.out.println("--------------init:map1~  ");
        test.printMap(TestMapcopy.map1);
        System.out.println("--------------init:map2~  ");
        test.printMap(TestMapcopy.map2);

        test.cloneMapDeep1();
        //test.cloneMapDeep2();
        //test.cloneMapShallow();

        System.out.println("--------------copy:map1~  ");
        test.printMap(TestMapcopy.map1);
        System.out.println("--------------copy:map2~  ");
        test.printMap(TestMapcopy.map2);
    }
}
