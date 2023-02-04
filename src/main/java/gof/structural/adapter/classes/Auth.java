package gof.structural.adapter.classes;

public interface Auth {
    public User login(String email, String password);

    public void register(String email, String password);
}
