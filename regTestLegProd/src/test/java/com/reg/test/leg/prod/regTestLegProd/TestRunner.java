package com.reg.test.leg.prod.regTestLegProd;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(format = { "pretty", "json:target/cucumber.json" },features="src/test/resources/",glue="com.reg.test.steps",tags="@Reg")


public class TestRunner {
}
