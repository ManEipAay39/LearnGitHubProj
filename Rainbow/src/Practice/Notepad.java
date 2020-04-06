package Practice;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class Notepad {
	public static void main(String[] args)throws Exception{
		FileWriter fw=new FileWriter("C:\\Users\\manas\\Desktop\\Framework\\New.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		
		bw.write("Hi This is Manas");
		bw.newLine();
		bw.write("This is Selenium");
		bw.close();
		
		
		FileReader f=new FileReader("C:\\Users\\manas\\Desktop\\Framework\\READ.txt");
		BufferedReader b=new BufferedReader(f);
		//System.out.println(b.readLine());
		String s;
		while ((s=b.readLine())!=null)
			System.out.println(s);
	}

}
