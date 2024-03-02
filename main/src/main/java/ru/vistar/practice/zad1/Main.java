package ru.vistar.practice.zad1;

public class Main {
    public static void main(String[] args) {
        Mult calc = new Mult();
        System.out.println(calc.multiplication(Integer.parseInt(args[0]), Integer.parseInt(args[1])));
    }
}