package com.dampcake.robotest

import android.os.Build
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.rule.ActivityTestRule
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowToast
//import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.runner.AndroidJUnit4
import org.junit.Rule


@Config(sdk = [Build.VERSION_CODES.P])
@RunWith(AndroidJUnit4::class)
class MainActivityTest {
    /*
    @get:Rule
    var activityRule: ActivityScenarioRule<MainActivity>
            = ActivityScenarioRule(MainActivity::class.java)

     */

    // TODO: The above
    @get:Rule
    var activityRule: ActivityTestRule<MainActivity>
            = ActivityTestRule(MainActivity::class.java)

    @Test
    fun testTappedOnce() {
        onView(withId(R.id.textView)).check(matches(isDisplayed()))
        onView(withId(R.id.button)).perform(click())

        // Note: before checking the new value there is an empty part
        // of the gutter for hits=1 on the rest
        onView(withText("Tapped 1 time")).check(matches(isDisplayed()))
    }

    // two tests so easier to experiment with
    // replace active suites and uncovered code etc.
    @Test
    fun testTappedMoreThanOnce() {
        onView(withId(R.id.textView)).check(matches(isDisplayed()))
        onView(withId(R.id.button)).perform(click())
        onView(withId(R.id.button)).perform(click())

        // Note: before checking the new value there is an empty part
        // of the gutter for hits=1 on the rest
        onView(withText("tapped more than one time")).check(matches(isDisplayed()))
    }
}