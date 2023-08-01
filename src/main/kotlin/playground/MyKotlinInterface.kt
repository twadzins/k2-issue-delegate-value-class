package playground

interface MyKotlinInterface {
    fun withJavaDefaultInterfaceMethod(value: String?, otherString: String?): String

    fun withJavaDefaultInterfaceMethod(value: String?): String {
        return withJavaDefaultInterfaceMethod(value, null)
    }

    fun withoutJavaDefaultInterfaceMethod(value: String?, otherString: String?): String?

    fun withoutJavaDefaultInterfaceMethod(value: String?): String?

}
