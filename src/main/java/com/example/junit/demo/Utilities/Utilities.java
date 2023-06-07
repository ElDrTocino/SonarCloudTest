package com.example.junit.demo.Utilities;


import java.util.Arrays;
import java.util.List;

public class Utilities {

    public boolean exist(String name){
        List<String> names = Arrays.asList("Walter","Ulises","Hugo","Alvaro");
        return names.contains(name);
    }
}
