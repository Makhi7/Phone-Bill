package phone;

public class PhoneBill {

    private double total;

    BillAction callingSomeone = new PhoneCall(10.50);
    BillAction smsSomeone = new SMSBundle(12,6.00);
    BillAction usingDate = new DataBundles(5.00);

    public void accept(BillAction billAction){
        total = 0.00;
        total ++;

        this.callingSomeone = billAction;
        System.out.println("total cost of calls  " + callingSomeone.totalCost());
      //  this.smsSomeone = billAction;
        //System.out.println("total cost of sms  "  + smsSomeone.totalCost());
        //this.usingDate = billAction;
        //System.out.println("total cost of data  " + usingDate.totalCost());

    }

    public double total(){
        return total;
    }

    public static void main(String [] args){
        PhoneBill record = new PhoneBill();
        BillAction callingSomeone = new PhoneCall(10.50);
        BillAction smsSomeone = new SMSBundle(12,6.00);
        BillAction usingDate = new DataBundles(5.00);

        record.accept(callingSomeone);


    }

}
