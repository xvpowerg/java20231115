/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch23_20240108.Ch23_6_iostream4;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;
/**
 *
 * @author xvpow
 */
public class MyFileReader extends InputStreamReader {
    //預設編碼utf-8
    //可以傳入字串改變編碼
    public MyFileReader(File file,String charset)
            throws FileNotFoundException,UnsupportedEncodingException{
        super(new FileInputStream(file),charset);
    }
    public MyFileReader(File file) throws FileNotFoundException,UnsupportedEncodingException{
        this(file,"utf-8");
    }
}
