package com.dngeorgiev.algorithms.iteration;

public class SingleIterator implements Iterator {
    private final Object _value;
    private boolean _done;

    public SingleIterator(Object value) {
        assert value != null : "value can't be null";

        _value = value;
    }

    @Override
    public void first() {
        _done = false;
    }

    @Override
    public void last() {
        _done = false;
    }

    @Override
    public boolean isDone() {
        return _done;
    }

    @Override
    public void next() {
        _done = true;
    }

    @Override
    public void previous() {
        _done = true;
    }

    @Override
    public Object current() throws IteratorOutOfBoundsException {
        if (isDone()) {
            throw new IteratorOutOfBoundsException();
        }

        return _value;
    }
}
