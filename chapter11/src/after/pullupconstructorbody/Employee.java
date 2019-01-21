package after.pullupconstructorbody;

public abstract class Employee {
    protected String mName;
    protected String mId;

    protected Employee(String name, String id) {
        mName = name;
        mId = id;
    }

    void initialize() {
        if (isPrivileged()) {
            assignCar();
        }
    }

    abstract boolean isPrivileged();

    protected void assignCar() {
        System.out.println(mName + " assign car");
    }

}
