package hidedelegate;

public class Client {
    private Person mPerson;

    public Client(Person person) {
        mPerson = person;
    }

    public Person getManager() {
        // 对客户揭露了Department的工作原理，客户知道：Department用以记录经理这条信息。为了减少耦合，需要对客户隐藏Department
        // step2. 修改getManager的调用
        return mPerson.getManager();
    }

    @Override
    public String toString() {
        return mPerson.toString();
    }
}
