import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
public class ProxyInternetConnection implements InternetConnection{
    private boolean useWhitelist;
    private List<String> whitelist, blacklist;
    private InternetConnection connection = new NetworkInternetConnection();
    public ProxyInternetConnection(boolean useWhitelist){
        this.useWhitelist = useWhitelist;
        // making sure that the file exists otherwise an exception is thrown
        try {
            whitelist = Files.readAllLines(Path.of("whitelist.txt"));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
        try {
            blacklist = Files.readAllLines(Path.of("blacklist.txt"));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
    @Override
    public void connectToHost(String host) throws Exception {
        if (useWhitelist){
            if (whitelist.contains(host)){
                System.out.println("Access granted!");
                connection.connectToHost(host);
            }
            else {
                throw new Exception("Access denied!");
            }
        }
        else {
            if (blacklist.contains(host)){
                throw new Exception("Access denied!");
            }
            else {
                System.out.println("Access granted!");
                connection.connectToHost(host);
            }
        }
    }
}
