public class Main {
    public static void main(String[] args) {
        BinaerBaum tree = new BinaerBaum();

        tree.hinzufuegen(new Person("Alice", 102));
        tree.hinzufuegen(new Person("Bob", 57));
        tree.hinzufuegen(new Person("Diane", 13));
        tree.hinzufuegen(new Person("Esther", 78));
        tree.hinzufuegen(new Person("Hannah", 66));
        tree.hinzufuegen(new Person("Chris", 451));
        tree.hinzufuegen(new Person("Fritz", 255));
        tree.hinzufuegen(new Person("Gianni", 900));
        tree.hinzufuegen(new Person("Irene", 377));
        tree.hinzufuegen(new Person("Test"));

        //System.out.println(tree.root.left.right.left.person.getId());
        printOrder(tree.root);

        System.out.println(tree.finden(57));

    }


    public static void printOrder(Node node){
        if (node != null){
            printOrder(node.left);
            System.out.println(node.person.getName() + " " + node.person.getId());
            printOrder(node.right);
        }
    }


}
