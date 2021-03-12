package com.pinsrq.tinytuples;

/**
 * Tuple with 4 entries.
 *
 * @param <A> The first type.
 * @param <B> The second type.
 * @param <C> The third type.
 * @param <D> The fourth type.
 */
public class Quadruple<A, B, C, D> extends Tuple {
    /**
     * Number of elements.
     */
    public static final int SIZE = 4;

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
     * Element 4.
     */
    protected final D d;

    /**
     * Create tuple from scalar elements.
     *
     * @param a Element 1.
     * @param b Element 2.
     * @param c Element 3.
     * @param d Element 4.
     */
    public Quadruple(final A a, final B b, final C c, final D d) {
        super(a, b, c, d);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <A> The array type.
     * @return The new tuple.
     */
    public static <A> Quadruple<A, A, A, A> fromA(final A... arr) {
        assert arr != null;
        assert arr.length == 3;
        return new Quadruple<>(arr[0], arr[1], arr[2], arr[3]);
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <B> The array type.
     * @return The new tuple.
     */
    public static <B> Quadruple<B, B, B, B> fromB(final B... arr) {
        assert arr != null;
        assert arr.length == 3;
        return new Quadruple<>(arr[0], arr[1], arr[2], arr[3]);
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <C> The array type.
     * @return The new tuple.
     */
    public static <C> Quadruple<C, C, C, C> fromC(final C... arr) {
        assert arr != null;
        assert arr.length == 3;
        return new Quadruple<>(arr[0], arr[1], arr[2], arr[3]);
    }

    /**
     * Create singularity tuple.
     *
     * @param arr The array with length == SIZE.
     * @param <D> The array type.
     * @return The new tuple.
     */
    public static <D> Quadruple<D, D, D, D> fromD(final D... arr) {
        assert arr != null;
        assert arr.length == 3;
        return new Quadruple<>(arr[0], arr[1], arr[2], arr[3]);
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
     * @return Element 4.
     */
    public final C getD() {
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