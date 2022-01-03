import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LetterGradeTest {

    LetterGrade letterGrade;

    @BeforeEach
    public void setup() {
        letterGrade = new LetterGrade();
    }

    @Test
    public void test5aGrade() {
        assertEquals('X', letterGrade.letterGrade(-500));
        assertEquals('F', letterGrade.letterGrade(55));
        assertEquals('D', letterGrade.letterGrade(65));
        assertEquals('C', letterGrade.letterGrade(75));
        assertEquals('B', letterGrade.letterGrade(85));
        assertEquals('A', letterGrade.letterGrade(95));
        assertEquals('X', letterGrade.letterGrade(500));
    }

    @Test
    public void test5bBoundaryNegative2147483648() {
        assertEquals('X', letterGrade.letterGrade(2147483647));
        assertEquals('X', letterGrade.letterGrade(-2147483648));
        assertEquals('X', letterGrade.letterGrade(-2147483647));
    }

    @Test
    public void test5bBoundary0() {
        assertEquals('X', letterGrade.letterGrade(-1));
        assertEquals('F', letterGrade.letterGrade(0));
        assertEquals('F', letterGrade.letterGrade(1));
    }

    @Test
    public void test5bBoundary60() {
        assertEquals('F', letterGrade.letterGrade(59));
        assertEquals('D', letterGrade.letterGrade(60));
        assertEquals('D', letterGrade.letterGrade(61));
    }

    @Test
    public void test5bBoundary70() {
        assertEquals('D', letterGrade.letterGrade(69));
        assertEquals('C', letterGrade.letterGrade(70));
        assertEquals('C', letterGrade.letterGrade(71));
    }

    @Test
    public void test5bBoundary80() {
        assertEquals('C', letterGrade.letterGrade(79));
        assertEquals('B', letterGrade.letterGrade(80));
        assertEquals('B', letterGrade.letterGrade(81));
    }

    @Test
    public void test5bBoundary90() {
        assertEquals('B', letterGrade.letterGrade(89));
        assertEquals('A', letterGrade.letterGrade(90));
        assertEquals('A', letterGrade.letterGrade(91));
    }

    @Test
    public void test5bBoundary100() {
        assertEquals('A', letterGrade.letterGrade(99));
        assertEquals('A', letterGrade.letterGrade(100));
        assertEquals('X', letterGrade.letterGrade(101));
    }

    @Test
    public void test5bBoundary2147483647() {
        assertEquals('X', letterGrade.letterGrade(2147483646));
        assertEquals('X', letterGrade.letterGrade(-2147483647));
        assertEquals('X', letterGrade.letterGrade(-2147483648));
    }

}
