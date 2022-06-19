package com.startjava.lesson_2_3_4.calculator;

public class Calc {
        private double a;
        private double b;
        private double result = 1;
        
    public double calculation(char z) {
        switch (z) {
        case ('+'):
            result = a + b;
            break;

        case ('-'):
            result = a - b;
            break;

        case ('*'):
            result = a * b;
            break;

        case ('/'):
            result = a / b;
            break;

        case ('%'):
            result = a % b;
            break;

        case ('^'):
            for (; b > 0; b--) {
            result *=a;
                 
            } break;
            
        default : System.out.println("You must enter one of the following characters: + - * / % ^");
        }
        return result;
    }
    
    public void setA(double a) {
        this.a = a;
    }
    
    public double getA() {
        return a;
    }
    
    public void setB(double b) {
        this.b = b;
    }
    
    public double getB() {
        return b;
    }
    
    public double getResult() {
        return result;
    }
}
