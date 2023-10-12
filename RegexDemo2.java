import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "abcabcsacbsbcbsdcbaebAKSBAJdebd012930921!@$#%%#@$%#";
//		Pattern p = Pattern.compile("[abc]");
//		Pattern p = Pattern.compile("[^abc]");
		Pattern p = Pattern.compile("[^0-9a-zA-Z]");
		Matcher m = p.matcher(str);		
		
		while(m.find()) {
			System.out.println(m.group() + " starts at " + m.start() + " ends at " + m.end());
		}
	}

}
