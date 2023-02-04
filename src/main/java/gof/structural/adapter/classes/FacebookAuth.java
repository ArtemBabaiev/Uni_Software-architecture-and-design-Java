package gof.structural.adapter.classes;

public class FacebookAuth implements Auth {

    LocalDB localDB = LocalDB.getInstance();
    FbAdapter fbAdapter;

    public FacebookAuth(FbAdapter fbAdapter) {
        this.fbAdapter = fbAdapter;
    }

    @Override
    public User login(String email, String password) {
        try {
            User localUser = localDB.getUser(email);
            if (localUser != null) {
                return localUser;
            }
            User fbUser = fbAdapter.getUser(email);
            if (fbUser != null) {
                localDB.add(fbUser);
            }
            return fbUser;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            ;
            return null;
        }
    }

    @Override
    public void register(String email, String password) {
        try {
            User fbUser = fbAdapter.getUser(email);
            User localUser = localDB.getUser(email);
            if (localUser == null) {
                localDB.add(fbUser);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
