package ru.otus;

import com.google.common.base.Charsets;
import com.google.common.hash.BloomFilter;
import com.google.common.hash.Funnels;

public class HelloOtus {
    public static void main(String... args) {
        System.out.println("Hello !");
        BloomFilter<String> words = BloomFilter.create(Funnels.stringFunnel(Charsets.UTF_16), 100, 0.01);
        words.put("ruse");
        words.put("ubiquitous");
        words.put("hello");

        System.out.println("Checkin \"yes\" status in hashmap : ");

        if (words.mightContain("yes")) {
            System.out.println("maybe");
        } else {
            System.out.println("definitely not");
        }
    }
}
