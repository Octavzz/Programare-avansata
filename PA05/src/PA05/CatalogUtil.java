package PA05;

import java.awt.*;
import java.io.*;

public class CatalogUtil {
    public static void save(Catalog catalog)
            throws IOException {
        try (var oos = new ObjectOutputStream(
                new FileOutputStream(catalog.getPath()))) {
            oos.writeObject(catalog);
        }
    }
    public static Catalog load(String path)
            throws InvalidCatalogException {

    }

    public static void view(Document doc) {
        Desktop desktop = Desktop.getDesktop();
        //… browse or open, depending of the location type
    }
}