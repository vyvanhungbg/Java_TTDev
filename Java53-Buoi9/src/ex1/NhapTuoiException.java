package ex1;

public class NhapTuoiException extends Exception {
	public NhapTuoiException() {
		// TODO Auto-generated constructor stub
		
	}
	
	NhapTuoiException(String mes){
		super(mes); // super gọi lại kế thừa của char
	}
}
