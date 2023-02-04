package gof.structural.adapter.classes;

import java.util.Arrays;
import java.util.List;

public class FbAdapter {

    private boolean accessState;
    private String clientId;
    private String clientSecret;
    private List<User> usersDB = Arrays.asList(
            new User("fb1", "password"),
            new User("fb2", "password")
    );

    public FbAdapter(String clientId, String clientSecret) {
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public boolean tryConnect() {
        accessState = clientSecret.equals(FacebookDev.FACEBOOK_CLIENT_SECRET.getValue()) &&
                clientId.equals(FacebookDev.FACEBOOK_CLIENT_ID.getValue());
        return accessState;
    }

    public User getUser(String email) throws Exception {
        tryConnect();
        if (accessState) {
            return usersDB.stream().filter(user -> user.getEmail().equals(email)).findFirst().orElse(null);
        }
        throw new Exception("invalid client ids");
    }
}
