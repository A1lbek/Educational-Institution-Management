public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Alina", 21, "S001");
        Student student2 = new Student("Ayat", 23, "S002");

        Teacher teacher1 = new Teacher("Maksat", "Mathematics", "T001");

        Institution institution = new Institution("Aytmatovs", "Abaya 31/2", 2007);

        System.out.println(student1);
        System.out.println(student2);
        System.out.println(teacher1);
        System.out.println(institution);

        System.out.println("Are students equal? " + student1.equals(student2));
    }
}
