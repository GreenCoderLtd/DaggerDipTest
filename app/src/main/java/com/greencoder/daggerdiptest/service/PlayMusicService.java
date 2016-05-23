package com.greencoder.daggerdiptest.service;

import android.content.Context;
import android.util.Log;

import com.greencoder.daggerdiptest.MyApplication;
import com.greencoder.daggerdiptest.dao.IMusicDao;
import com.greencoder.daggerdiptest.model.Music;

import javax.inject.Inject;

/**
 * @author aahmed on 5/23/16.
 */
public class PlayMusicService implements IMusicService {

    private static final String TAG = PlayMusicService.class.getSimpleName();

    private Context mContext;

    @Inject
    IMusicDao mMusicDao;

    public PlayMusicService(Context mContext) {
        this.mContext = mContext;
        ((MyApplication) mContext.getApplicationContext()).getApplicationComponent().inject(this);
    }

    @Override
    public Music getMusic(long id) {
        return mMusicDao.loadMusic(id);
    }

    @Override
    public void storeMusic(Music song) {
        Log.d(TAG, "Store Music "+ song);
        mMusicDao.saveMusic(song);
    }
}
