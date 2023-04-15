package com.jenkins;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    
    @Test
    public void shouldAnswerWithTrueget()
    {
        assertTrue( true );
    }
    
    @Test
    public void shouldAnswerWithfalseget()
    {
        assertEquals(0, 0);
    }
    
    @Test
    public void shouldAnswerWithfalse()
    {
        assertEquals(0, 1);
    }
}