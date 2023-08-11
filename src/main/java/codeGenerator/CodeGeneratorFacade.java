package codeGenerator;

import contracts.AddressContract;

public class CodeGeneratorFacade {
    public Address createAddress(AddressContract contract) {
        return Address.createFromContract(contract.getNum(), contract.getVarType(), contract.getType());
    }
}
