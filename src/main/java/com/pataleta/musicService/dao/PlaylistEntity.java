package com.pataleta.musicService.dao;

import javax.persistence.*;

/**
 * Created by Andreww on 01.02.2017.
 */
@Entity
@Table(name = "playlist", schema = "musicpataleta", catalog = "")
public class PlaylistEntity {
    private int idPlaylist;
    private String namePlaylist;
    private Integer idBasketContainedSong;

    @Id
    @Column(name = "idPlaylist", nullable = false)
    public int getIdPlaylist() {
        return idPlaylist;
    }

    public void setIdPlaylist(int idPlaylist) {
        this.idPlaylist = idPlaylist;
    }

    @Basic
    @Column(name = "namePlaylist", nullable = true, length = 45)
    public String getNamePlaylist() {
        return namePlaylist;
    }

    public void setNamePlaylist(String namePlaylist) {
        this.namePlaylist = namePlaylist;
    }

    @Basic
    @Column(name = "idBasketContainedSong", nullable = true)
    public Integer getIdBasketContainedSong() {
        return idBasketContainedSong;
    }

    public void setIdBasketContainedSong(Integer idBasketContainedSong) {
        this.idBasketContainedSong = idBasketContainedSong;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PlaylistEntity that = (PlaylistEntity) o;

        if (idPlaylist != that.idPlaylist) return false;
        if (namePlaylist != null ? !namePlaylist.equals(that.namePlaylist) : that.namePlaylist != null) return false;
        if (idBasketContainedSong != null ? !idBasketContainedSong.equals(that.idBasketContainedSong) : that.idBasketContainedSong != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idPlaylist;
        result = 31 * result + (namePlaylist != null ? namePlaylist.hashCode() : 0);
        result = 31 * result + (idBasketContainedSong != null ? idBasketContainedSong.hashCode() : 0);
        return result;
    }
}
