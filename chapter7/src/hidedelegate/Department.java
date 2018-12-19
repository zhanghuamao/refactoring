package hidedelegate;

public class Department {
    private String mChargeCode;
    private Person mManager;

    public Department(Person manager) {
        mManager = manager;
    }

    public Person getManager() {
        return mManager;
    }
}
