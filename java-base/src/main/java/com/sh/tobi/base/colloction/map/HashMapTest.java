package com.sh.tobi.base.colloction.map;

import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        map.put("name", "tobi");
        map.put("gender", 1);
        map.put("nickname", "鲨鱼辣椒");
        int code = map.get("name").hashCode();
        System.out.println(code);
        System.out.println(map.toString());


        Map<String, Object> treeMap = new TreeMap<>();
        treeMap.put("name", "tobi");
        treeMap.put("gender", 1);
        treeMap.put("nickname", "鲨鱼辣椒");
        int treeMapCode = treeMap.get("name").hashCode();
        System.out.println(treeMapCode);
        System.out.println(treeMap.toString());


        Set<String> set = new HashSet<>();
        set.add("name");
        Iterator iterator = set.iterator();
        while (iterator.hasNext()) {
            String str = (String) iterator.next();
            System.out.println(str.hashCode());
        }

        List<String> arrayList = new ArrayList<>();
        arrayList.add("name");
        arrayList.add("name2");
        arrayList.add("name3");
        arrayList.add("name4");
        arrayList.add("name5");

        System.out.println(arrayList.toString());

        Iterator i = arrayList.iterator();
        while (i.hasNext()) {
            if ("name3".equals(i.next())) {
                i.remove();
            }
        }

        System.out.println(arrayList.toString());


    }
}
