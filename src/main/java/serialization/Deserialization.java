package serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

    public static void main(String[] args) {
        try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/main/resources/user.out"))){
            Object obj=ois.readObject();
            User thatUser=(User) obj;
            System.out.println(thatUser);
        }
         catch (IOException | ClassNotFoundException exception) {
            exception.printStackTrace();
        }
    }
}
