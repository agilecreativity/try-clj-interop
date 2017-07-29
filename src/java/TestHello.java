package try_clj_interop;
// Note: this one we import from Clojure
import try_clj_interop.Hello;
public class TestHello {
    public static void main(String[] args) {
        try_clj_interop.Hello.hello("World..");
    }
}
