/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kata4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author saflo
 */
public class FileLoader implements Loader {
    
    private final File file;
    
    public FileLoader(File file) {
        this.file = file;        
    }

    @Override
    public List<String> load() {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(file))){
            while (true) {              
                String line = reader.readLine();
                if (line == null) break;
                list.add(line);
                
            }
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileLoader.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(FileLoader.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return list;
    }
}
