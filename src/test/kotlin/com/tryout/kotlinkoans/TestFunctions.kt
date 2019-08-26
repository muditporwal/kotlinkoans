package com.tryout.kotlinkoans

import org.junit.Test
import org.junit.Assert

class TestFunctions {
    @Test fun collection() {
        Assert.assertEquals("Functions:toJSON".toMessageInEquals(), "[1, 2, 3, 42, 555]", toJSON(listOf(1, 2, 3, 42, 555)))
    }
}