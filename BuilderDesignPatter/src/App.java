public class App {
    public static void main(String[] args) throws Exception {
        BenificiaryAccount benificiaryAccount1 = new BenificiaryAccount.BenificiaryAccountBuilder(123456,
                "Devang Dubey").ifsccode("SBIN0011445").build();

        System.out.println(benificiaryAccount1);

        BenificiaryAccount benificiaryAccount2 = new BenificiaryAccount.BenificiaryAccountBuilder(123456,
                "Bob Marley").nickName("BM").build();

        System.out.println(benificiaryAccount2);
    }
}
