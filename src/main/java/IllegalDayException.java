public class IllegalDayException extends RuntimeException{
    public IllegalDayException(){
        super("Day can't be more then 365! ");
    }

}
