package com.pataleta.musicService.model;


import java.util.ArrayList;

public class Song {

    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    public String getSongName() {
        return SongName;
    }

    public void setSongName(String songName) {
        SongName = songName;
    }

    public int getYearPublish() {
        return YearPublish;
    }

    public void setYearPublish(int yearPublish) {
        YearPublish = yearPublish;
    }

    private int idSong;
    private String SongName;
    private ArrayList<Genre> collectionOfGenres;
    private int YearPublish;
    private ArrayList<Author> collectionOfAuthors;

    public Song(){}

    public Song(int idSong, ArrayList<Author> collectionOfAuthors, int yearPublish, ArrayList<Genre> collectionOfGenres){
        this.idSong = idSong;
        this.collectionOfAuthors = collectionOfAuthors;
        this.YearPublish = yearPublish;
        this.collectionOfGenres = collectionOfGenres;
    }

    public String toString(){
        return  " Имя: "+getSongName()+" год публикации: "+getYearPublish();
    }

}
