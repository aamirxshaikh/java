package com.generics.generic_class;

public class Generic <V1 extends Number, V2 extends Number> {
    V1 value1;
    V2 value2;

    Generic (V1 value1, V2 value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    V1 getValue1 () {
        return value1;
    }

    V2 getValue2 () {
        return value2;
    }
}
