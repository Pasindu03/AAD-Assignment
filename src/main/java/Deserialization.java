import java.io.*;

public class Deserialization {
    public static void main(String[] args) {
        Student student = new Student();

        try(FileInputStream in = new FileInputStream("student.ser");
            ObjectInputStream out = new ObjectInputStream(in)){
            student = (Student) out.readObject();

            System.out.println(student);
            System.out.println("Student Has been Saved");
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException c) {
            System.out.println("Student Has not been saved");
            c.printStackTrace();
        }
    }
}
