package testsuite.ibex.Express2Uml.common

import java.util.Collection
import java.util.function.Predicate

class GenericHelper {

	def static <T, V> V getElement(()=>Collection<T> provider, Predicate<T> typeCheck, Predicate<V> condition) {
		for (T t : provider.apply) {
			if (typeCheck.test(t)) {
				val v = t as V
				if (condition.test(v)) {
					return v
				}
			}
		}
	}
}
