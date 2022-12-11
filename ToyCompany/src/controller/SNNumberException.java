package controller;

public class SNNumberException extends Exception {
	private String error;
    public SNNumberException(String error)
    {
       super(error);
       this.error = error;
    }
    public String toString() {
        return error+ "Try Again."; 
    }   

}
