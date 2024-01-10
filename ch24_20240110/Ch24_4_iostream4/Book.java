/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ch24_20240110.Ch24_4_iostream4;

import java.io.Serializable;

/**
 *
 * @author xvpow
 */
public class Book {
    private String isbn;
        public Book(){}
   public void setIsbn(String isbn){
        this.isbn = isbn;
   }
    public String toString(){
        return "Book:"+this.isbn;
    }
}
