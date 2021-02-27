package io.rhpatrick.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ReleaseTesterTest {

    @Before
    public void ensurePropertySet() {
        String foo = System.getProperty("foo");
        if (foo == null) {
            throw new IllegalStateException("Java System property foo is not set");
        } else if (foo.isEmpty()) {
            throw new IllegalArgumentException("Java system property foo was empty");
        }
    }

    @Test
    public void TestAdd_WithPositiveNumbers_ReturnsExpectedNumber() {
        int x = 12;
        int y = 13;
        ReleaseTester me = new ReleaseTester(x, y);

        int actual = me.add();

        Assert.assertEquals(25, actual);
    }
}
