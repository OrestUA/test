/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package l4;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author aleksandr
 */
public class FileCopy {
    
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String fileIn = "d:\\1.txt";
        String fileOut = "d:\\2.zip";
        
        Files.copy(Paths.get(fileIn), Paths.get(fileOut));
        Files.newBufferedReader(Paths.get(fileIn), Charset.forName("UTF-8"));
        
        try(FileInputStream fi = new FileInputStream(fileIn); 
                FileOutputStream fo =new FileOutputStream(fileOut);
                ){
            int max = 4096;
            ByteBuffer bb = ByteBuffer.allocate(max);
            FileChannel fc = fi.getChannel();
            FileChannel fc2 = fo.getChannel();
            fc.transferFrom(fc,0, fc.size());
        } catch(Exception ex){
            ex.fillInStackTrace();
        }
    }
    
}
