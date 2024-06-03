package vnavesnoj.ads_loader_service.integration.annotation;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.ActiveProfiles;
import vnavesnoj.ads_loader_service.integration.config.TestContainersConfig;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author vnavesnoj
 * @mail vnavesnoj@gmail.com
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import(TestContainersConfig.class)
@ActiveProfiles("it")
@SpringBootTest
public @interface IT {
}
