package parser.ActionStrategies;

public class ShiftStrategy implements ActionStrategy {
    @Override
    public String apply(int number) {
        return "s" + number;
    }
}
