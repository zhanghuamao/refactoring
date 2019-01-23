package after.extractsubclass;

// JobItem用来决定当地修车厂的工作报价,isLabor表示按工时收费
public class JobItem {
    private int unitPrice;
    private int quantity;
    protected Employee employee;
    protected boolean isLabor;

    protected JobItem(int unitPrice, int quantity, boolean isLabor) {
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.isLabor = isLabor;
    }

    public JobItem(int unitPrice, int quantity) {
        this(unitPrice, quantity, false);
    }

    protected boolean isLabor() {
        return false;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getTotalPrice() {
        return getUnitPrice() * quantity;
    }
}