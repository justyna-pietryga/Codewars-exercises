package org.example;

/**
 * https://www.codewars.com/kata/5574835e3e404a0bed00001b/train/java
 */

public class HandshakeProblem {
    public static int GetParticipants(int handshakes) {
        int result = 0;
        while (handshakes > 0) {
            result++;
            handshakes = handshakes - result;
        }
        return result + 1;
    }
}
