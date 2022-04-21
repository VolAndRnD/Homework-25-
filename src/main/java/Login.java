public class Login  {

    double income = 0;
    double consumption = 0;

    public double changeIncome ( double profit) {
        income = income + profit;
        return income;
    }

    public double changeConsumption ( double loss) {
        consumption = consumption + loss;
        return consumption;
    }


    public double tax ( double income) {
        double tax = 0;
        if (income <= 0) {
            return tax;
        } else {
            tax = income / 100 * 6;

        }
        return tax;
    }

    public double tax1 ( double income, double consumption){
        double tax = (income - consumption)/100*15;
        if ((income - consumption) < 0 ) { tax = 0;
        }
        if ((income - consumption) >= 0 && consumption < 0) {tax = 0;}

        return tax;
    }


}