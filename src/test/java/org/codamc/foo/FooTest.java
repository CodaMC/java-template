package org.codamc.foo;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Test for {@link Foo}
 */
public class FooTest {

    @Test @DisplayName("Foooo")
    void testFoo() {
        System.out.println("Testing Foo!");
        Foo foo = new Foo();
        assertEquals("Foo!", foo.foo());
    }

}
