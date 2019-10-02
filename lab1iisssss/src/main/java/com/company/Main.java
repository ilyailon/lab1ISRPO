package com.company;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        com.company.Set set1 = new com.company.Set();
        set1.insert(new com.company.Fraction(2, 5));
        set1.insert(new com.company.Fraction(3, 13));
        set1.insert(new com.company.Fraction(-1, 2));
        com.company.Set set2 = new com.company.Set();
        set2.insert(new com.company.Fraction(12, 32));
        set2.insert(new com.company.Fraction(33, 55));
        com.company.Fraction max = set1.max();
        com.company.Fraction min = set1.min();
        int i = set1.countMax(new com.company.Fraction(0));
        int j = set1.countMin(new com.company.Fraction(0));
        System.out.print("Максимальный коэффициент: ");
        max.print();

        System.out.print("Минимальный коэффициент: ");
        min.print();
        System.out.printf("Количество чисел больше заданного: %d\nКоличество чисел меньше заданного: %d\n", i, j);
        com.company.Polynomial pol1 = new com.company.Polynomial(set1);
        com.company.Polynomial pol2 = new com.company.Polynomial(set2);
        com.company.Polynomial pol3 = pol1.sum(pol2);
        System.out.println("Коэффициенты первого полинома:");
        pol1.printf();
        System.out.println("Коэффициенты второго полинома:");
        pol2.printf();
        System.out.println("Коэффициенты результирующего полинома:");
        pol3.printf();

    }
}
