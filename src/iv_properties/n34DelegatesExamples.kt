package iv_properties

import util.TODO
import util.doc34
import kotlin.reflect.KProperty

class LazyPropertyUsingDelegates(val initializer: () -> Int) {
    val lazyValue: Int by lazy(initializer)
//      val lazyValue: Int by LazyDelegates()
}

fun todoTask34(): Lazy<Int> = TODO(
    """
        Task 34.
        Read about delegated properties and make the property lazy by using delegates.
    """,
    documentation = doc34()
)


//class LazyDelegates {
//    private var lazyV : Int? = 0
//
//    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
//        return lazyV!!
//    }
//
//    operator fun setValue(thisRef: Any?, property: KProperty<*>, value : Int) {
//        lazyV = value
//    }
//}