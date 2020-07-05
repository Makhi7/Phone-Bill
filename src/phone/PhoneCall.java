package phone;

public class PhoneCall implements BillAction {
    private double callPrice;

    PhoneCall(double price){
        this.callPrice = price;

    }


    public double totalCost() {
        return callPrice;
    }

}
