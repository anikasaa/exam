package TESTS;

import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String fileName = "anisha.txt";

		try {

			FileWriter writer = new FileWriter(fileName);

			writer.write("hello my name is anisha");
			writer.write("\n");
			writer.write("i live in boston");
			writer.write("\n");
			writer.write("i love to bake");
			writer.write("\n");
			writer.close();

			System.out.println("information has been succesfully written and closed");
		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();

		}

	}

}
