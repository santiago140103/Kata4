/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author saflo
 */
public class EmailLoader implements Loader {
    
    private final Loader loader;
    private final Pattern emailPattern = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");

    public EmailLoader(Loader loader) {
        this.loader = loader;
    }
    
    
    @Override
    public List<String> load() {
        List<String> list = new ArrayList<>();
        List<String> source = loader.load();
        for (String email : source) {
            if (isEmail(email)) list.add(email);
        }
        return list;
        
    }

    private boolean isEmail(String email) {
        return emailPattern.matcher(email).matches();
    }
    
}
