package snow.day5.serializable;

import snow.day1.upcast.B;

import java.io.*;

public class SerializableTest {
    public static void main(String[] args) {
        Person person = new Person("이순신", 20, "여성");
        System.out.println(person);
        byte[] serializedData = null;
        try(ByteArrayOutputStream bao = new ByteArrayOutputStream()) {
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);

            objectOutputStream.writeObject(person);
            objectOutputStream.flush();

            serializedData = bao.toByteArray();
            System.out.println(new String(serializedData));

        } catch (IOException e) {
            e.printStackTrace();
        }
        try(ByteArrayInputStream bio = new ByteArrayInputStream(serializedData)) {
            ObjectInputStream inputStream = new ObjectInputStream(bio);
            Person person1 = (Person) inputStream.readObject();
            System.out.println("Person: 역지렬화 후 " + person1.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}
