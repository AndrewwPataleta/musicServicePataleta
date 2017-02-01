package com.pataleta.musicService.dao;

import javax.persistence.*;

/**
 * Created by Andreww on 01.02.2017.
 */
@Entity
@Table(name = "user", schema = "musicpataleta", catalog = "")
public class UserEntity {
    private int idUser;
    private String login;
    private String password;
    private Integer idBasketPlaylists;

    @Id
    @Column(name = "idUser", nullable = false)
    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    @Basic
    @Column(name = "login", nullable = true, length = 45)
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Basic
    @Column(name = "password", nullable = true, length = 45)
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "idBasketPlaylists", nullable = true)
    public Integer getIdBasketPlaylists() {
        return idBasketPlaylists;
    }

    public void setIdBasketPlaylists(Integer idBasketPlaylists) {
        this.idBasketPlaylists = idBasketPlaylists;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserEntity that = (UserEntity) o;

        if (idUser != that.idUser) return false;
        if (login != null ? !login.equals(that.login) : that.login != null) return false;
        if (password != null ? !password.equals(that.password) : that.password != null) return false;
        if (idBasketPlaylists != null ? !idBasketPlaylists.equals(that.idBasketPlaylists) : that.idBasketPlaylists != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idUser;
        result = 31 * result + (login != null ? login.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (idBasketPlaylists != null ? idBasketPlaylists.hashCode() : 0);
        return result;
    }
}
