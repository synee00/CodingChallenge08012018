package co.grandcircus.fileio;

public class example {

	public static void main(String[] args) {

		PlayersFileUtil.createBlankFile("hello.txt");
		PlayersFileUtil.createBlankFile("/Users/Syrose/Desktop/file2.txt");
		
		String userHome = System.getProperty("user.home");
		System.out.println(userHome);
		
		PlayersFileUtil.createDirectory(userHome + "/Desktop/myFolder");
	}

}
