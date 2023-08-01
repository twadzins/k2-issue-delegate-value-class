public interface MyJavaInterface {
    String withJavaDefaultInterfaceMethod(String value, String otherString);

    default String withJavaDefaultInterfaceMethod(String value) {
        return withJavaDefaultInterfaceMethod(value, null);
    }

    String withoutJavaDefaultInterfaceMethod(String value, String otherString);

    String withoutJavaDefaultInterfaceMethod(String value);

}
