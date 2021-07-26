package ro.msg.learning.shop.strategy;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
@ConfigurationProperties(prefix = "order")
public class OrderStrategyConfig {
    @Value("${order.strategy}")
    private StartType strategy;

    public void setStrategy(String strategy) {
        this.strategy = StartType.valueOf(strategy);
    }

    public enum StartType {SINGLE_LOCATION, MOST_ABUNDANT}
}
