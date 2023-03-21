package food.common;

import food.CutomerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { CutomerApplication.class })
public class CucumberSpingConfiguration {}
