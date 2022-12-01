public final class WifiCredentials {
    private String userName;
    private String password;

    private static WifiCredentials wifiCredentials = null;

    private WifiCredentials(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public static WifiCredentials getCredentials() {
        if (wifiCredentials == null) {
            wifiCredentials = new WifiCredentials("ZemosoWifi5G", "Zemoso@2012");
        }
        return wifiCredentials;
    }

    @Override
    public String toString() {
        return "WifiCredentials [userName=" + userName + ", password=" + password + "]";
    }
}
