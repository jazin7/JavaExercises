public class Main {
    public static void main(String[] args) {
        FileSystemComponent file1 = new File("uebung01", 384);
        FileSystemComponent file2 = new File("loesung01", 37);
        Directory dir1 = new Directory("uebung");
        dir1.add(file1);
        dir1.add(file2);
        Directory dir2 = new Directory("oom");
        FileSystemComponent file3 = new File("eclipseIDE", 578);
        dir2.add(dir1);
        dir2.add(file3);
        System.out.println("Files in oom");
        dir2.print();
        System.out.println("Directory size: " + dir2.getSize());
        System.out.println("Files in uebung");
        dir1.print();
        System.out.println("Directory size: " + dir1.getSize());
    }
}