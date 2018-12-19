package hidedelegate;

public class Client {
    private Person mPerson;

    public Client(Person person) {
        mPerson = person;
    }

    public Person getManager() {
        return mPerson.getDepartment().getManager();
    }

    @Override
    public String toString() {
        return mPerson.toString();
    }
}
