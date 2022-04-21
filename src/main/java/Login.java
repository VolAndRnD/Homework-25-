public class Login  {

    int income = 0;
    int consumption = 0;

    public int changeIncome ( int profit) {
        income = income + profit;
        return income;
    }

    public int changeConsumption ( int loss) {
        consumption = consumption + loss;
        return consumption;
    }


    public int tax ( int income) {
        int tax = 0;
        if (income <= 0) {
            return tax;
        } else {
            tax = income / 100 * 6;

        }
        return tax;
    }

    public int tax1 ( int income, int consumption){
        int tax = (income - consumption)/100*15;
        if ((income - consumption) < 0 ) { tax = 0;
        }
        if ((income - consumption) >= 0 && consumption < 0) {tax = 0;}

        return tax;
    }


}