package com.training.unittesting

import org.junit.After
import org.junit.Before
import org.junit.Test

class QuickBeforeAfterTest {

    // the setUp() method will run before every test .
    @Before
    fun setUp() {
        System.out.println("Before test")
    }

    @Test
    fun test1() {
        System.out.println("Test1")
    }

    @Test
    fun test2() {
        System.out.println("Test2")
    }

    // the tearDown() method will run before every test .
    @After
    fun tearDown() {
        System.out.println("After test")
    }
}