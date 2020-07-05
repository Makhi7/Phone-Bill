package phone;

public class JvmMain {

    public static void main (String [] args){

      /* I want to show how to set values of the bill action variable.
      The variable holds a subclass instance of the BillAction hierarchy*/

            //creating a phone bill ref.variable
        PhoneBill bill = new PhoneBill();

        /*creating a ref.variable that is a BillAction type that holds a Phone call
             ,Sms bundle and data bundle instance*/
        BillAction call = new PhoneCall(10.50);
        bill.accept(call);


        BillAction sms = new SMSBundle(12,6.00);
        bill.accept(sms);


        BillAction data = new DataBundles(15.00);
        bill.accept(data);
    }

}
