package phone;

public class DataBundles implements BillAction {

    private double bundlePrice;

    DataBundles(double megabytes){
        this.bundlePrice = megabytes;

    }

    public double totalCost() {
        return bundlePrice;
    }
}
