public class MyJavaInterfaceImpl implements MyJavaInterface {
    @Override
    public String withJavaDefaultInterfaceMethod(String value, String otherString) {
        return value;
    }

    @Override
    public String withoutJavaDefaultInterfaceMethod(String value, String otherString) {
        return value;
    }

    @Override
    public String withoutJavaDefaultInterfaceMethod(String value) {
        return value;
    }
}
