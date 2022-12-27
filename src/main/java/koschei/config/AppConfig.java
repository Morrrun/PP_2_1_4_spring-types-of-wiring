package koschei.config;

import koschei.models.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "koschei")
public class AppConfig {

    @Bean
    public static Island2 getIsland(@Qualifier("woodBean") Wood3 wood) {
        return new Island2(wood);
    }

    @Bean
    public static Duck5 getDuck(@Qualifier("eggBean") Egg6 egg) {
        return new Duck5(egg);
    }

    @Bean
    public static Death8 getDeath() {
        return new Death8();
    }
}
