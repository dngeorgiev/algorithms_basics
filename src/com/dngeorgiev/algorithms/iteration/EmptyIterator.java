package com.dngeorgiev.algorithms.iteration;

public class EmptyIterator implements Iterator {
    public static final EmptyIterator INSTANCE = new EmptyIterator();

    private EmptyIterator() {
    }

    @Override
    public void first() {
    }

    @Override
    public void last() {
    }

    @Override
    public boolean isDone() {
        return true;
    }

    @Override
    public void next() {
    }

    @Override
    public void previous() {
    }

    @Override
    public Object current() throws IteratorOutOfBoundsException {
        throw new IteratorOutOfBoundsException();
    }
}
