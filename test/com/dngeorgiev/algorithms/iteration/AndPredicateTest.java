package com.dngeorgiev.algorithms.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AndPredicateTest {
    @Test
    public void testTrueAndTrueIsTrue() {
        Predicate predicate = new AndPredicate(FixedPredicate.TRUE, FixedPredicate.TRUE);

        assertTrue(predicate.evaluate(this));
    }

    @Test
    public void testFalseAndTrueIsFalse() {
        Predicate predicate = new AndPredicate(FixedPredicate.FALSE, FixedPredicate.TRUE);

        assertFalse(predicate.evaluate(this));
    }

    @Test
    public void testTrueAndFalseIsFalse() {
        Predicate predicate = new AndPredicate(FixedPredicate.TRUE, FixedPredicate.FALSE);

        assertFalse(predicate.evaluate(this));
    }

    @Test
    public void testFalseAndFalseIsFalse() {
        Predicate predicate = new AndPredicate(FixedPredicate.FALSE, FixedPredicate.FALSE);

        assertFalse(predicate.evaluate(this));
    }

    private static final class FixedPredicate implements Predicate {
        public static final Predicate TRUE = new FixedPredicate(true);
        public static final Predicate FALSE = new FixedPredicate(false);

        private final boolean _result;

        public FixedPredicate(boolean result) {
            _result = result;
        }

        @Override
        public boolean evaluate(Object object) {
            return _result;
        }
    }
}
