package es.upm.miw.iwvg.forge.junit;

import java.util.ArrayList;
import java.util.List;

public class DecimalCollection {

    private List<Double> collection;

    public DecimalCollection() {
        this.collection = new ArrayList<>();
    }

    public void add(double value) {
        this.collection.add(value);
    }

    public int size() {
        return this.collection.size();
    }

    public double sum() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException("Empty collection");
        }

        return this.collection.stream().mapToDouble(Double::doubleValue).sum();

    }

    public double higher() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException("Empty collection");
        }
        double higher = Double.NEGATIVE_INFINITY;
        for (double item : this.collection) {
            if (item > higher) {
                higher = item;
            }
        }
        return higher;
    }
    public double lowest() {
        assert collection != null;
        if (this.collection.isEmpty()) {
            throw new ArithmeticException("Empty collection");
        }
        double lower = Double.POSITIVE_INFINITY;
        for (double item : this.collection) {
            if (item < lower) {
                lower = item;
            }
        }
        return lower;
    }


}
