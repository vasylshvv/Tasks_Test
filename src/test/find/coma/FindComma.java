package test.find.coma;

/**
 * @author Vasyl Shypivdych
 * */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FindComma {
	private static final String FILENAME = "file.txt";

	public static void main(String[] args) {

		BufferedReader br = null;
		FileReader fr = null;
		try {
			/*find file and read*/
			fr = new FileReader(FILENAME);
			br = new BufferedReader(fr);

			String stringLine;
			// Read line text
			while ((stringLine = br.readLine()) != null) {
				String output = findComma(stringLine);
				System.out.println(output);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();

			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}

	public static String findComma(String text) {
		String substr = "";
		// for line each symbol, when we found comma, we stop   
		for (int i = 0; i < text.length(); i++) {
			char c = text.charAt(i);
			if (c == ',')
				break;
			substr = substr + c;
		}
		return substr;
	}
}
