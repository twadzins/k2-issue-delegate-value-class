package playground

import MyJavaInterfaceImpl

fun main() {

    val myNonDelegateJava = MyNonDelegateInterfaceWrapperOfJavaInterface(MyJavaInterfaceImpl())
    System.err.println(myNonDelegateJava.withJavaDefaultInterfaceMethod("Worked with one arg (with default interface)!")) // works

    System.err.println("Using Kotlin interface:")
    val myKotlin = MyInterfaceWrapperOfKotlinInterface(MyKotlinInterfaceImpl())
    //Note: using System.error to avoid lines printing out of order with the exception message
    System.err.println(myKotlin.withoutJavaDefaultInterfaceMethod("Worked with 2 args!", null)) // works
    System.err.println(myKotlin.withoutJavaDefaultInterfaceMethod("Worked with one arg (without default interface)!")) // works

    System.err.println(myKotlin.withJavaDefaultInterfaceMethod("Worked with 2 args !", null)) // works
    System.err.println(myKotlin.withJavaDefaultInterfaceMethod("Worked with one arg (with default interface)!")) // works

    System.err.println("\nUsing Java interface:")

    val myJavaImpl = MyJavaInterfaceImpl()
    System.err.println(myJavaImpl.withJavaDefaultInterfaceMethod("(no value class) Worked with one arg (with default interface)!")) // works

    val myJava = MyInterfaceWrapperOfJavaInterface(myJavaImpl)
    System.err.println(myJava.withoutJavaDefaultInterfaceMethod("Worked with 2 args!", null)) // works
    System.err.println(myJava.withoutJavaDefaultInterfaceMethod("Worked with one arg (without default interface)!")) // works

    System.err.println(myJava.withJavaDefaultInterfaceMethod("Worked with 2 args!", null)) // works
    System.err.println(myJava.withJavaDefaultInterfaceMethod("Worked with one arg (with default interface)!")) // works on non K2, fails with K2
}
