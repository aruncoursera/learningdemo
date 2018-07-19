package src.mf.com;

public class MessageCreator {
	
	final private String HELLOWORLD = "HELLO WORLD!";
	final private String HELLOUNIVERSE = "HELLO UNIVERSE!";

	public String getMessage(String  inputVal) throws Exception{
		inputVal = inputVal.toLowerCase();
		
		switch (inputVal) {
			case "world" :
					return HELLOWORLD;
			case "universe" :
					return HELLOUNIVERSE;
		    default :
		    		throw new Exception("Unknown Value");
		}
	}
}
