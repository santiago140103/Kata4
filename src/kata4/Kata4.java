package kata4;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Kata4 {

    public static void main(String[] args) {
        Loader loader = new EmailLoader(new FileLoader(new File("email.txt")));
        List<String> list = loader.load();
        for (String S : list) {
            System.out.println(S);
        }
    }
    
}
