package cic.ipn.mx.collectionsexample.model;

import java.io.Serializable;

public class SongModel implements Serializable {

    private String tittle;
    private String artist;
    private String duration;

    public SongModel() {
    }

    public SongModel(String tittle, String artist, String duration) {
        this.tittle = tittle;
        this.artist = artist;
        this.duration = duration;
    }

    public String getTittle() {
        return tittle;
    }

    public void setTittle(String tittle) {
        this.tittle = tittle;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "SongModel{" +
                "tittle='" + tittle + '\'' +
                ", artist='" + artist + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
