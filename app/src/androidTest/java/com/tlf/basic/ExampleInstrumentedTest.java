package com.tlf.basic;


import org.junit.Test;


/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        String one ="./gradlew clean build bintrayUpload -PbintrayUser=vic-tan -PbintrayKey=8970dbd317d720d9b1176877f90c9bd6a431e650 -PdryRun=false";
    }
}
