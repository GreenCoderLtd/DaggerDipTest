package com.greencoder.daggerdiptest.model;

/**
 * @author aahmed on 5/23/16.
 */
public class Music {

    private long mId;
    private String mTitle;
    private String mArtist;
    private String mAlbum;

    public Music(long id, String title, String artist, String album) {
        this.mId = id;
        this.mTitle = title;
        this.mArtist = artist;
        this.mAlbum = album;
    }

    public long getId() {
        return mId;
    }

    public void setId(long id) {
        this.mId = id;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public String getArtist() {
        return mArtist;
    }

    public void setArtist(String artist) {
        this.mArtist = artist;
    }

    public String getAlbum() {
        return mAlbum;
    }

    public void setAlbum(String album) {
        this.mAlbum = album;
    }

    @Override
    public String toString() {
        return "Music{" +
                "mId=" + mId +
                ", mTitle='" + mTitle + '\'' +
                ", mArtist='" + mArtist + '\'' +
                ", mAlbum='" + mAlbum + '\'' +
                '}';
    }
}
