package hw6335;
import static org.junit.Assert.*;
import org.junit.Test;



public class AuditMinorTest
{
    @Test
    public void testMathMinor()
    {
        AuditMinor minor = new AuditMinor();
        int[] m0  = { };
        int[] m1  = { 151 };
        int[] m7  = { 151,152,251,260,252,300,321 };
        int[] m6a = {     152,251,260,252,300,321 };
        int[] m6b = { 151,    251,260,252,300,321 };
        int[] m6c = { 151,152,    260,252,300,321 };
        int[] m6d = { 151,152,251,    252,300,321 };
        int[] m6e = { 151,152,251,260,    300,321 };
        int[] m6f = { 151,152,251,260,252,    321 };
        int[] m6g = { 151,152,251,260,252,300     };
        int[] m6h = { 151,152,251,260,        403,412 };
        int[] m6i = { 138,137,140,142,112,151 };
        int[] m4  = { 151,152,251,260 };
        int[] s0  = { };
        int[] s1  = { 301 };
        int[] s2  = { 302,301 };
        int[] s5  = { 200,301,302,421,420 };
        assertEquals(false, minor.mathMinor(m1,  s1));
        assertEquals(true,  minor.mathMinor(m7,  s1));
        assertEquals(true,  minor.mathMinor(m7,  s0));
        assertEquals(false, minor.mathMinor(m6a, s1));
        assertEquals(false, minor.mathMinor(m6b, s1));
        assertEquals(false, minor.mathMinor(m6c, s1));
        assertEquals(false, minor.mathMinor(m6d, s1));
        assertEquals(true,  minor.mathMinor(m6e, s1));
        assertEquals(true,  minor.mathMinor(m6f, s1));
        assertEquals(true,  minor.mathMinor(m6g, s1));
        assertEquals(true,  minor.mathMinor(m6h, s0));
        assertEquals(false, minor.mathMinor(m6i, s0));
        assertEquals(false, minor.mathMinor(m4,  s0));
        assertEquals(false, minor.mathMinor(m4,  s1));
        assertEquals(true,  minor.mathMinor(m4,  s2));
        assertEquals(false, minor.mathMinor(m0,  s0));
        assertEquals(false, minor.mathMinor(m1,  s5));
    }
    @Test
    public void testStatMinor()
    {
        AuditMinor minor = new AuditMinor();
        int[] m0  = { };
        int[] m1  = { 151 };
        int[] m7  = { 151,152,251,260,252,300,321 };
        int[] m6a = {     152,251,260,252,300,321 };
        int[] m6b = { 151,    251,260,252,300,321 };
        int[] m6c = { 151,152,    -260,252,300,321 };
        int[] m6d = { 151,152,251,    252,300,321 };
        int[] m6e = { 151,152,251,260,    300,321 };
        int[] m6f = { 151,152,251,260,252,    321 };
        int[] m6g = { 151,152,251,260,252,300     };
        int[] m6h = { 151,152,251,260,        403,412 };
        int[] m6i = { 138,137,140,142,112,151 };
        int[] m4  = { 151,152,251,260 };
        int[] s0  = { };
        int[] s1  = { 301 };
        int[] s2  = { 302,301 };
        int[] s5  = { 200,301,302,421,420 };
        assertEquals(false, minor.statMinor(m1,  s1));
        assertEquals(false, minor.statMinor(m1,  s2));
        assertEquals(false, minor.statMinor(m7,  m6a));
        assertEquals(false, minor.statMinor(m1,  m6b));
        assertEquals(false, minor.statMinor(m1,  m6c));
        assertEquals(false, minor.statMinor(m1,  m6d));
        assertEquals(false, minor.statMinor(m1,  m6e));
        assertEquals(false, minor.statMinor(m1,  m6f));
        assertEquals(false, minor.statMinor(m1,  m6g));
        assertEquals(false, minor.statMinor(m1,  m6h));
        assertEquals(false, minor.statMinor(m1,  m6i));
        assertEquals(false, minor.statMinor(m1,  m4));
        assertEquals(false, minor.statMinor(m1,  s0));
        assertEquals(false, minor.statMinor(m1,  s1));
        assertEquals(false, minor.statMinor(m1,  s2));
        assertEquals(false, minor.statMinor(m1,  s5));
        
    }
    @Test
    public void testMediaStudiesMinor(){
    	AuditMinor minor = new AuditMinor();
    	int[] ms1 = {130,335,400};
    	int[] ms2 = {-130,-335,-400};
    	int[] ms3 = {130,335,400, 231, 246, 250};
    	int[] ms4 = {-130,335,400, 231, 246, 250};
    	int[] ms5 = {130,335,400, 231, 246, 332};
    	int[] ms6 = {130,335,400, 231, 246, 333};
    	int[] ms7 = {130,335,400, 231, 246, 416};
    	int[] ms8 = {130,330,400, 231, 246, 250};
    	int[] ms9 = {13,335,400, 231, 246, 250};
    	int[] ms10 = {130,335,400, 231, 246, 408};
    	int[] ms11 = {130,335,400, 231, 246, 414};
    	assertEquals(false, minor.mediaStudiesMinor(ms1));
    	assertEquals(false, minor.mediaStudiesMinor(ms2));
    	assertEquals(true, minor.mediaStudiesMinor(ms3));
    	assertEquals(false, minor.mediaStudiesMinor(ms4));
    	assertEquals(true, minor.mediaStudiesMinor(ms5));
    	assertEquals(true, minor.mediaStudiesMinor(ms6));
    	assertEquals(true, minor.mediaStudiesMinor(ms7));
    	assertEquals(false, minor.mediaStudiesMinor(ms8));
    	assertEquals(false, minor.mediaStudiesMinor(ms9));
    	assertEquals(true, minor.mediaStudiesMinor(ms10));
    	assertEquals(true, minor.mediaStudiesMinor(ms11));
    }
}