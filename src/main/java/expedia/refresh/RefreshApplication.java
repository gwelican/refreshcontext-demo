package expedia.refresh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication(scanBasePackages = "expedia")
@EnableConfigurationProperties(RefreshableData.class)
public class RefreshApplication {

  public static void main(String[] args) {
    SpringApplication.run(RefreshApplication.class, args);
  }
}
