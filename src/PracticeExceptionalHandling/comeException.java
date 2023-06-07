package PracticeExceptionalHandling;

public class comeException extends Exception {
	void ji() throws comeException
	{ 
		comeException dd=new comeException();
		throw dd;
	}

}
