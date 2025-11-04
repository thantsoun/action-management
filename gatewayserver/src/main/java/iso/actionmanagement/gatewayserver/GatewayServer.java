package iso.actionmanagement.gatewayserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.filter.ratelimit.RedisRateLimiter;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class GatewayServer {

	public static void main(String[] args) {
		SpringApplication.run(GatewayServer.class, args);
	}

    @Bean
    public RedisRateLimiter redisRateLimiter() {
        return new RedisRateLimiter(1, 1, 1);
    }
}
