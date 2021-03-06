package movemethod;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
    private Account mAccount;
    private AccountType mAccountType;

    public void setUp() throws Exception {
        mAccountType = new AccountType(true);
        mAccount = new Account(mAccountType);
        mAccount.setDaysOverDrawn(2);
        System.out.println("isPremium : " + mAccountType.isPremium());
        System.out.println("getDaysOverDrawn : " + mAccount.getDaysOverDrawn());
    }

    public void tearDown() throws Exception {
    }

    public void testOverdraftCharge() {
        // System.out.println("overdraftCharge : " + mAccount.overdraftCharge());
        // Step 8. 修改测试用例
        System.out.println("overdraftCharge : " + mAccountType.overdraftCharge(mAccount.getDaysOverDrawn()));
    }

    public void testBankCharge() {
        System.out.println("bankCharge : " + mAccount.bankCharge());
    }
}