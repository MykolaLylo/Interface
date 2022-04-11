package HT1;

public class FixedWageWorker implements Wage{
    @Override
    public void wage(){
        int brutto = 1000;
        int tax = 15;
        double netto = (1000/15)*100;

        System.out.println("Wage FixedWageWorker: "+netto);
    }
}
