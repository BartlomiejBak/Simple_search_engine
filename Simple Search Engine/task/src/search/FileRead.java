package search;

import java.util.ArrayList;
import java.util.Scanner;

public class FileRead {
    Scanner scanner;

    public FileRead(Scanner scanner) {
        this.scanner = scanner;
    }

    public ArrayList<String> read() {
        ArrayList<String> data = new ArrayList<>();

        while (scanner.hasNext()) {
            data.add(scanner.nextLine());
        }
        scanner.close();

        return data;
    }
}
