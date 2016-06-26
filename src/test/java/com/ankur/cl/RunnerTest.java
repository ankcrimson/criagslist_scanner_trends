package com.ankur.cl;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Test Executor
 * Created by ankur on 6/26/16.
 */
@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty", "html:target/cucumber"},
        features = "src/test/resources/features/cl.feature", glue = "com.ankur.cl")
public class RunnerTest {
}
