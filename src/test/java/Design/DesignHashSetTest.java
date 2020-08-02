package Design;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DesignHashSetTest {

    @Test
    public void testcase() {
        DesignHashSet.MyHashSet hashSet = new DesignHashSet.MyHashSet();
        hashSet.add(1);
        hashSet.add(2);
        assertTrue(hashSet.contains(1));
        assertFalse(hashSet.contains(3));
        hashSet.add(2);
        assertTrue(hashSet.contains(2));
        hashSet.remove(2);
        assertFalse(hashSet.contains(2));
    }

}
