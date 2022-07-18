package pro.sky.java.course.task22.exception;

public class YouCantDivideByZero extends IllegalArgumentException {

    public YouCantDivideByZero(String message) {
        super(message);
    }
}
