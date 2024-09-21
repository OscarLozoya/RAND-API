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
}
