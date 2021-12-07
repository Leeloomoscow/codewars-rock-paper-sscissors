import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyTest {
    @Test
    public void test1() {
        System.out.println("Fixed Tests Player 1 won!");
        assertEquals("Player 1 won!", Kata.rps("rock", "scissors"));
        assertEquals("Player 1 won!", Kata.rps("scissors", "paper"));
        assertEquals("Player 1 won!", Kata.rps("paper", "rock"));
    }
    @Test
    public void test2() {
        System.out.println("Fixed Tests Player 2 won!");
        assertEquals("Player 2 won!", Kata.rps("scissors", "rock"));
        assertEquals("Player 2 won!", Kata.rps("paper", "scissors"));
        assertEquals("Player 2 won!", Kata.rps("rock", "paper"));
    }
    @Test
    public void test3() {
        System.out.println("Fixed Tests Draw!");
        assertEquals("Draw!", Kata.rps("scissors", "scissors"));
        assertEquals("Draw!", Kata.rps("paper", "paper"));
        assertEquals("Draw!", Kata.rps("rock", "rock"));
    }

    private static class Kata {
        public static String rps(String p1, String p2) {
            if (p1.equals(p2)) {
                return "Draw!";
            }
            if (!p1.equals("rock") || !p2.equals("scissors")) {
                if (!p1.equals("paper") || !p2.equals("rock")) {
                    if (!p1.equals("scissors") || !p2.equals("paper")) {
                        return "Player 2 won!";
                    } else {
                        return "Player 1 won!";
                    }
                } else {
                    return "Player 1 won!";
                }
            } else {
                return "Player 1 won!";
            }
        }
    }
    }
