package com.waveplay.music.player;
import android.app.Service; import android.content.Intent; import android.os.IBinder;
public class MusicService extends Service { public IBinder onBind(Intent i){ return null; } }