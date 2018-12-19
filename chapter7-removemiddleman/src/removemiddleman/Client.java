package removemiddleman;

public class Client {
    private Person mPerson;

    public Client(Person person) {
        mPerson = person;
    }

    public Person getManager() {
        // step2. 替换调用getManager的地方
        return mPerson.getDepartment().getManager();
    }

    @Override
    public String toString() {
        return mPerson.toString();
    }
}
