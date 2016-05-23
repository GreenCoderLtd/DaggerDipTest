package com.greencoder.daggerdiptest.service;

import com.greencoder.daggerdiptest.model.Music;

/**
 * @author aahmed on 5/23/16.
 */
public interface IMusicService {

    public Music getMusic(long id);

    public void storeMusic(Music song);

}
