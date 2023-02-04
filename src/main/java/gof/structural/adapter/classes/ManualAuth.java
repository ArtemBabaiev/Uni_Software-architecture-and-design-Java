package gof.structural.adapter.classes;

public class ManualAuth implements Auth {

    private LocalDB localDB = LocalDB.getInstance();

    @Override
    public User login(String email, String password) {
        User user = localDB.getUser(email);
        if (user == null) {
            System.out.println("no user in database");
            return null;
        }
        if (!user.getPassword().equals(password)) {
            System.out.println("password mismatch");
            return null;
        }
        return user;
    }

    @Override
    public void register(String email, String password) {
        localDB.add(new User(email, password));
    }
}
