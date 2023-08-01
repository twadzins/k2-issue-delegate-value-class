


/**
 * From https://kotlinlang.org/docs/inline-classes.html#inline-classes-and-delegation
 */
@JvmInline
value class MyInterfaceWrapperOfJavaInterface(val m: MyJavaInterface) : MyJavaInterface by m


fun main() {
    val myJava = MyInterfaceWrapperOfJavaInterface(MyJavaInterfaceImpl())
    println(myJava.withJavaDefaultInterfaceMethod("Worked with one arg (with default interface)")) // works on non K2, fails with K2
}
