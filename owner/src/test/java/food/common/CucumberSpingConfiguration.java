package food.common;

import food.OwnerApplication;
import io.cucumber.spring.CucumberContextConfiguration;
import org.springframework.boot.test.context.SpringBootTest;

@CucumberContextConfiguration
@SpringBootTest(classes = { OwnerApplication.class })
public class CucumberSpingConfiguration {}
