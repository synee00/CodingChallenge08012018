package co.grandcircus.fileio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class CodingChallenge {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Chara> list = CharasFileUtil.readFile();
		
		String line = String.format("%-10s %-10s %-10s", "Name", "Class", "Level");
		String line2 = String.format("%-10s %-10s %-10s", "____", "_____", "_____");

		System.out.println(line);
		System.out.println(line2);
		
		
		System.out.println();

		for (Chara player : list) {
			System.out.println(player);
		}	
		
		CharasFileUtil.writeFile(list);

		
		Chara avatar = new Chara("Nathan", "Paladin", 36);
		CharasFileUtil.appendLine(avatar);
		Chara avatar1 = new Chara("Billy", "farmer", 2);
		CharasFileUtil.appendLine(avatar1);
		Chara avatar2 = new Chara("Bob", "jester", 1);
		CharasFileUtil.appendLine(avatar2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*try(FileOutputStream fileOutputStream = new FileOutputStream("Team.txt");)
		{

		}catch(IOException e)
		{
			e.printStackTrace();
		}finally
		{
			System.out.println("Done");
		}*/
	}

}
