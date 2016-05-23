package com.greencoder.daggerdiptest.dao;

import com.greencoder.daggerdiptest.model.Music;

/**
 * @author aahmed on 5/23/16.
 */
public interface IMusicDao {

    public Music loadMusic(long id);

    public void saveMusic(Music song);
}
