package Junittests;

public class Calculator {


    public double add(double a,double b){
        return  a+b;
    }

    public double subtraction(double a,double b){
        return  a-b;
    }

    public double divide(double a, double b){
        if(b==0) throw new ArithmeticException("0-ზე გაყოფა არ შეიძლება");
        return a/b;
    }

    public double multiply(double a, double b){
        return a*b;
    }



}
