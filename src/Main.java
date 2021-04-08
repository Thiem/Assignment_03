import services.StudentManagement;

public class Main {

    public static void main(String[] args) {
        StudentManagement management = new StudentManagement();
        System.out.println("====== Management Student Program ======");
        management.addStudent();
        management.display();
    }
}
