public class Parser {
    private Scanner scanner = new Scanner();
    public void parse(String sourceFile){
        System.out.println("Parsing..." + sourceFile);
        scanner.scan(sourceFile);
    }
}
