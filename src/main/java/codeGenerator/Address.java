package codeGenerator;

public class Address {
    public int num;
    public TypeAddress Type;
    public VarType varType;

    public static Address createFromContract(int num, String varType, String type) {
        return new Address(num, VarType.valueOf(varType), TypeAddress.valueOf(type));
    }

    public Address(int num, VarType varType, TypeAddress Type) {
        this.num = num;
        this.Type = Type;
        this.varType = varType;
    }

    public Address(int num, VarType varType) {
        this.num = num;
        this.Type = TypeAddress.Direct;
        this.varType = varType;
    }

    public String toString() {
        switch (Type) {
            case Direct:
                return num + "";
            case Indirect:
                return "@" + num;
            case Imidiate:
                return "#" + num;
        }
        return num + "";
    }
}
