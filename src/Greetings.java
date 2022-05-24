/*
/*
Annotations 02
Exercise: Annotations 2

create a class Greetings that has 2 methods with the custom annotations:
one method sayWelcome() was written by John Walker
the other method sayGoodbye() was written by Mark Brown
execute the 2 methods in a tester class
 */
public class Greetings {

    @DevAnnotation(
            DevName = "John",
            DevSurname = "Walker"
    )
    public String sayWelcome(){
        return "Welcome";
    }

    @DevAnnotation(
            DevName = "Mark",
            DevSurname = "Brown"
    )
    public String sayGoodbye(){
        return "Goodbye";
    }
}
