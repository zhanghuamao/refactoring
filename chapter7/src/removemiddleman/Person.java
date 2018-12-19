package removemiddleman;

public class Person {
    Department mDepartment;
    String mName;

    public Person(String name) {
        this.mName = name;
    }

    public void setDepartment(Department department) {
        this.mDepartment = department;
    }

    public Person getManager() {
        return mDepartment.getManager();
    }

    @Override
    public String toString() {
        return mName;
    }
}
