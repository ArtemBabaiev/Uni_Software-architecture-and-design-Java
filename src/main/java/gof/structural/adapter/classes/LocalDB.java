package gof.structural.adapter.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class LocalDB {
    ArrayList<User> localDB = new ArrayList<>();
    private static LocalDB instance;

    public static LocalDB getInstance() {
        if (instance == null) {
            instance = new LocalDB();
        }
        return instance;
    }

    private LocalDB() {
        localDB.addAll(
                Arrays.asList(new User("admin", "password"),
                        new User("operator", "password"))
        );
    }

    public void add(User user) {
        localDB.add(user);
    }

    public User getUser(String email) {
        return localDB.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
    }
}
