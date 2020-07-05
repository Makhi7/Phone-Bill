package phone;

public class PhoneCall implements BillAction {
    private double callPrice;

    PhoneCall(double price){
        this.callPrice = price;

    }


    public double totalCost() {
        return callPrice;
    }


    public static void main(String [] args){
        BillAction obj = new PhoneCall(0.05);
        System.out.println(obj.totalCost());

    }



}
