package test;

import junit.framework.TestCase;
import main.DictonaryWithPriorityOnStream;
import org.junit.Test;

/**
 * Created by Konopatova on 28.01.2018.
 */
public class DictonaryWithPriorityOnStreamTest extends TestCase  {

    @Test
    public void testOneWord() {
        DictonaryWithPriorityOnStream myStructure = new DictonaryWithPriorityOnStream("short verylongword medium");
        assertEquals("[]", myStructure.toString());
    }

    @Test
    public void testOneCharacter() {
        DictonaryWithPriorityOnStream myStructure = new DictonaryWithPriorityOnStream("a a");
        assertEquals("[a=[a, a]]", myStructure.toString());
    }

    @Test
    public void testString() {
        DictonaryWithPriorityOnStream myStructure = new DictonaryWithPriorityOnStream(
                "сапог сарай арбуз болт бокс биржа");
        assertEquals("[б=[биржа, бокс, болт], с=[сапог, сарай]]", myStructure.toString());
    }
    @Test
    public void testWordsLenghtByPriority() {
        DictonaryWithPriorityOnStream myStructure = new DictonaryWithPriorityOnStream(
                "short shoooort shoort shooooooort shooooort shrt");
        assertEquals("[s=[shooooooort, shooooort, shoooort, shoort, short, shrt]]", myStructure.toString());
    }

    @Test
    public void testForEmpty() {
        DictonaryWithPriorityOnStream myStructure = new DictonaryWithPriorityOnStream("");
        assertEquals("[]", myStructure.toString());
    }

}
