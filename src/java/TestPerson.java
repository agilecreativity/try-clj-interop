package try_clj_interop;
import try_clj_interop.Person;

public class TestPerson {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.setName("Burin");
        p1.setCountry("Thailand");
        System.out.println(p1.getName() + " from " + p1.getCountry());

        Person p2 = new Person("Mark", "France");
        System.out.println(p2.getName() + " from " + p2.getCountry());
    }
}
