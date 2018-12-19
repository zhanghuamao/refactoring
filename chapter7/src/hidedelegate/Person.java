package hidedelegate;

public class Person {
    Department mDepartment;
    String mName;

    public Person(String name) {
        this.mName = name;
    }

    public Department getDepartment() {
        return mDepartment;
    }

    public void setDepartment(Department department) {
        this.mDepartment = department;
    }

    @Override
    public String toString() {
        return mName;
    }
}
