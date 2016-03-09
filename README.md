# Robolectric-JaCoCo-Sample #
This project initially started out as a way to reproduce robolectric/robolectric#2230. It has since been updated to show how to get JaCoCo 0.7.6+ working with Robolectric and Android.

** Note **

This requires Gradle 2.13 for the moment. You can see the pull request here: gradle/gradle#575. If this gets pulled into another version I will update the sample.

## Running ##
To run the sample simply clone it and run

`gradlew testDebugUnitTestCoverage`

## Reports ##
You can find the output from the reports in the `app/build/reports/jacoco` folder.
