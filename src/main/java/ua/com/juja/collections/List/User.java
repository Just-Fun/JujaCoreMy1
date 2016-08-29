package ua.com.juja.collections.List;

/**
 * Created by serzh on 2/8/16.
 */
public class User {

    private String f1;
    private boolean f2;
    private Integer f3;
    private Object f4;
    private String f5;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (f2 != user.f2) return false;
        if (f3 != null ? !f3.equals(user.f3) : user.f3 != null) return false;
        if (!f4.equals(user.f4)) return false;
        return f5.equals(user.f5);

    }

    @Override
    public int hashCode() {
        int result = (f2 ? 1 : 0);
        result = 31 * result + (f3 != null ? f3.hashCode() : 0);
        result = 31 * result + f4.hashCode();
        result = 31 * result + f5.hashCode();
        return result;
    }

}
