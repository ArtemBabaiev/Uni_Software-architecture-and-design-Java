package gof.behavioral.templateMethod;

import gof.behavioral.templateMethod.classes.GoogleAuth;

/**
 * @author artem
 * @version: 1.0.0
 * @project Patterns
 * @date 17.11.2022 23:53
 * @class TemplateMethodMain
 */
public class TemplateMethodMain {
    public static void main(String[] args) {
        GoogleAuth googleAuth = new GoogleAuth();
        System.out.println(googleAuth.login());
        System.out.println(googleAuth.login());
        System.out.println(googleAuth.login());
        System.out.println(googleAuth.login());
    }
}
