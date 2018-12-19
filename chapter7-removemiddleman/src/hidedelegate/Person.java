package hidedelegate;

public class Person {
    Department mDepartment;
    String mName;

    public Person(String name) {
        this.mName = name;
    }

    // step3. 完成委托后，移除getDepartment
    /* public Department getDepartment() {
        return mDepartment;
    } */

    public void setDepartment(Department department) {
        this.mDepartment = department;
    }

    // step1. 在Person中建立一个委托函数
    public Person getManager() {
        return mDepartment.getManager();
    }

    @Override
    public String toString() {
        return mName;
    }
}
