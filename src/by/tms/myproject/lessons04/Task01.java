package by.tms.myproject.lessons04;

/*В 1626 году индейцы продали Манхэттен за 24$.
Написать программу, которая высчитывает сумму, получившуюся бы в текущем году,
если бы индейцы положили эти деньги в банк под 5% годовых.*/


public class Task01 {

    public static void main(String[] args) {
        double sum = 24;
        double percent =0.05;

        for(int i=1626; i<2022; i++){
            double percentSum=sum*percent;
            sum=sum+percentSum;
        }
        System.out.println("sum: " +sum);
    }
}
