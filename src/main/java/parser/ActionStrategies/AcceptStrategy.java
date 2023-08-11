package parser.ActionStrategies;

public class AcceptStrategy implements ActionStrategy {
    @Override
    public String apply(int number) {
        return "acc";
    }
}
