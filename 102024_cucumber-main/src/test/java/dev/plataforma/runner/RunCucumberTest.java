package dev.plataforma.runner;

import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.IncludeEngines;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import static io.cucumber.junit.platform.engine.Constants.GLUE_PROPERTY_NAME;
import static io.cucumber.junit.platform.engine.Constants.FILTER_TAGS_PROPERTY_NAME;;

@Suite
@IncludeEngines("cucumber")
@SelectClasspathResource("features")
@ConfigurationParameter(key= GLUE_PROPERTY_NAME, value = "dev.plataforma.tests")
@ConfigurationParameter(key= FILTER_TAGS_PROPERTY_NAME, value = "@positivo")
@ConfigurationParameter(key= "cucumber.execution.dry-run", value="false") // false para executar o teste true para criar o teste
@ConfigurationParameter(key="cucumber.plugin",value="pretty, html:target/cucumber-report.html")

public class RunCucumberTest {
// não vamos incluir nada aqui
}
