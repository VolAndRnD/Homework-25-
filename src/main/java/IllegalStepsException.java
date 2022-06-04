public class IllegalStepsException extends RuntimeException{
    public IllegalStepsException(){
        super("Steps can't be less then 0!");
    }

}