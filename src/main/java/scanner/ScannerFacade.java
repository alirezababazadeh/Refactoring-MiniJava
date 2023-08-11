package scanner;

import scanner.token.Token;
import scanner.type.Type;

public class ScannerFacade {
    public Type getType(String s) {
        return Token.getTypeFormString(s);
    }
}
