package com.yangyakun.javaTool.ads;

import org.apache.commons.codec.digest.DigestUtils;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) throws Exception {
        HashMap<String,String> map = new HashMap<>();
        map.put("appid","cWw0Zx1rZtheWrht");
        map.put("appkey","4FnNCq7jvRaDYq8Okmz3198EMETBCOit");
        map.put("payload","{\"device-uuid\":\"f0:85:c1:40:cd:1d\",\"slot-id\":\"25000271\",\"quantity\":1,\"type\":\"VOD\",\"ip\":\"8.8.8.8\"}");
        map.put("sequence","1527494938");
        map.put("timestamp","1527494938");
        map.put("version","1.3");
        System.out.println(sign(map));
    }

    private static String sign(Map<String, String> map) {

        final Map<String, String> parameterMap = new TreeMap<String, String>();

        for (Map.Entry<String, String> entity : map.entrySet()) {
            parameterMap.put(entity.getKey(), entity.getValue());
        }

        parameterMap.put("appkey", getAppKey());
        StringBuilder stb = new StringBuilder();
        for (Map.Entry<String, String> entity : parameterMap.entrySet()) {
            stb.append(entity.getKey()).append("=").append(entity.getValue()).append("&")
            ;
        }

        String str = stb.toString();
        System.out.println(str);

        return DigestUtils.md5Hex(str.substring(0, str.length() - 1));
    }

    private static String getAppKey() {
        return "4FnNCq7jvRaDYq8Okmz3198EMETBCOit";
    }


}
