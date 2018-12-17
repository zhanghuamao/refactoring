package movemethod;

public class AccountType {
    private boolean mIsPremium;

    public AccountType(boolean isPremium) {
        this.mIsPremium = isPremium;
    }

    public boolean isPremium() {
        return mIsPremium;
    }
}