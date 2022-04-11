package Second;

import First.Numerable;

public class MyCalculator implements Numerable {
    private int a;
    private int b;

    public MyCalculator (int a, int b){
        this.a =a;
        this.b =b;
    }
    public MyCalculator(){

    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    @Override
    public String toString() {
        return "MyCalculator{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public void add() {
        int c = a+b;
        System.out.println("add result: "+c);
    }

    @Override
    public void subtract() {
        int c = a-b;
        System.out.println("subtract result: "+c);
    }

    @Override
    public void multiply() {
        int c = a*b;
        System.out.println("multiply result: "+c);
    }

    @Override
    public void divide() {
        int c = a/b;
        System.out.println("divide result: "+c);
    }
}
