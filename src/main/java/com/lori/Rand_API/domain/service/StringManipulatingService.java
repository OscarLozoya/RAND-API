package com.lori.Rand_API.domain.service;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StringManipulatingService {

    /*
     * Ejercicio: Escribe un método que reciba una cadena y devuelva la misma cadena,
     * pero con las palabras en orden inverso.
     * Example:
     * input: Hola mundo
     * output: mundo Hola*/
    public String changeorderString(String original){
        List<String> words = List.of(original.split(" "));
        original="";
        for(int i = words.size()-1; i >= 0 ; i--)
            original = original.concat(words.get(i).concat(" "));
        return original;
    }

    /**
     * Palindrome exercise*
     *
     */
    public boolean isPalindrome(String chain){
        chain = chain.toLowerCase().replace(" ","");
        char[] xchain = chain.toCharArray();
        int endChain = xchain.length-1;
        boolean result = true;
        for(int i = endChain, e=0 ; i >= 0 && result; i--, e++) {
            if (xchain[i] != xchain[e])
                result = false;
        }
        return result;
    }

}
