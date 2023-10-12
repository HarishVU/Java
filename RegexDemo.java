import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo {
	public static void main(String[] args) {
		
		String str = "Tamil is oldest language";
		Pattern p = Pattern.compile("T|a|s|l");
//		Pattern p1 = Pattern.compile("^Tamil");
//		Pattern p2 = Pattern.compile("Tamil");
//		Pattern p3 = Pattern.compile("language$");
		Matcher m = p.matcher(str);
		
		while(m.find()) {
			System.out.println(m.group() + "starts at " + m.start() + " ends at " + m.end());
		}
		
	}
}
