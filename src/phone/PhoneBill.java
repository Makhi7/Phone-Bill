package phone;

public class PhoneBill {

    private double total;

    BillAction callingSomeone = new PhoneCall(0.00);
    BillAction smsSomeone = new SMSBundle(0,0.00);
    BillAction usingDate = new DataBundles(0.00);

    public void accept(BillAction billAction){
        callingSomeone = billAction;
        smsSomeone = billAction;
        usingDate = billAction;

        total = 0.00;
        System.out.println("total cost of calls  " + callingSomeone.totalCost());
        System.out.println("total cost of sms  "  + smsSomeone.totalCost());
        System.out.println("total cost of data  " + usingDate.totalCost());
        total ++;


    }

    public double total(){
        return total;
    }

}
