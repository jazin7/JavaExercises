import java.util.Random;

public class Person implements Comparable<Person>{
    private String name;
    private int id;

    private int maxId = 1001;

    //required Constructor to generate a random ID
    public Person(String name){
        this.name = name;
        this.id = new Random().nextInt(maxId);
    }

    //overloaded Constructor for testing purposes with manually generated IDs
    public Person(String name, int id){
        this.name = name;
        this.id = id;
    }

    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }

    @Override
    public int compareTo(Person other) {
        return Integer.compare(this.id, other.id);
    }
}
