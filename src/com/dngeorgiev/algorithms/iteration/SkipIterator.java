package com.dngeorgiev.algorithms.iteration;

public class SkipIterator implements Iterator {
    private Iterator _iterator;
    private int _skip;

    public SkipIterator(Iterator iterator, int skip) {
        assert iterator != null : "iterator can't be null";
        assert skip > 0 : "skip can't be < 1";

        _iterator = iterator;
        _skip = skip;
    }

    @Override
    public void first() {
        _iterator.first();
        skipForwards();
    }

    @Override
    public void last() {
        _iterator.last();
        skipBackwards();
    }

    @Override
    public boolean isDone() {
        return _iterator.isDone();
    }

    @Override
    public void next() {
        _iterator.next();
        skipForwards();
    }

    @Override
    public void previous() {
        _iterator.previous();
        skipBackwards();
    }

    @Override
    public Object current() throws IteratorOutOfBoundsException {
        return _iterator.current();
    }

    private void skipForwards() {
        for (int i = 0; i < _skip && !_iterator.isDone(); _iterator.next()) {}
    }

    private void skipBackwards() {
        for (int i = 0; i < _skip && !_iterator.isDone(); _iterator.previous()) {}
    }
}
