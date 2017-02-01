package com.pataleta.musicService.dao;

import javax.persistence.*;

/**
 * Created by Andreww on 01.02.2017.
 */
@Entity
@Table(name = "song", schema = "musicpataleta", catalog = "")
public class SongEntity {
    private int idSong;
    private String songName;
    private int idbasketauthors;
    private Integer yearPublish;
    private int genreBusketId;

    @Id
    @Column(name = "idSong", nullable = false)
    public int getIdSong() {
        return idSong;
    }

    public void setIdSong(int idSong) {
        this.idSong = idSong;
    }

    @Basic
    @Column(name = "SongName", nullable = true, length = 45)
    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    @Basic
    @Column(name = "idbasketauthors", nullable = false)
    public int getIdbasketauthors() {
        return idbasketauthors;
    }

    public void setIdbasketauthors(int idbasketauthors) {
        this.idbasketauthors = idbasketauthors;
    }

    @Basic
    @Column(name = "YearPublish", nullable = true)
    public Integer getYearPublish() {
        return yearPublish;
    }

    public void setYearPublish(Integer yearPublish) {
        this.yearPublish = yearPublish;
    }

    @Basic
    @Column(name = "GenreBusketID", nullable = false)
    public int getGenreBusketId() {
        return genreBusketId;
    }

    public void setGenreBusketId(int genreBusketId) {
        this.genreBusketId = genreBusketId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SongEntity that = (SongEntity) o;

        if (idSong != that.idSong) return false;
        if (idbasketauthors != that.idbasketauthors) return false;
        if (genreBusketId != that.genreBusketId) return false;
        if (songName != null ? !songName.equals(that.songName) : that.songName != null) return false;
        if (yearPublish != null ? !yearPublish.equals(that.yearPublish) : that.yearPublish != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSong;
        result = 31 * result + (songName != null ? songName.hashCode() : 0);
        result = 31 * result + idbasketauthors;
        result = 31 * result + (yearPublish != null ? yearPublish.hashCode() : 0);
        result = 31 * result + genreBusketId;
        return result;
    }
}
