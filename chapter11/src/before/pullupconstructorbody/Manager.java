package before.pullupconstructorbody;

public class Manager extends Employee {
    private int mGrade;

    public Manager(String name, String id, int grade) {
        mName = name;
        mId = id;
        mGrade = grade;
        if (isPrivileged()) {
            assignCar();
        }
    }

    boolean isPrivileged() {
        return mGrade > 4;
    }

    public String getManagerInfo() {
        return "name: " + mName + "; id: " + mId + "; grade: " + mGrade;
    }
}
