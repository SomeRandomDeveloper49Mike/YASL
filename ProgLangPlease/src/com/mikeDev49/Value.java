package com.mikeDev49;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Value implements Initializable {
    public enum ValueType {
        INTEGER,
        DOUBLE,
        STRING,
        CHAR
    }
    public ValueType type;
    public Object value;


    static void Initialize() {

    }

    public Value(Object value) {
        if (value.getClass() == Character.class) {
            this.value = value;
            this.type = ValueType.CHAR;
        } else if (value.getClass() == Integer.class) {
            this.value = value;
            this.type = ValueType.INTEGER;
        } else if (value.getClass() == Double.class) {
            this.value = value;
            this.type = ValueType.DOUBLE;
        } else if (value.getClass() == String.class) {
            this.value = value;
            this.type = ValueType.STRING;
        }
    }

    public static int CharGetCode(char c) {
        return c;
    }
}
