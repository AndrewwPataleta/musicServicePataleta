package com.pataleta.musicService.dao;

import javax.persistence.*;

/**
 * Created by Andreww on 01.02.2017.
 */
@Entity
@Table(name = "ratingsongs", schema = "musicpataleta", catalog = "")
public class RatingsongsEntity {
    private int idratingSongs;
    private Integer idSong;
    private Integer idUser;
    private Integer value;

    @Id
    @Column(name = "idratingSongs", nullable = false)
    public int getIdratingSongs() {
        return idratingSongs;
    }

    public void setIdratingSongs(int idratingSongs) {
        this.idratingSongs = idratingSongs;
    }

    @Basic
    @Column(name = "idSong", nullable = true)
    public Integer getIdSong() {
        return idSong;
    }

    public void setIdSong(Integer idSong) {
        this.idSong = idSong;
    }

    @Basic
    @Column(name = "idUser", nullable = true)
    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(Integer idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "Value", nullable = true)
    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingsongsEntity that = (RatingsongsEntity) o;

        if (idratingSongs != that.idratingSongs) return false;
        if (idSong != null ? !idSong.equals(that.idSong) : that.idSong != null) return false;
        if (idUser != null ? !idUser.equals(that.idUser) : that.idUser != null) return false;
        if (value != null ? !value.equals(that.value) : that.value != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idratingSongs;
        result = 31 * result + (idSong != null ? idSong.hashCode() : 0);
        result = 31 * result + (idUser != null ? idUser.hashCode() : 0);
        result = 31 * result + (value != null ? value.hashCode() : 0);
        return result;
    }
}
