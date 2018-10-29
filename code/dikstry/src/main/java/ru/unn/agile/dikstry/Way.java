package ru.unn.agile.dikstry;

import java.util.List;

public class Way {
    private List<Vertex> vertexes;
    private int weight;

    public Way(final List<Vertex> vertexes, final int weight) {
        this.vertexes = vertexes;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(final int weight) {
        this.weight = weight;
    }

    public void addVertex(final Vertex vertex) {
        vertexes.add(vertex);
    }

    public void addWeight(final int weight) {
        if (this.weight == Integer.MAX_VALUE) {
            this.weight = weight;
        } else {
            this.weight += weight;
        }
    }
}
