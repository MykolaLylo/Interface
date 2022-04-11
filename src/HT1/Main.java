package HT1;

public class Main {
    public static void main(String[] args) {
        Wage fixedWageWorker = new FixedWageWorker();
        fixedWageWorker.wage();
        Wage hourlyWorker = new HourlyWorker();
        hourlyWorker.wage();
    }
}
