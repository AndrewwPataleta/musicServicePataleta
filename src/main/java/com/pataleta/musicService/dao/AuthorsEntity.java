package com.pataleta.musicService.dao;

import javax.persistence.*;

/**
 * Created by Andreww on 01.02.2017.
 */
@Entity
@Table(name = "authors", schema = "musicpataleta", catalog = "")
public class AuthorsEntity {
    private int idauthor;
    private String nameAuthor;

    @Id
    @Column(name = "idauthor", nullable = false)
    public int getIdauthor() {
        return idauthor;
    }

    public void setIdauthor(int idauthor) {
        this.idauthor = idauthor;
    }

    @Basic
    @Column(name = "nameAuthor", nullable = true, length = 45)
    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AuthorsEntity that = (AuthorsEntity) o;

        if (idauthor != that.idauthor) return false;
        if (nameAuthor != null ? !nameAuthor.equals(that.nameAuthor) : that.nameAuthor != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idauthor;
        result = 31 * result + (nameAuthor != null ? nameAuthor.hashCode() : 0);
        return result;
    }
}
