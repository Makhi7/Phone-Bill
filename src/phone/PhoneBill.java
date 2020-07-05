package phone;

public class PhoneBill {

    private double total;

    public void accept(BillAction billAction){
        total += billAction.totalCost();
    }

    public double total(){
        return total;
    }

    public static void main(String [] args){
        PhoneBill record = new PhoneBill();
        BillAction call = new PhoneCall (5.00);
        BillAction sms = new SMSBundle(10,3.50);
        record.accept(call);
        record.accept(sms);
        System.out.println(record.total());

    }

}
