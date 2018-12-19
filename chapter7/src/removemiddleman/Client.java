package removemiddleman;

public class Client {
    private Person mPerson;

    public Client(Person person) {
        mPerson = person;
    }

    public Person getManager() {
        return mPerson.getManager();
    }

    @Override
    public String toString() {
        return mPerson.toString();
    }
}
