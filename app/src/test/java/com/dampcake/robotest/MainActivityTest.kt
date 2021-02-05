package com.dampcake.robotest

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowToast

@RunWith(RobolectricTestRunner::class)
@Config(constants = BuildConfig::class, sdk = [21])
class MainActivityTest {
    @Test
    fun testToastDisplayed() {
        Robolectric.setupActivity(MainActivity::class.java)
        Assert.assertEquals("Show Toast", ShadowToast.getTextOfLatestToast())
    }
}