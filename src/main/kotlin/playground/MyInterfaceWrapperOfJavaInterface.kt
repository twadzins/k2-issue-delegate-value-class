package playground

import MyJavaInterface

/**
 * From https://kotlinlang.org/docs/inline-classes.html#inline-classes-and-delegation
 */

@JvmInline
value class MyInterfaceWrapperOfJavaInterface(val m: MyJavaInterface) : MyJavaInterface by m
