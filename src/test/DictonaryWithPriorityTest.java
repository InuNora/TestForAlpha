package test;

import junit.framework.TestCase;
import main.DictonaryWithPriority;
import org.junit.Test;



/**
 * Created by Konopatova on 27.01.2018.
 */


public class DictonaryWithPriorityTest extends TestCase {

    @Test
    public void testOneWord() {
        DictonaryWithPriority myStructure = new DictonaryWithPriority("short verylongword medium");
        assertEquals("[]", myStructure.toString());
    }

    @Test
    public void testOneCharacter() {
        DictonaryWithPriority myStructure = new DictonaryWithPriority("a a");
        assertEquals("[a=[a, a]]", myStructure.toString());
    }

    @Test
    public void testString() {
        DictonaryWithPriority myStructure = new DictonaryWithPriority("сапог сарай арбуз болт бокс биржа");
        assertEquals("[б=[биржа, бокс, болт], с=[сапог, сарай]]",
                myStructure.toString());
    }

    @Test
    public void testWordsLenghtByPriority() {
        DictonaryWithPriority myStructure = new DictonaryWithPriority(
                "short shoooort shoort shooooooort shooooort shrt");

        assertEquals("[s=[shooooooort, shooooort, shoooort, shoort, short, shrt]]", myStructure.toString());
    }

    @Test
    public void testForEmpty() {
        DictonaryWithPriority myStructure = new DictonaryWithPriority("");
        assertEquals("[]", myStructure.toString());
    }
}
