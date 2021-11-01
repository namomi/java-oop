package com.javaoop;

import com.javaoop.logic.BubbleSort;
import com.javaoop.logic.JavaSort;
import com.javaoop.logic.Sort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Sort<String> sort = new JavaSort<>();

        System.out.println("[result] " + sort.sort(Arrays.asList(args)));
    }
}
