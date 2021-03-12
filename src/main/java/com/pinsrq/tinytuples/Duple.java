package com.pinsrq.tinytuples;

/**
 * Tuple with 2 entries.
 *
 * @param <A> The first type.
 * @param <B> The second type.
 */
public class Duple<A, B> extends Tuple {
    /**
     * Number of elements.
     */
    public static final int SIZE = 2;

    /**
     * Element 1.
     */
    protected final A a;

    /**
     * Element 2.
     */
    protected final B b;

    /**
     * Create tuple from scalar elements.
     *
     * @param a Element 1.
     * @param b Element 2.
     */
    public Duple(final A a, final B b) {
        super(a, b);
        this.a = a;
        this.b = b;
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <A> The array type.
     * @return The new tuple.
     */
    public static <A> Duple<A, A> fromA(final A... arr) {
        assert arr != null;
        assert arr.length == 2;
        return new Duple<>(arr[0], arr[1]);
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <B> The array type.
     * @return The new tuple.
     */
    public static <B> Duple<B, B> fromB(final B... arr) {
        assert arr != null;
        assert arr.length == 2;
        return new Duple<>(arr[0], arr[1]);
    }

    /**
     * @return Element 1.
     */
    public final A getA() {
        return this.a;
    }

    /**
     * @return Element 2.
     */
    public final B getB() {
        return this.b;
    }

    /**
     * Returns the size. Same as SIZE.
     *
     * @return The amount of elements.
     */
    public int getSize() {
        return SIZE;
    }
}
