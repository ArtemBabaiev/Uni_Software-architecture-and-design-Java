package gof.structural.adapter.classes;

public enum FacebookDev {
    FACEBOOK_CLIENT_ID("123456789"),
    FACEBOOK_CLIENT_SECRET("qwerty123456789");

    private String value;

    FacebookDev(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
}
