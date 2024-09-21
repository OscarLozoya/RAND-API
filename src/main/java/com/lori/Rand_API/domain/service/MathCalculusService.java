package com.lori.Rand_API.domain.service;

import org.springframework.stereotype.Service;

@Service
public class MathCalculusService {

    public String staticFibonacci(){
        int fIterations = 50;
        String result = "0,";
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
}
