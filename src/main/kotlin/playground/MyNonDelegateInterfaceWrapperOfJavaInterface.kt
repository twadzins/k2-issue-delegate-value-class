package playground

import MyJavaInterface

/**
 * From https://kotlinlang.org/docs/inline-classes.html#inline-classes-and-delegation
 */

@JvmInline
value class MyNonDelegateInterfaceWrapperOfJavaInterface(val m: MyJavaInterface): MyJavaInterface {
    override fun withJavaDefaultInterfaceMethod(value: String?, otherString: String?): String {
        return m.withJavaDefaultInterfaceMethod(value, otherString)
    }

    override fun withoutJavaDefaultInterfaceMethod(value: String?, otherString: String?): String {
        TODO("Not yet implemented")
    }

    override fun withoutJavaDefaultInterfaceMethod(value: String?): String {
        TODO("Not yet implemented")
    }

//    override fun withJavaDefaultInterfaceMethod(value: String?): String {
//        return super.withJavaDefaultInterfaceMethod(value)
//    }
}
