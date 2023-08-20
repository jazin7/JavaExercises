public class BinaerBaum {
    Node root;

    public void hinzufuegen(Person p){
        if (root == null){
            root = new Node(p);
        }
        else {
            insert(root, p);
        }
    }

    private void insert(Node parent, Person person){
        if (parent.person.getId() >= person.getId()){
            if (parent.left == null) {
                parent.left = new Node(person);
            }
            else{
                insert(parent.left, person);
            }
        }
        else{
            if (parent.right == null){
                parent.right = new Node(person);
            }
            else{
                insert(parent.right, person);
            }
        }

    }



    public String finden(int id){
        return findenRekursiv(root, id).getName();
    }

    private Person findenRekursiv(Node checker, int id){
        if (checker == null) return null;
        else if (checker.person.getId() == id) return checker.person;

        if (checker.person.getId() > id){
            return findenRekursiv(checker.left, id);
        }
        else {
            return findenRekursiv(checker.right, id);
        }

    }


}
