package ua.com.juja.FainYakov;

/**
 * Created by serzh on 7/6/16.
 */
public class Beer {

    private String type;
    private String country;

    public String getType() {
        return type;
    }

    public String getCountry() {
        return country;
    }

    public Beer(String type, String country) {
        this.type = type;
        this.country = country;
    }
}
