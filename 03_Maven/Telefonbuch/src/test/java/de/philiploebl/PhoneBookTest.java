package de.philiploebl;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class PhoneBookTest {

    PhoneBook b;

    @BeforeEach
    void setup() {
        b = new PhoneBook();
        b.addEntry("John", 123456);
        b.addEntry("Jane", 234567);
        b.addEntry("Bob", 345678);
        b.addEntry("Alice", 456789);
        b.addEntry("Charlie", 567890);
        b.addEntry("David", 678901);
        b.addEntry("Eve", 789012);
        b.addEntry("Frank", 890123);
        b.addEntry("Grace", 901234);
        b.addEntry("Heidi", 102345);
    }

    @Test
    void addEntry() {
        b.addEntry("Kollege", 2222222);
        assertEquals(11, b.size());
        assertEquals(2222222, b.lookupNumber("Kollege"));
        assertEquals("Kollege", b.lookupName(2222222));
    }

    @ParameterizedTest
    @ValueSource(strings={"John", "Jane"})
    void removeEntry(String s) {
        b.removeEntryByName(s);

        assertEquals(9, b.size());
        assertThrows(NoSuchElementException.class, () -> b.lookupNumber(s));
    }

    @Test
    void removeEntry() {
        assertEquals(10, b.size());
        assertThrows(NoSuchElementException.class, () -> b.lookupNumber("Hans"));
    }

    @Test
    void removeEntryNotFound() {
        assertEquals(10, b.size());
        assertThrows(NoSuchElementException.class, () -> b.removeEntryByName("XYZ"));
        assertEquals(10, b.size());
    }

    @Test
    void clear() {
        b.addEntry("idk", 444444);
        b.clear();
        assertThrows(NoSuchElementException.class, () -> b.lookupNumber("Hans"));
        assertNull(b.lookupName(444444));
        assertEquals(0, b.size());
    }


}