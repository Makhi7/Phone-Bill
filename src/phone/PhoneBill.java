package phone;

public class PhoneBill {

    private double total;

    public void accept(BillAction billAction){
        total ++;
        System.out.println(totalCost());
    }

    public double total(){

        return total;
    }

}
