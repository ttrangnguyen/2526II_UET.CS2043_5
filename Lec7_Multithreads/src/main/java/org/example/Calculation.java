package org.example;

import java.util.concurrent.Callable;

public class Calculation implements Callable<Integer> {
    private Integer first;
    private Integer second;
    public Calculation(Integer _first, Integer _second){
        first = _first;
        second = _second;
    }
    public Integer sum(){
        return first + second;
    }
    public Integer subtract(Integer a, Integer b){
        return first - second;
    }
    @Override
    public Integer call() throws Exception {
        return sum();
    }
}
