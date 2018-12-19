package hidedelegate;

public class Department {
    private Person mManager;

    public Department(Person manager) {
        mManager = manager;
    }

    public Person getManager() {
        return mManager;
    }
}
