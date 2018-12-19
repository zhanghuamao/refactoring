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

    // step2. 替换调用getManager的地方
    // step3. 删除委托函数
    /* public Person getManager() {
        return mDepartment.getManager();
    } */

    // step1. 建立一个函数，用于获取委托的对象
    public Department getDepartment() {
        return mDepartment;
    }

    @Override
    public String toString() {
        return mName;
    }
}
