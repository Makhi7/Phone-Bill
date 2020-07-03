package phone;

public class SMSBundle implements BillAction {
            private double smsPrice;
            private int quantity;

  SMSBundle(int qty,double sms){
      this.quantity = qty;
      this.smsPrice = sms;

  }

    @Override
    public double totalCost() {
        return smsPrice;
    }
}
