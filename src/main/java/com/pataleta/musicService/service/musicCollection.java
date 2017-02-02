package com.pataleta.musicService.service;

import com.pataleta.musicService.model.Author;
import com.pataleta.musicService.model.Genre;
import com.pataleta.musicService.model.Song;
import com.pataleta.musicService.model.workWithDB;

import java.sql.ResultSet;
import java.util.ArrayList;

public class musicCollection {
    private ArrayList<Song> collectionOfSong;

    public musicCollection(){
//        try {
//            ResultSet resultSet = workWithDB.executeQuery(" Select Song.idSong, SongName, YearPublish, genres.idGenre, genreName, description " +
//                    " idauthor, nameAuthor From Song" +
//                    " join basketauthors on basketauthors.idSong = song.idbasketauthors " +
//                    " join genrebusket on genrebusket.idSong = song.GenreBusketID " +
//                    " join genres on genres.idGenre = genrebusket.idGenre " +
//                    " join authors on authors.idauthor = basketauthors.idAuthor ");
//            while (resultSet.next()) {
//                System.out.println(resultSet.getString("SongName")+" "+resultSet.getString("genreName"));
//            }
//        }catch (Exception e ){
//        try {
//            ResultSet resultSetIdPlaylists = workWithDB.executeQuery(" Select basketplaylists.idPlaylist, namePlaylist from basketplaylists  " +
//                    "join playlist on playlist.idBasketContainedSong = basketplaylists.idPlaylist" +
//                    " where idUser = 1");
//
//            ArrayList<playlist> setOfPlaylists = new ArrayList<>();
//
//            while (resultSetIdPlaylists.next()){
//                cmbBoxPlaylists.getItems().add(resultSetIdPlaylists.getString("namePlaylist"));
//                playlist playlistFromDB = new playlist();
//                playlistFromDB.setNamePlaylist(resultSetIdPlaylists.getString("namePlaylist"));
//                ResultSet resultSetJoinedSong = workWithDB.executeQuery(" Select song.idSong, SongName, idbasketauthors, YearPublish, GenreBusketID from basketcontainedsong " +
//                        " join song on basketcontainedsong.idSong = song.idSong " +
//                        " where idPlaylist = "+resultSetIdPlaylists.getInt("idPlaylist")+" ");
//
//                while (resultSetJoinedSong.next()){
//                    ArrayList<String> genres = new ArrayList<>();
//                    ArrayList<String> authors = new ArrayList<>();
//                    ResultSet resultSetJoinedAuthors = workWithDB.executeQuery("Select nameAuthor from basketauthors" +
//                            " join authors on authors.idauthor = basketauthors.idAuthor " +
//                            " where basketauthors.idSong = "+resultSetJoinedSong.getInt("idSong")+"");
//
//                    while (resultSetJoinedAuthors.next())
//                        authors.add(resultSetJoinedAuthors.getString("nameAuthor"));
//
//                    ResultSet resultSetJoinedGenres = workWithDB.executeQuery("Select genreName from genrebusket " +
//                            " join genres on genres.idGenre = genrebusket.idGenre " +
//                            " where idSong = "+resultSetJoinedSong.getInt("idSong")+"");
//
//                    while(resultSetJoinedGenres.next())
//                        genres.add(resultSetJoinedGenres.getString("genreName"));
//
//                    playlistFromDB.addNewSong(new Song(
//                            authors,
//                            resultSetJoinedSong.getString("SongName"),
//                            resultSetJoinedSong.getInt("YearPublish"),
//                            genres ));
//
//                }
//                setOfPlaylists.add(playlistFromDB);
//            }
//            user.setCollectionOfPlaylists(setOfPlaylists);
//        }catch (Exception e){
//            e.printStackTrace();
//        }

        try {
            ResultSet resultSetAllSong = workWithDB.executeQuery("Select * from Song");
            while(resultSetAllSong.next()){
                    ResultSet resultSetListAuthors = workWithDB.executeQuery(" Select authors.idauthor, nameAuthor from basketauthors" +
                            " join authors on authors.idauthor = basketauthors.idAuthor " +
                            " where basketauthors.idSong = '"+resultSetAllSong.getString("idSong")+"'");
                    ArrayList<Author> collectionOfAuthors = new ArrayList<Author>();
                    while (resultSetListAuthors.next()){
                         collectionOfAuthors.add(new Author(
                                 resultSetListAuthors.getInt("idauthor"),
                                 resultSetListAuthors.getString("nameAuthor")
                                 )
                         );
                    }
                    ResultSet resultSetListGenres = workWithDB.executeQuery(" Select genres.idGenre, genreName, description from genrebusket " +
                            " join genres on genres.idGenre = genrebusket.idGenre " +
                            " where genrebusket.idSong = '"+resultSetAllSong.getString("idSong")+"'");
                    ArrayList<Genre> collectionOfGenres = new ArrayList<Genre>();
                    while (resultSetListGenres.next()){
                        collectionOfGenres.add(new Genre(
                            resultSetListGenres.getInt("idGenre"),
                            resultSetListGenres.getString("genreName"),
                            resultSetListGenres.getString("description")
                        ));
                    }
                collectionOfSong.add(new Song(
                        resultSetAllSong.getInt("idSong"),
                        collectionOfAuthors,
                        resultSetAllSong.getInt("YearPublish"),
                        collectionOfGenres
                ));
            }
        }catch (Exception e){}
    }

    public ArrayList<Song> getCollectionOfSong(){
        return collectionOfSong;
    }

}

