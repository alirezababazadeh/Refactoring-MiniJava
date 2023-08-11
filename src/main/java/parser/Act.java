package parser;

import parser.ActionStrategies.AcceptStrategy;
import parser.ActionStrategies.ActionStrategy;
import parser.ActionStrategies.ReduceStrategy;
import parser.ActionStrategies.ShiftStrategy;

public enum Act {
    shift(new ShiftStrategy()), reduce(new ReduceStrategy()), accept(new AcceptStrategy());

    private ActionStrategy strategy;

    Act(ActionStrategy strategy) {
        this.strategy = strategy;
    }

    public ActionStrategy getStrategy() {
        return strategy;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}