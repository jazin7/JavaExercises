public class Main {
    public static void main(String[] args) {
        BinaerBaum<Person> tree = new BinaerBaum<>();

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

        System.out.println(tree.root.left.right.left.data.getName());


        printOrder(tree.root);




        Person foundPerson = tree.finden(new Person("test", 57));
        if (foundPerson != null) {
            System.out.println("Found: " + foundPerson.getName());
        } else {
            System.out.println("Person not found!");
        }

    }


    public static void printOrder(Node<Person> node){
        if (node != null){
            printOrder(node.left);
            System.out.println(node.data.getName() + " " + node.data.getId());
            printOrder(node.right);
        }
    }


}
