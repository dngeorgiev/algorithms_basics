package com.dngeorgiev.algorithms.iteration;

import com.dngeorgiev.algorithms.iteration.ArrayIterator;
import com.dngeorgiev.algorithms.iteration.IteratorOutOfBoundsException;
import com.dngeorgiev.algorithms.iteration.ReverseIterator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ReverseIteratorTest {
    private static final Object[] ARRAY = new Object[] { "A", "B", "C" };

    @Test
    public void testForwardsIterationBecomesBackwards() {
        ReverseIterator iterator = new ReverseIterator(new ArrayIterator(ARRAY));

        iterator.first();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[2], iterator.current());

        iterator.next();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[1], iterator.current());

        iterator.next();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[0], iterator.current());

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
    public void testBackwardsIterationBecomesForwards() {
        ReverseIterator iterator = new ReverseIterator(new ArrayIterator(ARRAY));

        iterator.last();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[0], iterator.current());

        iterator.previous();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[1], iterator.current());

        iterator.previous();
        assertFalse(iterator.isDone());
        assertSame(ARRAY[2], iterator.current());

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
