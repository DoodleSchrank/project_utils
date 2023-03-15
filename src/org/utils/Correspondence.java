package org.utils;

public class Correspondence<T> {
    public double similarity;
    protected T nodeA;
    protected T nodeB;

    public T nodeA() {
        return this.nodeA;
    }

    public T nodeB() {
        return this.nodeB;
    }

    public double similarity() {
        return this.similarity;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Correspondence s)) return false;
        return this.nodeA().equals(s.nodeA()) && this.nodeB().equals(s.nodeB());

    }

    @Override
    public int hashCode() {
        return nodeA.hashCode() + nodeB.hashCode();
    }
}

