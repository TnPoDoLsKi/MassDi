package annotation;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.CONSTRUCTOR,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Inject {
}
