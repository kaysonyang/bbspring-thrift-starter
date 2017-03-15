package bb.spring.boot.thrift.server.annotation;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * Created by kayson on 16/1/11.
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Component
public @interface ThriftController {

    String[] value() default {};
}