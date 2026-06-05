package Builder;
public class Main {
    public static void main(String[] args) {
        Student student = new Student.StudentBuilder()
                .setFname("Vineet")
                .setLname("Tiwari")
               // .setEmail("vineet@chess.com")
                .setPhone("99999999")
                .setAddress("Delhi")
                .build();

        student.displayMyStudent();
    }
}