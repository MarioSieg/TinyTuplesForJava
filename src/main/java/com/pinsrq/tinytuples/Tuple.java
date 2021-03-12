package com.pinsrq.tinytuples;

import java.io.Serializable;
import java.util.*;

/**
 * Base class for all tuples.
 */
public abstract class Tuple implements Serializable, Comparable<Tuple>, Iterable<Object> {
    private final transient Object[] values;

    /**
     * Construct tuple superclass.
     *
     * @param values The values.
     */
    protected Tuple(final Object... values) {
        super();
        this.values = values;
    }

    /**
     * @return The size of the tuple.
     */
    public abstract int getSize();

    /**
     * @return The stride of the tuple.
     */
    public int getStride() {
        return this.getSize() >> 1;
    }

    /**
     * Get a tuple object at index.
     *
     * @param idx The index.
     * @return The object.
     */
    public final Object get(final int idx) {
        assert idx < this.getSize();
        return this.values[idx];
    }

    /**
     * Get a tuple object at index beginning from the end of the array.
     *
     * @param idx The index.
     * @return The object.
     */
    public final Object getRev(final int idx) {
        return this.get(this.getSize() - 1 - idx);
    }

    public final int lastIndexOf(final Object value) {
        for (int i = getSize() - 1; i >= 0; --i) {
            final var val = this.values[i];
            if (val == null && value == null) {
                return i;
            } else {
                if (Objects.equals(val, value)) {
                    return i;
                }
            }
        }
        return -1;
    }

    public final int indexOf(final Object value) {
        int i = 0;
        for (final var val : this.values) {
            if (val == null && value == null) {
                return i;
            } else {
                if (Objects.equals(val, value)) {
                    return i;
                }
            }
            ++i;
        }
        return -1;
    }

    public final boolean containsAll(final Object... values) {
        if (values == null) {
            return false;
        }
        for (final var value : values) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public final boolean containsAll(final Collection<?> collection) {
        for (final var value : collection) {
            if (!contains(value)) {
                return false;
            }
        }
        return true;
    }

    public final boolean contains(final Object value) {
        for (final var val : this.values) {
            if ((val == null && value == null) || Objects.equals(val, value)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator<Object> iterator() {
        return Arrays.stream(this.values).iterator();
    }

    @Override
    public final String toString() {
        return Arrays.toString(this.values);
    }

    public final List<Object> toList() {
        return Arrays.asList(this.values);
    }

    public final Object[] toArray() {
        return this.values.clone();
    }

    @Override
    public final int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((this.values == null) ? 0 : this.values.hashCode());
        return result;
    }

    @Override
    public final boolean equals(final Object rhs) {
        if (this == rhs) {
            return true;
        }
        if (rhs == null || getClass() != rhs.getClass()) {
            return false;
        }
        final var other = (Tuple) rhs;
        return this.values.equals(other.values);
    }

    @SuppressWarnings({"rawtypes", "unchecked"})
    public int compareTo(final Tuple rhs) {
        final int length = this.values.length;
        final Object[] oValues = rhs.values;
        final int len = oValues.length;

        for (int i = 0; i < length && i < len; i++) {

            final var elem = (Comparable) this.values[i];
            final var oElement = (Comparable) oValues[i];

            final int comparison = elem.compareTo(oElement);
            if (comparison != 0) {
                return comparison;
            }
        }
        return Integer.compare(length, len);

    }
}
