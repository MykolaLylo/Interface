package HT1;

public class HourlyWorker implements Wage{
    @Override
    public void wage (){
        int hour=220;
        int wageHour = 15;
        int wage = hour * 15;
        System.out.println("Wage HourlWorker: "+ wage);
    }

}
