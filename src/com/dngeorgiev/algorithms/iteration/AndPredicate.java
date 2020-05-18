package com.dngeorgiev.algorithms.iteration;

public class AndPredicate implements Predicate {
    private Predicate _left;
    private Predicate _right;

    public AndPredicate(Predicate left, Predicate right) {
        assert left != null : "left predicate can't be null";
        assert right != null : "right predicate can't be null";

        _left = left;
        _right = right;
    }

    @Override
    public boolean evaluate(Object object) {
        return _left.evaluate(object) && _right.evaluate(object);
    }
}
