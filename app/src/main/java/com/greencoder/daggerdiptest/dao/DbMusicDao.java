package com.greencoder.daggerdiptest.dao;

import android.content.Context;
import android.util.Log;

import com.greencoder.daggerdiptest.model.Music;

/**
 * @author aahmed on 5/23/16.
 */
public class DbMusicDao implements IMusicDao {

    private static final String TAG = DbMusicDao.class.getSimpleName();

    private Context mContext;

    private Music mSong;

    public DbMusicDao(Context mContext) {
        this.mContext = mContext;
    }

    @Override
    public Music loadMusic(long id) {
        return mSong;
    }

    @Override
    public void saveMusic(Music song) {
        Log.d(TAG, "Save Music " + song);
        mSong = song;
    }
}
