public class BenificiaryAccount {
    private final int accountNumber;
    private final String ifscCode; // optional
    private final String accountHolderName;
    private final String nickName; // optional

    public BenificiaryAccount(BenificiaryAccountBuilder builder) {
        this.accountNumber = builder.accountNumber;
        this.ifscCode = builder.ifscCode;
        this.accountHolderName = builder.accountHolderName;
        this.nickName = builder.nickName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getNickName() {
        return nickName;
    }

    @Override
    public String toString() {
        return "BenificiaryAccount [accountNumber=" + accountNumber + ", ifscCode=" + ifscCode + ", accountHolderName="
                + accountHolderName + ", nickName=" + nickName + "]";
    }

    public static class BenificiaryAccountBuilder {
        private final int accountNumber;
        private final String accountHolderName;
        private String ifscCode; // optional
        private String nickName; // optional

        public BenificiaryAccountBuilder(int accountNumber, String accountHolderName) {
            this.accountNumber = accountNumber;
            this.accountHolderName = accountHolderName;
        }

        public BenificiaryAccountBuilder ifsccode(String ifscCode) {
            this.ifscCode = ifscCode;
            return this;
        }

        public BenificiaryAccountBuilder nickName(String nickName) {
            this.nickName = nickName;
            return this;
        }

        public BenificiaryAccount build() {
            BenificiaryAccount benificiaryAccount = new BenificiaryAccount(this);
            return benificiaryAccount;
        }

    }

}
