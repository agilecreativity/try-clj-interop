package try_clj_interop;

import clojure.java.api.Clojure;
import clojure.lang.IFn;

public class HelloClojure {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		IFn plus = Clojure.var("clojure.core", "+");

		Object result = plus.invoke(1, 2);
		System.out.println("Result :" + result);

		// Load via require
		IFn require = Clojure.var("clojure.core", "require");
		require.invoke(Clojure.read("clojure.set"));

		IFn map = Clojure.var("clojure.core", "map");
		IFn inc = Clojure.var("clojure.core", "inc");
		result = map.invoke(inc, Clojure.read("[1 2 3]"));
		System.out.println("Result of : (map inc [1 2 3]): " + result.toString());
		// Most IFns in Clojure refer to functions. A few, however,
		// refer to non-function data values. To access these, use deref instead
		// of fn:

		IFn printLength = Clojure.var("clojure.core", "*print-length*");
		IFn deref = Clojure.var("clojure.core", "deref");
		deref.invoke(printLength);
	}
}
