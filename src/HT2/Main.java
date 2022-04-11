package HT2;

import Second.MyCalculator;

public class Main {
    public static void main (String[] args){
        MyCalculator myCalculator = new MyCalculator(10,2);
        myCalculator.add();
        myCalculator.subtract();
        myCalculator.multiply();
        myCalculator.divide();
    }
}
