package com.pinsrq.tinytuples;

/**
 * Tuple with 3 entries.
 *
 * @param <A> The first type.
 * @param <B> The second type.
 * @param <C> The third type.
 */
public class Triple<A, B, C> extends Tuple {
    /**
     * Number of elements.
     */
    public static final int SIZE = 3;

    /**
     * Element 1.
     */
    protected final A a;

    /**
     * Element 2.
     */
    protected final B b;

    /**
     * Element 3.
     */
    protected final C c;

    /**
     * Create tuple from scalar elements.
     *
     * @param a Element 1.
     * @param b Element 2.
     * @param c Element 3.
     */
    public Triple(final A a, final B b, final C c) {
        super(a, b, c);
        this.a = a;
        this.b = b;
        this.c = c;
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <A> The array type.
     * @return The new tuple.
     */
    public static <A> Triple<A, A, A> fromA(final A... arr) {
        assert arr != null;
        assert arr.length == 3;
        return new Triple<>(arr[0], arr[1], arr[2]);
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <B> The array type.
     * @return The new tuple.
     */
    public static <B> Triple<B, B, B> fromB(final B... arr) {
        assert arr != null;
        assert arr.length == 3;
        return new Triple<>(arr[0], arr[1], arr[2]);
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <C> The array type.
     * @return The new tuple.
     */
    public static <C> Triple<C, C, C> fromC(final C... arr) {
        assert arr != null;
        assert arr.length == 3;
        return new Triple<>(arr[0], arr[1], arr[2]);
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
     * @return Element 3.
     */
    public final C getC() {
        return this.c;
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