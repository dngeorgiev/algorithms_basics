package com.dngeorgiev.algorithms.iteration;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SingleIteratorTest {
    @Test
    public void testForwardsIteration() {
        String value = "C";
        SingleIterator iterator = new SingleIterator(value);

        iterator.first();
        assertFalse(iterator.isDone());
        assertSame(iterator.current(), value);

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
        String value = "C";
        SingleIterator iterator = new SingleIterator(value);

        iterator.last();
        assertFalse(iterator.isDone());
        assertSame(iterator.current(), value);

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
