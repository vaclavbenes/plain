package com.example.plain

import androidx.test.platform.app.InstrumentationRegistry
import com.avast.android.test.utils.espresso.BaseEspressoTest
import org.junit.Assert.assertEquals
import org.junit.Test


/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleInstrumentedTest : BaseEspressoTest() {

    @Test
    fun useAppContext() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.plain", appContext.packageName)
    }

    @Test
    fun useAppContextFail() {
        // Context of the app under test.
        val appContext = InstrumentationRegistry.getInstrumentation().targetContext
        assertEquals("com.example.plainX", appContext.packageName)
    }
}


