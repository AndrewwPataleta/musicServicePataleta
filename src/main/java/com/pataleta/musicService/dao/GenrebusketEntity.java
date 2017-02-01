package com.pataleta.musicService.dao;

import javax.persistence.*;

@Entity
@Table(name = "genrebusket", schema = "musicpataleta", catalog = "")
public class GenrebusketEntity {
    private int genreBusketId;
    private Integer idSong;
    private Integer idGenre;

    @Id
    @Column(name = "genreBusketID", nullable = false)
    public int getGenreBusketId() {
        return genreBusketId;
    }

    public void setGenreBusketId(int genreBusketId) {
        this.genreBusketId = genreBusketId;
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
    @Column(name = "idGenre", nullable = true)
    public Integer getIdGenre() {
        return idGenre;
    }

    public void setIdGenre(Integer idGenre) {
        this.idGenre = idGenre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GenrebusketEntity that = (GenrebusketEntity) o;

        if (genreBusketId != that.genreBusketId) return false;
        if (idSong != null ? !idSong.equals(that.idSong) : that.idSong != null) return false;
        if (idGenre != null ? !idGenre.equals(that.idGenre) : that.idGenre != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = genreBusketId;
        result = 31 * result + (idSong != null ? idSong.hashCode() : 0);
        result = 31 * result + (idGenre != null ? idGenre.hashCode() : 0);
        return result;
    }
}
