


/**
 * From https://kotlinlang.org/docs/inline-classes.html#inline-classes-and-delegation
 */
@JvmInline
value class MyWorkaroundInterfaceWrapperOfJavaInterface(val m: MyJavaInterface) : MyJavaInterface by m {
    override fun withJavaDefaultInterfaceMethod(value: String?): String {
        return super.withJavaDefaultInterfaceMethod(value)
    }
}


fun main() {
    val myJava = MyWorkaroundInterfaceWrapperOfJavaInterface(MyJavaInterfaceImpl())
    println(myJava.withJavaDefaultInterfaceMethod("Worked with one arg (with default interface)")) // works
}
