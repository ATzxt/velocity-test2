/**
 * TODO
 *
 * @author Nick West
 */
public class MyName {
    public static String firstName = "Ayo";
    public static String lastName = "Terry";


    public void setFirstName(String aName) {
        firstName = aName;
    }

    public String getFirstName() {
        return firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public static void setLastName(String lastName) {
        MyName.lastName = lastName;
    }
}