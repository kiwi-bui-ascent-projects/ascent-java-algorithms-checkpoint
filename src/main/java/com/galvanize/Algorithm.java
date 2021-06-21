package com.galvanize;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Algorithm {
    public boolean allEqual(String input) {
        String stringLowerCase= input.toLowerCase();

        for (int i = 0; i < stringLowerCase.length() - 1; i++) {
            if (stringLowerCase.charAt(i) != (stringLowerCase.charAt(i + 1))) {
                return false;
            }
        }

        return !input.equals("");
    }

    public Map<String, Long> letterCount(String input) {
        HashMap<String, Long> map = new HashMap<>();
        String stringLowerCase= input.toLowerCase();

        for (int i = 0; i < input.length(); i++) {
            if (!map.containsKey(String.valueOf(stringLowerCase.charAt(i)))) {
                map.put(String.valueOf(stringLowerCase.charAt(i)), 1L);
            } else {
                map.put(String.valueOf(stringLowerCase.charAt(i)), map.get(String.valueOf(stringLowerCase.charAt(i))) + 1);
            }
        }

        return map;
    }

    public String interleave(List<String> listOne, List<String> listTwo) {
        String result = "";

        for (int i = 0; i < listOne.size(); i++) {
            result += listOne.get(i) + listTwo.get(i);
        }

        return result;
    }
}
