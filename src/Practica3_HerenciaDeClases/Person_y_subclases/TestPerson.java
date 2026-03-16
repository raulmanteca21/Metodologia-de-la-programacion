package Practica3_HerenciaDeClases.Person_y_subclases;

public class TestPerson {
    public static void main(String[] args) {

        // ===== Test Person =====
        Person p1 = new Person("John", "Madrid");
        System.out.println(p1);

        p1.setAddress("Barcelona");
        System.out.println("Name: " + p1.getName());
        System.out.println("Address: " + p1.getAddress());
        System.out.println(p1);

        // ===== Test Student =====
        Student s1 = new Student("Ana", "Valencia", "Engineering", 2, 1500);
        System.out.println(s1);

        System.out.println("Program: " + s1.getProgram());
        System.out.println("Year: " + s1.getYear());
        System.out.println("Fee: " + s1.getFee());

        s1.setProgram("Mathematics");
        s1.setYear(3);
        s1.setFee(2000);

        System.out.println("After changes: " + s1);

        // ===== Test Staff =====
        Staff st1 = new Staff("Luis", "Sevilla", "UPM", 3000);
        System.out.println(st1);

        System.out.println("School: " + st1.getSchool());
        System.out.println("Pay: " + st1.getPay());

        st1.setSchool("UCM");
        st1.setPay(3500);

        System.out.println("After changes: " + st1);
    }
}