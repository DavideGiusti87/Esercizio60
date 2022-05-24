import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
Annotations 02
Exercise: Annotations 2

create a custom annotation called DevAnnotation that:
has 2 values:
a string DevName
a string DevSurname
has a runtime retention policy
targets elements of type method
*/

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DevAnnotation {
    String DevName();
    String DevSurname();
}
