public class Main {
    public static void main(String[] args) {
        connect("54g4gaxds.de",new ProxyInternetConnection(true));
        connect("wikipedia.de",new ProxyInternetConnection(true));
        connect("reddit.com",new ProxyInternetConnection(true));

        connect("54g4gaxds.de",new ProxyInternetConnection(false));
        connect("wikipedia.de",new ProxyInternetConnection(false));
        connect("reddit.com",new ProxyInternetConnection(false));

    }

    private static void connect(String host, InternetConnection connection) {
    try{
        connection.connectToHost(host);
    } catch (Exception e) {
        System.out.println("Could not access " + host);
        }
    }
}