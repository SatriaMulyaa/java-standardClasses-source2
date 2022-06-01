package programmer.zaman.now.classes;

import java.util.UUID;

public class UUIDApp {
    public static void main(String[] args) {
        for (int i = 0; i <100 ; i++) {
            // uuid for get random ID
            UUID uuid = UUID.randomUUID();
            // convert uuid to String
            String key = uuid.toString();
            // PRINT OUT KEY
            System.out.println(key);
        }
    }
}
