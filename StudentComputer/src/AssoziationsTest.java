//public class AssoziationsTest {
//    public static void main(String[] args) {
//        Student s1 = new Student("Peter Petersen", 108089288888L);
//        Computer c1 = new Computer("Dell OptiPlex 755 MT");
//
//        CIPInsel insel = new CIPInsel("IC 04/630");
//
//        s1.computer = c1;
//        c1.benutzer = s1;
//        s1.computer.cipInsel = insel;
//        System.out.println(s1.name + " benutzt einen " + s1.computer.typ + c1.benutzer.name +" "+ s1.computer.cipInsel.name );
//
//
//    }
//}


public class AssoziationsTest {
    public static void main(String[] args) {
        Student s1 = new Student("Peter Petersen", 108089288888L);
        CIPInsel c1 = new CIPInsel("IC 04/630");
        for(int i = 0; i < 10; i++) {
            c1.computer[i] = new Computer("Dell OptiPlex 755 MT");
            c1.computer[i].cipInsel = c1;
        }
        s1.computer = c1.computer[0];
        c1.computer[0].benutzer = s1;
    }
}
