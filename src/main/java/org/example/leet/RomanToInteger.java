package org.example.leet;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int converter(String values){
        Map<Character, Integer> seeder = new HashMap<>();

        seeder.put('I', 1);
        seeder.put('V', 5);
        seeder.put('X', 10);
        seeder.put('L', 50);
        seeder.put('C', 100);
        seeder.put('D', 500);
        seeder.put('M', 1000);

        int total = 0;
        int preValue = 0;

        for(int i = values.length() -1; i >=0; i--){

            char symbol = values.charAt(i);
            int currentValue = seeder.get(symbol);

            if(currentValue < preValue){
                total -= currentValue;
            }else{
                total += currentValue;
            }
            preValue = currentValue;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(RomanToInteger.converter("III"));
        System.out.println(RomanToInteger.converter("MCMXCIV"));
    }
}
