package org.example;

import org.junit.Assert;
import org.junit.Test;

public class HandshakeProblemTest {
    @Test
    public void SampleTest() {
        Assert.assertEquals(1, HandshakeProblem.GetParticipants(0));
        Assert.assertEquals(2, HandshakeProblem.GetParticipants(1));
        Assert.assertEquals(3, HandshakeProblem.GetParticipants(3));
        Assert.assertEquals(4, HandshakeProblem.GetParticipants(6));
        Assert.assertEquals(5, HandshakeProblem.GetParticipants(7));
    }
}