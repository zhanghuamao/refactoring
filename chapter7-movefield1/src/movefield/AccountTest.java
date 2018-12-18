package movefield;

import junit.framework.TestCase;

public class AccountTest extends TestCase {
    private Account mAccount;
    private AccountType mType;

    public void setUp() throws Exception {
        // step4. 修改测试用例
        mType = new AccountType();
        mAccount = new Account(mType);
        mType.setInterestRate(1.5);
    }

    public void tearDown() throws Exception {
    }

    public void testInterestForAmountDays() {
        System.out.println("testInterestForAmountDays : " + mAccount.interestForAmountDays(2, 365));
    }
}