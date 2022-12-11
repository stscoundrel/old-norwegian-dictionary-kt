package io.github.stscoundrel.oldnorwegian

import org.junit.Test
import org.junit.Assert.assertTrue
import org.junit.Assert.assertFalse
import org.junit.Assert.assertEquals

class AppTest {
    @Test
    fun testCasesRun() {
        assertTrue(true)
        assertFalse(false)

        assertEquals(dummyMethod(2, 2), 4)
        assertEquals(dummyMethod(2, 4), 6)
    }
}