class Marks {

    static int marks = 100;

    void showMarks() {
        System.out.println("Marks " + marks);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Marks marks1 = new Marks();

        // Change static variable value by class not by class instance 
        Marks.marks = 50;
        marks1.showMarks();
    }
}