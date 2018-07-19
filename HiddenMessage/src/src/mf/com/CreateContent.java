package src.mf.com;

public class CreateContent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Working Directory = " + System.getProperty("user.dir"));
		FileGenerator fgobj = new FileGenerator();
		fgobj.createHiddenUniverse();
		fgobj.createHiddenWorld();
		
	}

}
