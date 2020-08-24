/*
 * Copyright 2010-2020 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

// Auto-generated file. DO NOT EDIT!

package kotlin

/**
 * An array of bytes. When targeting the JVM, instances of this class are represented as `byte[]`.
 * @constructor Creates a new array of the specified [size], with all elements initialized to zero.
 */
public class ByteArray(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> Byte)

    /**
     * Returns the array element at the given [index].  This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun get(index: Int): Byte

    /**
     * Sets the element at the given [index] to the given [value]. This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun set(index: Int, value: Byte): Unit

    /** Returns the number of elements in the array. */
    public val size: Int

    /** Creates an iterator over the elements of the array. */
    public operator fun iterator(): ByteIterator
    
    /** Times operator for ByteArray */
    operator fun ByteArray.times(other: ByteArray): ByteArray {
		val result = ByteArray(this.size)
		for(i in 0 until this.size-1) result[i] = (this[i] * other[i]).toByte()
		return result
	}
    /** Minus operator for ByteArray */
	operator fun ByteArray.minus(other: ByteArray): ByteArray {
		val result = ByteArray(this.size)
		for(i in 0 until this.size-1) result[i] = (this[i] - other[i]).toByte()
		return result
	}
    /** Plus operator for ByteArray */
	operator fun ByteArray.plus(other: ByteArray): ByteArray {
		val result = ByteArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] + other[i]).toByte()
		return result
	}
    /** Div operator for ByteArray */
	operator fun ByteArray.div(other: ByteArray): ByteArray {
		val result = ByteArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] / other[i]).toByte()
		return result
	}
    /** Rem operator for ByteArray */
	operator fun ByteArray.rem(other: ByteArray): ByteArray {
		val result = ByteArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] + other[i]).toByte()
		return result
	}
}

/**
 * An array of chars. When targeting the JVM, instances of this class are represented as `char[]`.
 * @constructor Creates a new array of the specified [size], with all elements initialized to null char (`\u0000').
 */
public class CharArray(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> Char)

    /**
     * Returns the array element at the given [index].  This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun get(index: Int): Char

    /**
     * Sets the element at the given [index] to the given [value]. This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun set(index: Int, value: Char): Unit

    /** Returns the number of elements in the array. */
    public val size: Int

    /** Creates an iterator over the elements of the array. */
    public operator fun iterator(): CharIterator
}

/**
 * An array of shorts. When targeting the JVM, instances of this class are represented as `short[]`.
 * @constructor Creates a new array of the specified [size], with all elements initialized to zero.
 */
public class ShortArray(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> Short)

    /**
     * Returns the array element at the given [index].  This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun get(index: Int): Short

    /**
     * Sets the element at the given [index] to the given [value]. This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun set(index: Int, value: Short): Unit

    /** Returns the number of elements in the array. */
    public val size: Int

    /** Creates an iterator over the elements of the array. */
    public operator fun iterator(): ShortIterator
    
    /** Times operator for ShortArray */
    operator fun ShortArray.times(other: ShortArray): ShortArray {
		val result = ShortArray(this.size)
		for(i in 0 until this.size-1) result[i] = (this[i] * other[i]).toShort()
		return result
	}
    /** Minus operator for ShortArray */
	operator fun ShortArray.minus(other: ShortArray): ShortArray {
		val result = ShortArray(this.size)
		for(i in 0 until this.size-1) result[i] = (this[i] - other[i]).toShort()
		return result
	}
    /** Plus operator for ShortArray */
	operator fun ShortArray.plus(other: ShortArray): ShortArray {
		val result = ShortArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] + other[i]).toShort()
		return result
	}
    /** Div operator for ShortArray */
	operator fun ShortArray.div(other: ShortArray): ShortArray {
		val result = ShortArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] / other[i]).toShort()
		return result
	}
    /** Rem operator for ShortArray */
	operator fun ShortArray.rem(other: ShortArray): ShortArray {
		val result = ShortArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] + other[i]).toShort()
		return result
	}
}

/**
 * An array of ints. When targeting the JVM, instances of this class are represented as `int[]`.
 * @constructor Creates a new array of the specified [size], with all elements initialized to zero.
 */
public class IntArray(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> Int)

    /**
     * Returns the array element at the given [index].  This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun get(index: Int): Int

    /**
     * Sets the element at the given [index] to the given [value]. This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun set(index: Int, value: Int): Unit

    /** Returns the number of elements in the array. */
    public val size: Int

    /** Creates an iterator over the elements of the array. */
    public operator fun iterator(): IntIterator
    
    /** Times operator for IntArray */
    operator fun IntArray.times(other: IntArray): IntArray {
		val result = IntArray(this.size)
		for(i in 0 until this.size-1) result[i] = (this[i] * other[i])
		return result
	}
    /** Minus operator for IntArray */
	operator fun IntArray.minus(other: IntArray): IntArray {
		val result = IntArray(this.size)
		for(i in 0 until this.size-1) result[i] = (this[i] - other[i])
		return result
	}
    /** Plus operator for IntArray */
	operator fun IntArray.plus(other: IntArray): IntArray {
		val result = IntArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] + other[i])
		return result
	}
    /** Div operator for IntArray */
	operator fun IntArray.div(other: IntArray): IntArray {
		val result = IntArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] / other[i])
		return result
	}
    /** Rem operator for IntArray */
	operator fun IntArray.rem(other: IntArray): IntArray {
		val result = IntArray(this.size)
		for (i in 0 until this.size - 1) result[i] = (this[i] + other[i])
		return result
	}
}

/**
 * An array of longs. When targeting the JVM, instances of this class are represented as `long[]`.
 * @constructor Creates a new array of the specified [size], with all elements initialized to zero.
 */
public class LongArray(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> Long)

    /**
     * Returns the array element at the given [index].  This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun get(index: Int): Long

    /**
     * Sets the element at the given [index] to the given [value]. This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun set(index: Int, value: Long): Unit

    /** Returns the number of elements in the array. */
    public val size: Int

    /** Creates an iterator over the elements of the array. */
    public operator fun iterator(): LongIterator
    
    /** Times operator for LongArray */
    operator fun LongArray.times(other: LongArray): LongArray {
		val result = LongArray(this.size)
		for(i in 0 until this.size-1) result[i] = this[i] * other[i]
		return result
	}
    /** Minus operator for LongArray */
	operator fun LongArray.minus(other: LongArray): LongArray {
		val result = LongArray(this.size)
		for(i in 0 until this.size-1) result[i] = this[i] - other[i]
		return result
	}
    /** Plus operator for LongArray */
	operator fun LongArray.plus(other: LongArray): LongArray {
		val result = LongArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] + other[i]
		return result
	}
    /** Div operator for LongArray */
	operator fun LongArray.div(other: LongArray): LongArray {
		val result = LongArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] / other[i]
		return result
	}
    /** Rem operator for LongArray */
	operator fun LongArray.rem(other: LongArray): LongArray {
		val result = LongArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] % other[i]
		return result
	}
}

/**
 * An array of floats. When targeting the JVM, instances of this class are represented as `float[]`.
 * @constructor Creates a new array of the specified [size], with all elements initialized to zero.
 */
public class FloatArray(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> Float)

    /**
     * Returns the array element at the given [index].  This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun get(index: Int): Float

    /**
     * Sets the element at the given [index] to the given [value]. This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun set(index: Int, value: Float): Unit

    /** Returns the number of elements in the array. */
    public val size: Int

    /** Creates an iterator over the elements of the array. */
    public operator fun iterator(): FloatIterator
    
    /** Times operator for FloatArray */
    operator fun FloatArray.times(other: FloatArray): FloatArray {
		val result = FloatArray(this.size)
		for(i in 0 until this.size-1) result[i] = this[i] * other[i]
		return result
	}
    /** Minus operator for FloatArray */
	operator fun FloatArray.minus(other: FloatArray): FloatArray {
		val result = FloatArray(this.size)
		for(i in 0 until this.size-1) result[i] = this[i] - other[i]
		return result
	}
    /** Plus operator for FloatArray */
	operator fun FloatArray.plus(other: FloatArray): FloatArray {
		val result = FloatArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] + other[i]
		return result
	}
    /** Div operator for FloatArray */
	operator fun FloatArray.div(other: FloatArray): FloatArray {
		val result = FloatArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] / other[i]
		return result
	}
    /** Rem operator for FloatArray */
	operator fun FloatArray.rem(other: FloatArray): FloatArray {
		val result = FloatArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] % other[i]
		return result
	}
}

/**
 * An array of doubles. When targeting the JVM, instances of this class are represented as `double[]`.
 * @constructor Creates a new array of the specified [size], with all elements initialized to zero.
 */
public class DoubleArray(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> Double)

    /**
     * Returns the array element at the given [index].  This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun get(index: Int): Double

    /**
     * Sets the element at the given [index] to the given [value]. This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun set(index: Int, value: Double): Unit

    /** Returns the number of elements in the array. */
    public val size: Int

    /** Creates an iterator over the elements of the array. */
    public operator fun iterator(): DoubleIterator
    
    /** Times operator for DoubleArray */
    operator fun DoubleArray.times(other: DoubleArray): DoubleArray {
		val result = DoubleArray(this.size)
		for(i in 0 until this.size-1) result[i] = this[i] * other[i]
		return result
	}
    /** Minus operator for DoubleArray */
	operator fun DoubleArray.minus(other: DoubleArray): DoubleArray {
		val result = DoubleArray(this.size)
		for(i in 0 until this.size-1) result[i] = this[i] - other[i]
		return result
	}
    /** Plus operator for DoubleArray */
	operator fun DoubleArray.plus(other: DoubleArray): DoubleArray {
		val result = DoubleArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] + other[i]
		return result
	}
    /** Div operator for DoubleArray */
	operator fun DoubleArray.div(other: DoubleArray): DoubleArray {
		val result = DoubleArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] / other[i]
		return result
	}
    /** Rem operator for DoubleArray */
	operator fun DoubleArray.rem(other: DoubleArray): DoubleArray {
		val result = DoubleArray(this.size)
		for (i in 0 until this.size - 1) result[i] = this[i] % other[i]
		return result
	}
}

/**
 * An array of booleans. When targeting the JVM, instances of this class are represented as `boolean[]`.
 * @constructor Creates a new array of the specified [size], with all elements initialized to `false`.
 */
public class BooleanArray(size: Int) {
    /**
     * Creates a new array of the specified [size], where each element is calculated by calling the specified
     * [init] function.
     *
     * The function [init] is called for each array element sequentially starting from the first one.
     * It should return the value for an array element given its index.
     */
    public inline constructor(size: Int, init: (Int) -> Boolean)

    /**
     * Returns the array element at the given [index].  This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun get(index: Int): Boolean

    /**
     * Sets the element at the given [index] to the given [value]. This method can be called using the index operator.
     *
     * If the [index] is out of bounds of this array, throws an [IndexOutOfBoundsException] except in Kotlin/JS
     * where the behavior is unspecified.
     */
    public operator fun set(index: Int, value: Boolean): Unit

    /** Returns the number of elements in the array. */
    public val size: Int

    /** Creates an iterator over the elements of the array. */
    public operator fun iterator(): BooleanIterator
}

