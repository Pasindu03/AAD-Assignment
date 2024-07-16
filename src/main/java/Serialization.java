import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        Student stu = new Student("Pasindu", 22, "Colombo");

        try(FileOutputStream stream = new FileOutputStream("student.ser");
            ObjectOutputStream stream1 = new ObjectOutputStream(stream)) {
            stream1.writeObject(stu);
            System.out.println("System has saved Student Details to file");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
