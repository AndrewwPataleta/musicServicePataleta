package com.pataleta.musicService.model;


public class Author {
    private int idauthor;

    public int getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(int idauthor) {
        this.idauthor = idauthor;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    private String nameAuthor;

    public Author(){

    }

    public Author(int idauthor, String nameAuthor){
        this.idauthor = idauthor;
        this.nameAuthor = nameAuthor;
    }


}
