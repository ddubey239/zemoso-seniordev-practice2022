public class App {
    public static void main(String[] args) throws Exception {
        OSFactory factory = new OSFactory();
        OS ios = factory.createOs("IOS");
        ios.getOS();
        OS windows = factory.createOs("Windows");
        windows.getOS();
        OS android = factory.createOs("Android");
        android.getOS();

        OS symbian = factory.createOs("Symbian");
        symbian.getOS();
    }
}
