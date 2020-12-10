package serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serialization {
    public static void main(String[] args) {
        User man= new User("chelovek","ochenplohoyparol");

        try(ObjectOutputStream oos=new ObjectOutputStream(
                new FileOutputStream("src/main/resources/user.out"))){
            oos.writeObject(man);
        }
         catch (IOException exception) {
            exception.printStackTrace();
        }
    }
}
