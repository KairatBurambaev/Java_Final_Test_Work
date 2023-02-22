import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Set<Notebook> set = new HashSet<>();
        set.add(new Notebook("Notebook 1", 1024, 160, "Windows 8.1", "Pink"));
        set.add(new Notebook("Notebook 2", 256, 320, "Windows 98", "blue"));
        set.add(new Notebook("Notebook 3", 512, 540, "Windows XP professional", "Grey"));
        set.add(new Notebook("Notebook 4", 4096, 280, "Ubuntu", "Green"));

        FiltrationNote operation = new FiltrationNote(set);
        operation.start();

    }
}