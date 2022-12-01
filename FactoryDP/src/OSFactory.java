public class OSFactory {
    public OS createOs(String type) {
        if (type == null || type.isEmpty())
            return null;
        switch (type) {
            case "IOS":
                return new IOS();
            case "Android":
                return new Android();
            case "Windows":
                return new Windows();
            default:
                throw new IllegalArgumentException("Sorry! We don't build " + type + " type of OS");
        }
    }
}