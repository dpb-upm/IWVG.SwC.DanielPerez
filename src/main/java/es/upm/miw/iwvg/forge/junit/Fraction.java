package es.upm.miw.iwvg.forge.junit;

public class Fraction {

    private int numerator;

    private int denominator;

    public Fraction(int numerator, int denominator) {
        assert denominator != 0;
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Fraction() {
        this(1, 1);
    }

    public double decimal() {
        return (double) numerator / denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public boolean isPropia() {
        return this.numerator < this.denominator;
    }

    public boolean isImpropia() {
        return !isPropia();
    }

    public boolean isMenorQue(Fraction newFraction){
        assert newFraction != null;
        return this.decimal() < newFraction.decimal();
    }
    public boolean isMayorQue(Fraction newFraction){
        assert newFraction != null;
        return this.decimal() > newFraction.decimal();
    }
}
