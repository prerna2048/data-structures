package com.practice.FI.operator;

public class PracticeFI {

    static int  calculate(int a, int b, Operator operator){
        return operator.operate(a,b);
    }

    public static void main(String[] args) {
        System.out.println(PracticeFI.calculate(2,3,new AdditonOperator()));
        System.out.println(PracticeFI.calculate(2, 3, new Operator() {
            @Override
            public int operate(int a, int b) {
                return a+b;
            }
        }));
        Operator operator = (a, b) -> a+b;
        System.out.println(PracticeFI.calculate(2,3 , operator));

    }
}
