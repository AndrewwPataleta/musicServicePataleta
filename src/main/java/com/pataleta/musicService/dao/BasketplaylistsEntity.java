package com.pataleta.musicService.dao;

import javax.persistence.*;

/**
 * Created by Andreww on 01.02.2017.
 */
@Entity
@Table(name = "basketplaylists", schema = "musicpataleta", catalog = "")
public class BasketplaylistsEntity {
    private int idbasketplaylists;
    private Integer idPlaylist;
    private Integer idUser;

    @Id
    @Column(name = "idbasketplaylists", nullable = false)
    public int getIdbasketplaylists() {
        return idbasketplaylists;
    }

    public void setIdbasketplaylists(int idbasketplaylists) {
        this.idbasketplaylists = idbasketplaylists;
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
    @Column(name = "idUser", nullable = true)
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BasketplaylistsEntity that = (BasketplaylistsEntity) o;

        if (idbasketplaylists != that.idbasketplaylists) return false;
        if (idPlaylist != null ? !idPlaylist.equals(that.idPlaylist) : that.idPlaylist != null) return false;
        if (idUser != null ? !idUser.equals(that.idUser) : that.idUser != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idbasketplaylists;
        result = 31 * result + (idPlaylist != null ? idPlaylist.hashCode() : 0);
        result = 31 * result + (idUser != null ? idUser.hashCode() : 0);
        return result;
    }
}
