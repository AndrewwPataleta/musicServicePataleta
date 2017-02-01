package com.pataleta.musicService.dao;

import javax.persistence.*;

/**
 * Created by Andreww on 01.02.2017.
 */
@Entity
@Table(name = "basketauthors", schema = "musicpataleta", catalog = "")
public class BasketauthorsEntity {
    private int idbasketauthors;
    private Integer idAuthor;
    private Integer idSong;

    @Id
    @Column(name = "idbasketauthors", nullable = false)
    public int getIdbasketauthors() {
        return idbasketauthors;
    }

    public void setIdbasketauthors(int idbasketauthors) {
        this.idbasketauthors = idbasketauthors;
    }

    @Basic
    @Column(name = "idAuthor", nullable = true)
    public Integer getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(Integer idAuthor) {
        this.idAuthor = idAuthor;
    }

    @Basic
    @Column(name = "idSong", nullable = true)
    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasketauthorsEntity that = (BasketauthorsEntity) o;

        if (idbasketauthors != that.idbasketauthors) return false;
        if (idAuthor != null ? !idAuthor.equals(that.idAuthor) : that.idAuthor != null) return false;
        if (idSong != null ? !idSong.equals(that.idSong) : that.idSong != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idbasketauthors;
        result = 31 * result + (idAuthor != null ? idAuthor.hashCode() : 0);
        result = 31 * result + (idSong != null ? idSong.hashCode() : 0);
        return result;
    }
}
