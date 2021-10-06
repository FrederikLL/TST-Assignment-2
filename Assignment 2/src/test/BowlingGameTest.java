package test;

import impl.BowlingGame;
import impl.StringUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class BowlingGameTest {

    BowlingGame tester;

    @BeforeEach
    void setUp() {
        tester = new BowlingGame();
    }

    @AfterEach
    void tearDown() {
        tester = null;
    }

    private void rollMany(int n, int pins){
        for(int i = 0; i<n;i++){
            tester.roll(pins);
        }

    }

    @Test
    void testGutterGame(){
        rollMany(20,0);
        assertEquals(0,tester.score());
    }

    @Test
    void testAllOnes(){
        rollMany(20,1);
        assertEquals(20,tester.score());

    }

    @Test
    void testOneSpare(){
        rollSpare();
        tester.roll(3);
        rollMany(17,0);
        assertEquals(16,tester.score());
    }

    @Test
    void testOneStrike(){
        rollStrike();
        tester.roll(3);
        tester.roll(4);
        rollMany(16,0);
        assertEquals(24,tester.score());
    }

    @Test
    void testPerfectGame(){
        rollMany(12,10);
        assertEquals(300,tester.score());
    }


    private void rollSpare(){
        tester.roll(5);
        tester.roll(5);
    }

    private void rollStrike(){
        tester.roll(10);
    }
}
