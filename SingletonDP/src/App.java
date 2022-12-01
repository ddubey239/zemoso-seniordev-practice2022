public class App {
    public static void main(String[] args) throws Exception {
        WifiCredentials wifiCredentials = WifiCredentials.getCredentials();
        System.out.println(wifiCredentials);
    }
}
