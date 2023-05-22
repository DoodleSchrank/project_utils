package org.utils;

public class Correspondence<T> {
    public double similarity;
    public T nodeA;
    public T nodeB;

    public Correspondence(Correspondence<T> correspondence) {
        this.nodeA = correspondence.nodeA();
        this.nodeB = correspondence.nodeB();
        this.similarity = correspondence.similarity();
    }
    public Correspondence(Correspondence<T> correspondence, double similarity) {
        this.nodeA = correspondence.nodeA();
        this.nodeB = correspondence.nodeB();
        this.similarity = similarity;
    }
    public Correspondence(T nodeA, T nodeB, double similarity) {
        this.nodeA = nodeA;
        this.nodeB = nodeB;
        this.similarity = similarity;
    }

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
        return (this.nodeA().equals(s.nodeA()) && this.nodeB().equals(s.nodeB())) ||
                (this.nodeB().equals(s.nodeA()) && this.nodeA().equals(s.nodeB()));
    }

    @Override
    public int hashCode() {
        return nodeA.hashCode() + nodeB.hashCode();
    }

    @Override
    public String toString() {
        return nodeA.toString() + ", " + nodeB.toString() + " - similarity: " + similarity;
    }
}

