package src.mf.com;

import java.io.*;


public class FileGenerator {
	private final String directoryName = "etc";
	private MessageCreator mcObj = new MessageCreator();
	
	public void createDir() {
		System.out.println("directoryName : "+directoryName);    
		File dirObj = new File(directoryName);
		if(!dirObj.exists()) {
			dirObj.mkdirs();
		}
	}
	public void createHiddenWorld() {
		
		try {
			createDir();
			
			String fileName = directoryName + "/" + "HiddenWorld.txt";
			FileWriter fw = new FileWriter(fileName);    
			fw.write(mcObj.getMessage("world"));    
			fw.close();
		} catch  (Exception e) {
			  System.out.println("Something Failed...");    
		}
	}
	
	public void createHiddenUniverse() {
		try {
			createDir();
			
			String fileName = directoryName + "/" + "HiddenUniverse.txt";
			FileWriter fw = new FileWriter(fileName);    
			fw.write(mcObj.getMessage("universe"));    
			fw.close();
		} catch  (Exception e) {
			  System.out.println("Something Failed...");    
		}
	}


}
