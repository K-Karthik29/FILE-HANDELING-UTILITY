import java.io.File;
import java.io.FileWriter;
import java.io.write;
import java.io.FileReader;
import java.io.IOException;
public class FileHandelingUtility {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String data = "140,karthik,anantapur,andhrapradesh.";
		// data which is to be written in the file
		File MyFile = new File("data1.txt");
		// creating a file named data1
		try {
			if (MyFile.createNewFile()) {
				System.out.println("file created sucessfully....");
			} else {
				System.out.println("file not created,,,");
			}
		} catch (IOException ex) {
			System.out.println("file creation error..,,");
		}
		// using try and catch statements for exceptionn handeling
		// writing the the data into the file//
		try {
			FileWriter output = new FileWriter("data1.txt");
			output.write(data);
			// writing data to the text file
			System.out.println("writing data sucessful....");
			output.close();
		} catch (IOException ex) {
			System.out.println("file writing error,,,");
		}
		char[] data1 = new char[100];
		try {
			FileReader input = new FileReader("data1.txt");
			input.read(data1);
			System.out.println("data recived from a file");
			System.out.println(data1);
			input.close();
		} catch (IOException ex) {
			System.out.println("file read error,,,,");
		}
		String kara = "this is the  append data which is added to the existing data";
		try {
			FileWriter output = new FileWriter("data1.txt", true);
			output.write(kara);
			System.out.println("append sucessful");
			output.close();
		} catch (IOException ex) {
			System.out.println("file append error..");
		}
	}
}
