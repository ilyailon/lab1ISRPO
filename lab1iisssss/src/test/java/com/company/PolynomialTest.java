package com.company;

import org.junit.Assert;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

class PolynomialTest {

    private static String readFromFile(String fileName) throws IOException {
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }

    @org.junit.jupiter.api.Test
    void InputTest() throws Exception {
        com.company.Set set1 = new com.company.Set();
        set1.insert(new Fraction(5, 8));
        set1.insert(new Fraction(2, 3));
        Polynomial pol = new Polynomial(set1);
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("input.txt")), true));
        pol.printf();
        String data = readFromFile("input.txt");
        Assert.assertEquals("5/8\n2/3\n", data);
    }

    @org.junit.jupiter.api.Test
    void ResultTest() throws Exception {
        com.company.Set set1 = new com.company.Set();
        set1.insert(new Fraction(1, 2));
        set1.insert(new Fraction(-2, 6));
        set1.insert(new Fraction(-9, 3));
        com.company.Set set2 = new com.company.Set();
        set2.insert(new Fraction(4, 3));
        set2.insert(new Fraction(7, 8));
        Polynomial pol1 = new Polynomial(set1);
        Polynomial pol2 = new Polynomial(set2);
        System.setOut(new PrintStream(new BufferedOutputStream(new FileOutputStream("output.txt")), true));
        Polynomial pol3 = pol1.sum(pol2);
        pol3.printf();
        String data = readFromFile("output.txt");
        Assert.assertEquals("11/6\n13/24\n-9/3\n", data);
    }
}