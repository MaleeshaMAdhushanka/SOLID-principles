package good;

public class FileWriter implements Write {
    @Override
    public void write(String content) {
        System.out.println("Writing to file: " + content);
    }
}
