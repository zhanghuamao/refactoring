package after.pullupconstructorbody;

public class Manager extends Employee {
    private int mGrade;

    public Manager(String name, String id, int grade) {
        super(name, id);
        mGrade = grade;
        initialize();
    }

    boolean isPrivileged() {
        return mGrade > 4;
    }

    public String getManagerInfo() {
        return "name: " + mName + "; id: " + mId + "; grade: " + mGrade;
    }
}
