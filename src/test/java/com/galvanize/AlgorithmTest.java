package com.galvanize;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

public class AlgorithmTest {
    Algorithm algorithm = new Algorithm();

    @Test
    void allEqualsTest() {
        assertTrue(algorithm.allEqual("aAaaAAaaAaAa"), "Should return true for all characters equal");
    }

    @Test
    void allEqualsFailsTest() {
        assertFalse(algorithm.allEqual("BaAAaaAa"), "Should return false for all characters equal");
        assertFalse(algorithm.allEqual("aAbAaaAa"), "Should return false for all characters equal");
        assertFalse(algorithm.allEqual("aAAaaAab"), "Should return false for all characters equal");
    }

    @Test
    void mapTest() {
        HashMap<String, Long> hashMap = new HashMap<>();

        hashMap.put("a", 2L);
        hashMap.put("b", 3L);
        hashMap.put("c", 2L);

        assertEquals(algorithm.letterCount("AabbbCC"), hashMap, "Should return hashmap of character count");
    }

    @Test
    void interleaveTest() {
        assertEquals(algorithm.interleave(Arrays.asList("a", "b", "c"), Arrays.asList("d", "e", "f")), "adbecf",
                "Should return interleaved string");
    }
}
