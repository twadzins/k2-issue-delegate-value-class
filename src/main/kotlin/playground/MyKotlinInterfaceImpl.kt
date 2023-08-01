package playground

class MyKotlinInterfaceImpl : MyKotlinInterface {
    override fun withJavaDefaultInterfaceMethod(value: String?, otherString: String?): String {
        return value?:"unset"
    }

    override fun withoutJavaDefaultInterfaceMethod(value: String?, otherString: String?): String? {
        return value?:"unset"
    }

    override fun withoutJavaDefaultInterfaceMethod(value: String?): String? {
        return withoutJavaDefaultInterfaceMethod(value, null)
    }
}
