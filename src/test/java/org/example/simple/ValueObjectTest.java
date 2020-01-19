package org.example.simple;

import org.junit.Test;

public class ValueObjectTest {

    @Test
    public void test() {
        ValueObject value = new ValueObject.Builder()
                .name("toto")
                .build();
        System.out.println(value);
    }
}
