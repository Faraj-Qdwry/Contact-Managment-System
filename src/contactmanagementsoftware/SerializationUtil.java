package contactmanagementsoftware;

import java.io.*;

//todo Can be Singleton
//bisher: static methods are enough, no need for an object, Singleton is only used when we need a single referenced object
//Faraj: Factory method here
public class SerializationUtil implements Serializable {

    public static Object deserialize(File file) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(file);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        ois.close();
        return obj;
    }

    // serialize the given object and save it to file
    public static void serialize(Object obj, String fileName)
            throws IOException {
        FileOutputStream fos = new FileOutputStream(fileName);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(obj);

        fos.close();
    }

}
