package com.dampcake.robotest

import android.os.Build
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowToast
//import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.runner.AndroidJUnit4


@Config(sdk = [Build.VERSION_CODES.P])
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    @Test
    fun testToastDisplayed() {
        Robolectric.setupActivity(MainActivity::class.java)
        Assert.assertEquals("Show Toast", ShadowToast.getTextOfLatestToast())
    }
}