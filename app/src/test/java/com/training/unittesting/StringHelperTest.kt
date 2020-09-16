package com.training.unittesting

import org.junit.After
import org.junit.Before
import org.junit.Test

import org.junit.Assert.*

class StringHelperTest {
    private var stringHelper = StringHelper()

    @Test
    fun truncateAInFirst2PositionsTest1() {
        //  AACD -> CD
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("AACD"))
    }

    @Test
    fun truncateAInFirst2PositionsTest2() {
        // ACD -> CD
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("ACD"))
    }

    @Test
    fun truncateAInFirst2PositionsTest3() {
        //   CAD -> CD
        assertEquals("CD", stringHelper.truncateAInFirst2Positions("CAD"))
    }

    @Test
    fun truncateAInFirst2PositionsTest4() {
        // CDAA -> CDAA
        assertEquals("CDAA", stringHelper.truncateAInFirst2Positions("CDAA"))
    }
    @Test
    fun areFirstAndLastTwoCharactersTheSameTest1(){
        // A -> false
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("A"))
    }
    @Test
    fun areFirstAndLastTwoCharactersTheSameTest2(){
        // AC -> true
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("AC"))
    }
    @Test
    fun areFirstAndLastTwoCharactersTheSameTest3(){
        // CACA -> true
        assertTrue(stringHelper.areFirstAndLastTwoCharactersTheSame("CACA"))
    }
    @Test
    fun areFirstAndLastTwoCharactersTheSameTest4(){
        //  CDAA -> false
        assertFalse(stringHelper.areFirstAndLastTwoCharactersTheSame("CDAA"))
    }
}