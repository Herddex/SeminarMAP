package ro.ubb.types;

public class BoolType implements IType {
    public static final BoolType INSTANCE = new BoolType();

    private BoolType() {

    }

    @Override
    public String toString() {
        return "bool";
    }
}
