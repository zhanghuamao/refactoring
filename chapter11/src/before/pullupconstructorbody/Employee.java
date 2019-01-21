package before.pullupconstructorbody;

public abstract class Employee {
    protected String mName;
    protected String mId;

    abstract boolean isPrivileged();

    protected void assignCar() {
        System.out.println(mName + " assign car");
    }
}
