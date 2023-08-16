package com.ecommer.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;
@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
    features ={"src/test/resources/features"},
        glue="com.ecommer.glue",
        tags="@happyPath"

        )
public class RunnerTest {

}
