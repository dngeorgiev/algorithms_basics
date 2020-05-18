package com.dngeorgiev.algorithms.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

public class EmptyIteratorTest {
    @Test
    public void testForwardsIteration() {
        EmptyIterator iterator = EmptyIterator.INSTANCE;

        assertTrue(iterator.isDone());
        iterator.first();
        assertTrue(iterator.isDone());
        try {
            iterator.current();
            fail();
        } catch (IteratorOutOfBoundsException e) {
            // expected
        }

        iterator.next();
        assertTrue(iterator.isDone());
        try {
            iterator.current();
            fail();
        } catch (IteratorOutOfBoundsException e) {
            // expected
        }
    }

    @Test
    public void testBackwardsIteration() {
        EmptyIterator iterator = EmptyIterator.INSTANCE;

        assertTrue(iterator.isDone());
        iterator.last();
        assertTrue(iterator.isDone());

        try {
            iterator.current();
            fail();
        } catch (IteratorOutOfBoundsException e) {
            // expected
        }

        iterator.previous();
        assertTrue(iterator.isDone());
        try {
            iterator.current();
            fail();
        } catch (IteratorOutOfBoundsException e) {
            // expected
        }
    }
}
