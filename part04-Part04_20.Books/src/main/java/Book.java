/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author phili
 */
public class Book {
    private String title;
    private int pageNum;
    private int pubYear;
    
    public Book(String title, int pages, int year) {
        this.title = title;
        this.pageNum = pages;
        this.pubYear = year;
    }
    
    public String getName() {
        return this.title;
    }
    
    public String getEverything() {
        return this.title + ", " + this.pageNum + " pages, " + this.pubYear;
    }
}
