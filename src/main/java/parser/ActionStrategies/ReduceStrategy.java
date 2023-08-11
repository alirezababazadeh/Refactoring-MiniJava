package parser.ActionStrategies;

public class ReduceStrategy implements ActionStrategy {
    @Override
    public String apply(int number) {
        return "r" + number;
    }
}
