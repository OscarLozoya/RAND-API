package com.lori.Rand_API.domain.service;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MathCalculusService {

    public String staticFibonacci(){
        int fIterations = 15;
        String result = "0, 1,";
        int current = 0;
        int next = 1;
        int operation;
        for(int i = 0; i <= fIterations; i++ )
        {
            operation = current + next;
            result=result.concat(" ").concat(String.valueOf(operation)).concat(",");
            current = next;
            next = operation;
        }
        System.out.println(result);
        return result;
    }

    public String fibonacci(int nums){
        List<Long> result = new ArrayList<>();
        long current = 0;
        long next = 1;
        long operation;
        result.add(current);
        result.add(next);
        for(int i = 0; i < nums; i++){
            operation = current + next;
            result.add(operation);
            current =  next;
            next = operation;
        }
        return result.toString();
    }

     public String fibonacciRecursive(int nums){
        List<Long> result = new ArrayList<>();
        long current = 0;
        long next = 1;
        long operation;
        result.add(current);
        result.add(next);
        int iteration = 0;
        calculusfibo(nums, current, next,result);
        return result.toString();
    }

    public static void calculusfibo(int iterations, long current, long next, List<Long> result){
            if(iterations > 0){
                long resulto = current + next;
                result.add(resulto);
                current = next;
                next = resulto;
                iterations-=1;
                calculusfibo( iterations, current, next, result);
            }
    }

}
