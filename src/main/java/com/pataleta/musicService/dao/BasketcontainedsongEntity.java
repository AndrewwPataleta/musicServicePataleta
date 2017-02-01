package com.pataleta.musicService.dao;

import javax.persistence.*;

/**
 * Created by Andreww on 01.02.2017.
 */
@Entity
@Table(name = "basketcontainedsong", schema = "musicpataleta", catalog = "")
public class BasketcontainedsongEntity {
    private int idBasketContainedSong;
    private Integer idPlaylist;
    private Integer idSong;

    @Id
    @Column(name = "idBasketContainedSong", nullable = false)
    public int getIdBasketContainedSong() {
        return idBasketContainedSong;
    }

    public void setIdBasketContainedSong(int idBasketContainedSong) {
        this.idBasketContainedSong = idBasketContainedSong;
    }

    @Basic
    @Column(name = "idPlaylist", nullable = true)
    public Integer getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(Integer idPlaylist) {
        this.idPlaylist = idPlaylist;
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

        BasketcontainedsongEntity that = (BasketcontainedsongEntity) o;

        if (idBasketContainedSong != that.idBasketContainedSong) return false;
        if (idPlaylist != null ? !idPlaylist.equals(that.idPlaylist) : that.idPlaylist != null) return false;
        if (idSong != null ? !idSong.equals(that.idSong) : that.idSong != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idBasketContainedSong;
        result = 31 * result + (idPlaylist != null ? idPlaylist.hashCode() : 0);
        result = 31 * result + (idSong != null ? idSong.hashCode() : 0);
        return result;
    }
}
