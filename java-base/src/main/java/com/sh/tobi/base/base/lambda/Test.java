package com.sh.tobi.base.base.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("dabin", "tyson", "sophia");
        names.sort((a,b)-> b.compareTo(a));

        System.out.println(names);
    }
}
