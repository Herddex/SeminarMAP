package ro.ubb.types;

public class IntType implements IType {
    public static final IntType INSTANCE = new IntType();

    private IntType() {

    }

    @Override
    public String toString() {
        return "int";
    }
}
