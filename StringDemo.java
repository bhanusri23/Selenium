
public class StringDemo {

	public static void main(String[] args) {
		String str = new String();
		str = "We are in classroom ";
		System.out.println(str.length()); // 19
		
		String str2 = "Today";
		System.out.println(str2.length()); // 5
		String str3 = "We are in classroom ";
		System.out.println(str3.charAt(5)); // e
		
		System.out.println(str.concat(str2)); // We are in classroom Today
		
		System.out.println(str.indexOf("a")); // 3
		
		System.out.println(str.equals(str3)); // true
		
		System.out.println(str.equalsIgnoreCase(str3));// true
		
		System.out.println(str.substring(3));// are in classroom 
		

	}

}

