package de.philiploebl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StackTest {
    private Stack stack;

    @BeforeEach
    void setUp() {
        stack = new Stack(2);
    }


    @Test
    void push() {
        stack.push("a");
        stack.push("b");
        stack.push("c");
        assertEquals(3, stack.size());
    }

    @Test
    void peek() {
        stack.push("a");
        stack.push("b");
        assertEquals("b", stack.peek());
    }

    @Test
    void pop() {
        stack.push("a");
        stack.push("b");
        assertEquals("b", stack.pop());
        assertEquals("a", stack.pop());
    }

    @Test
    void size() {
        stack.push("a");
        stack.push("b");
        assertEquals(2, stack.size());
    }

    @Test
    void pushPopPush() {
        stack.push("a");
        stack.push("b");
        stack.pop();
        stack.push("c");
        assertEquals("c", stack.peek());
    }
}