import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CountString {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("hell","hi","hello","heaven");

        List<String> slist = list.stream()
                .filter(str -> str.length() > 3)
                .collect(Collectors.toList());

        System.out.println("greater than 3 is " + slist);
    }
}
