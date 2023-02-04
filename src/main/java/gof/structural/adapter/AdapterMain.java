package gof.structural.adapter;

import gof.structural.adapter.classes.FacebookAuth;
import gof.structural.adapter.classes.FbAdapter;
import gof.structural.adapter.classes.ManualAuth;

public class AdapterMain {
    public static void main(String[] args) {

        ManualAuth manualAuth = new ManualAuth();
        manualAuth.register("BLOB", "password");
        System.out.println(manualAuth.login("admin", "password"));

        FacebookAuth facebookAuth = new FacebookAuth(
                new FbAdapter("123456789", "qwerty123456789")
        );
        System.out.println(facebookAuth.login("fb1", "password"));
    }
}
