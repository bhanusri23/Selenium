
public class FilePath {

	public static void main(String[] args) {
		
		String str = "//home//bhanu//Selenium//Box.java";
		
		int p = str.indexOf(".");
		System.out.println(str.substring(p));
		
		// or
		
		System.out.println(str.substring(str.indexOf(".")));
		
	}

}

