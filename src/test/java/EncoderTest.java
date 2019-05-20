import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


public class EncoderTest {
    @Test
    public void checkEncrypt1() {
        assertEquals(Encoder.encrypt("HELLO WORLD"),"BGDKKN VNQKC");
    }
    @Test
    public void checkEncrypt2(){
        assertEquals(Encoder.encrypt("SHAUN"),"BRG/TM");
    }
    @Test
    public void checkDecrypt1(){
        assertEquals(Encoder.decrypt("BGDKKN VNQKC"),"HELLO WORLD");
    }
    @Test
    public void checkDecypt2(){
        assertEquals(Encoder.decrypt("BRG/TM"),"SHAUN");
    }
}
