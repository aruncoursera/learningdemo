package test.mf.com;
import java.io.*;  



public class HiddenMessageReader {

	private BufferedReader reader;
	
	
	//Known Values
	String directoryName = "C:\\etc";
	String worldFile = "HiddenWorld.txt";
	String universeFile = "HiddenUniverse.txt";
	
	
	//hidden message files to be found
	String worldfilepath =  directoryName + "/" + worldFile;
	String universefilepath =  directoryName + "/" + universeFile;
	
	//message to validate
	String worldmessage = "HELLO WORLD!";
	String universemessage = "HELLO UNIVERSE!";
	
	// Methods
	
	public boolean checkHiddenWorld() {
		System.out.println(worldfilepath);
		File fileObj = new File (worldfilepath);
		return fileObj.exists();
	}
	
	public boolean HiddenWorldContentMatches() {
		boolean textMatch = false;
		if (! checkHiddenWorld()) {
			return textMatch;
		}
		try {
			reader = new BufferedReader(new FileReader(worldfilepath));
			String line = reader.readLine();
			if (line != null) {
				System.out.println(line);
				if(line.matches(worldmessage)) {
					textMatch = true;
				}else {
					textMatch = false;
				}
			}
			//read next line
			line = reader.readLine();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			textMatch = false;
		}
		return textMatch;
	}
	
	public boolean checkHiddenUniverse() {
		System.out.println(worldfilepath);
		File fileObj = new File (universefilepath);
		return fileObj.exists();
	}
	
	public boolean HiddenUniverseContentMatches() {
		boolean textMatch= false;;
		if (! checkHiddenUniverse()) {
			return textMatch;
		}
		try {
			reader = new BufferedReader(new FileReader(universefilepath));
			String line = reader.readLine();
			if (line != null) {
				System.out.println(line);
				if (line.matches(universemessage)) {
					textMatch = true;
				}else {
					textMatch = false;
				}
			}
			//read next line
			line = reader.readLine();
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
			textMatch = false;
		}
		return textMatch;
	}
}
