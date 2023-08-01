package playground

@JvmInline
value class MyInterfaceWrapperOfKotlinInterface(val m: MyKotlinInterface) : MyKotlinInterface by m
