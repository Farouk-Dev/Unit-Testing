package com.training.unittesting

import org.junit.*

class QuickBeforeAfterTest {

    companion object {
        // the beforeClass() method will run just one time before the first test is executed .
        @BeforeClass
        fun beforeClass() {
            println("@BeforeClass")
        }

        // the afterClass() method will run just one time after all the tests are executed .
        @AfterClass
        fun afterClass() {
            println("@BeforeClass")
        }
    }


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