import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


public class EncoderTest {
//    @Test
//    public void checkEncryptB1() {
//        assertEquals(Encoder.encrypt("HELLO WORLD"),"BGDKKN VNQKC");
//    }
//    @Test
//    public void checkEncryptE1() {
//        assertEquals(Encoder.encrypt("HELLO WORLD"),"EDAHHK SKNH/");
//    }
//    @Test
//    public void checkEncryptB2(){
//        assertEquals(Encoder.encrypt("SHAUN POW WENG LOONG"),"BRG/TM ONV VDMF KNNMF");
//    }
//    @Test
//    public void checkEncryptB3(){
//        assertEquals(Encoder.encrypt("DXC TECHNOLOGY"),"BCWB SDBGMNKNFX");
//    }

    @Test
    public void checkDecryptB1(){
        assertEquals(Encoder.decrypt("BGDKKN VNQKC"),"HELLO WORLD");
    }
    @Test
    public void checkDecyptB2(){
        assertEquals(Encoder.decrypt("BRG/TM"),"SHAUN");
    }
    @Test
    public void checkDecyptB3(){
        assertEquals(Encoder.decrypt("BCWB SDBGMNKNFX"),"DXC TECHNOLOGY");
    }
    @Test
    public void checkDecryptC1(){
        assertEquals(Encoder.decrypt("CFCJJM UMPJB"),"HELLO WORLD");
    }
}
