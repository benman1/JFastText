// Targeted by JavaCPP version 1.3.1: DO NOT EDIT THIS FILE

package com.github.jfasttext;

import java.nio.*;
import org.bytedeco.javacpp.*;
import org.bytedeco.javacpp.annotation.*;

public class FastTextWrapper extends com.github.jfasttext.config.FastTextWrapper {
    static { Loader.load(); }

@Name("std::vector<std::string>") public static class StringVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public StringVector(Pointer p) { super(p); }
    public StringVector(BytePointer ... array) { this(array.length); put(array); }
    public StringVector(String ... array) { this(array.length); put(array); }
    public StringVector()       { allocate();  }
    public StringVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef StringVector put(@ByRef StringVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @StdString BytePointer get(@Cast("size_t") long i);
    public native StringVector put(@Cast("size_t") long i, BytePointer value);
    @ValueSetter @Index public native StringVector put(@Cast("size_t") long i, @StdString String value);

    public StringVector put(BytePointer ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }

    public StringVector put(String ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<fasttext::real>") public static class RealVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public RealVector(Pointer p) { super(p); }
    public RealVector(float ... array) { this(array.length); put(array); }
    public RealVector()       { allocate();  }
    public RealVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef RealVector put(@ByRef RealVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef float get(@Cast("size_t") long i);
    public native RealVector put(@Cast("size_t") long i, float value);

    public RealVector put(float ... array) {
        if (size() != array.length) { resize(array.length); }
        for (int i = 0; i < array.length; i++) {
            put(i, array[i]);
        }
        return this;
    }
}

@Name("std::vector<std::pair<fasttext::real,std::string> >") public static class FloatStringPairVector extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatStringPairVector(Pointer p) { super(p); }
    public FloatStringPairVector(float[] firstValue, BytePointer[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public FloatStringPairVector(float[] firstValue, String[] secondValue) { this(Math.min(firstValue.length, secondValue.length)); put(firstValue, secondValue); }
    public FloatStringPairVector()       { allocate();  }
    public FloatStringPairVector(long n) { allocate(n); }
    private native void allocate();
    private native void allocate(@Cast("size_t") long n);
    public native @Name("operator=") @ByRef FloatStringPairVector put(@ByRef FloatStringPairVector x);

    public native long size();
    public native void resize(@Cast("size_t") long n);

    @Index public native @ByRef float first(@Cast("size_t") long i); public native FloatStringPairVector first(@Cast("size_t") long i, float first);
    @Index public native @StdString BytePointer second(@Cast("size_t") long i);  public native FloatStringPairVector second(@Cast("size_t") long i, BytePointer second);
    @MemberSetter @Index public native FloatStringPairVector second(@Cast("size_t") long i, @StdString String second);

    public FloatStringPairVector put(float[] firstValue, BytePointer[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }

    public FloatStringPairVector put(float[] firstValue, String[] secondValue) {
        for (int i = 0; i < firstValue.length && i < secondValue.length; i++) {
            first(i, firstValue[i]);
            second(i, secondValue[i]);
        }
        return this;
    }
}

@NoOffset @Name("std::pair<fasttext::real,std::string>") public static class FloatStringPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public FloatStringPair(Pointer p) { super(p); }
    public FloatStringPair(float firstValue, BytePointer secondValue) { this(); put(firstValue, secondValue); }
    public FloatStringPair(float firstValue, String secondValue) { this(); put(firstValue, secondValue); }
    public FloatStringPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef FloatStringPair put(@ByRef FloatStringPair x);


    @MemberGetter public native @ByRef float first(); public native FloatStringPair first(float first);
    @MemberGetter public native @StdString BytePointer second();  public native FloatStringPair second(BytePointer second);
    @MemberSetter @Index public native FloatStringPair second(@StdString String second);

    public FloatStringPair put(float firstValue, BytePointer secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }

    public FloatStringPair put(float firstValue, String secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

@NoOffset @Name("std::pair<fasttext::real,int32_t>") public static class DoubleIntPair extends Pointer {
    static { Loader.load(); }
    /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
    public DoubleIntPair(Pointer p) { super(p); }
    public DoubleIntPair(float firstValue, int secondValue) { this(); put(firstValue, secondValue); }
    public DoubleIntPair()       { allocate();  }
    private native void allocate();
    public native @Name("operator=") @ByRef DoubleIntPair put(@ByRef DoubleIntPair x);


    @MemberGetter public native @ByRef float first(); public native DoubleIntPair first(float first);
    @MemberGetter public native int second();  public native DoubleIntPair second(int second);

    public DoubleIntPair put(float firstValue, int secondValue) {
        first(firstValue);
        second(secondValue);
        return this;
    }
}

// Parsed from fasttext_wrapper.h

// #ifndef FASTTEXT_WRAPPER_H
// #define FASTTEXT_WRAPPER_H

// #include "fastText/src/fasttext.h"

/**
 * FastText's wrapper
 */

    @Namespace("FastTextWrapper") @NoOffset public static class FastTextApi extends Pointer {
        static { Loader.load(); }
        /** Pointer cast constructor. Invokes {@link Pointer#Pointer(Pointer)}. */
        public FastTextApi(Pointer p) { super(p); }
        /** Native array allocator. Access with {@link Pointer#position(long)}. */
        public FastTextApi(long size) { super((Pointer)null); allocateArray(size); }
        private native void allocateArray(long size);
        @Override public FastTextApi position(long position) {
            return (FastTextApi)super.position(position);
        }
    
        public FastTextApi() { super((Pointer)null); allocate(); }
        private native void allocate();
        // We don't make runCmd() a static method so that Loader.load() is always be called in FastTextApi().
        public native void runCmd(int arg0, @Cast("char**") PointerPointer arg1);
        public native void runCmd(int arg0, @Cast("char**") @ByPtrPtr BytePointer arg1);
        public native void runCmd(int arg0, @Cast("char**") @ByPtrPtr ByteBuffer arg1);
        public native void runCmd(int arg0, @Cast("char**") @ByPtrPtr byte[] arg1);
        public native @Cast("bool") boolean checkModel(@StdString BytePointer arg0);
        public native @Cast("bool") boolean checkModel(@StdString String arg0);
        public native void loadModel(@StdString BytePointer arg0);
        public native void loadModel(@StdString String arg0);
        // Model unloading is not available in fastText C++. This method is added since
        // Java's GC doesn't collect memory allocated by native function calls.
        public native void unloadModel();
        public native void test(@StdString BytePointer arg0, int arg1);
        public native void test(@StdString String arg0, int arg1);
        // Check if model was loaded successfully
        public native @Cast("bool") boolean isModelLoaded();
        public native @ByVal StringVector predict(@StdString BytePointer arg0, int arg1);
        public native @ByVal StringVector predict(@StdString String arg0, int arg1);
        public native @ByVal FloatStringPairVector predictProba(@StdString BytePointer arg0, int arg1);
        public native @ByVal FloatStringPairVector predictProba(@StdString String arg0, int arg1);
        public native @ByVal RealVector getWordVector(@StdString BytePointer arg0);
        public native @ByVal RealVector getWordVector(@StdString String arg0);
        public native @ByVal RealVector getVector(@StdString BytePointer arg0);
        public native @ByVal RealVector getVector(@StdString String arg0);
        public native @ByVal RealVector getSubwordVector(@StdString BytePointer arg0);
        public native @ByVal RealVector getSubwordVector(@StdString String arg0);
        public native @ByVal StringVector getWords();
        public native @ByVal StringVector getLabels();
        public native @StdString BytePointer getWord(int arg0);
        public native int getNWords();
        public native @StdString BytePointer getLabel(int arg0);
        public native int getNLabels();
        public native double getLr();
        public native int getLrUpdateRate();
        public native int getDim();
        public native int getContextWindowSize();
        public native int getEpoch();
        public native int getMinCount();
        public native int getMinCountLabel();
        public native int getNSampledNegatives();
        public native int getWordNgrams();
        public native @StdString BytePointer getLossName();
        public native @StdString BytePointer getModelName();
        public native int getBucket();
        public native int getMinn();
        public native int getMaxn();
        public native double getSamplingThreshold();
        public native @StdString BytePointer getLabelPrefix();
        public native @StdString BytePointer getPretrainedVectorsFileName();
    }


// #endif


// Parsed from fasttext_wrapper_javacpp.h

// Added <numeric> since VS 14.0 complains about missing std::iota
// #include <numeric>
// #include "fastText/src/args.cc"
// #include "fastText/src/dictionary.cc"
// #include "fastText/src/fasttext.cc"
// #include "fastText/src/matrix.cc"
// #include "fastText/src/model.cc"
// #include "fastText/src/productquantizer.cc"
// #include "fastText/src/qmatrix.cc"
// #include "fastText/src/vector.cc"
// #include "fastText/src/utils.cc"

// #include "fasttext_wrapper.cc"


}
