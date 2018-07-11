package edu.cnm.deepdive.njb.audioexample;

import android.app.Application;
import com.facebook.stetho.Stetho;

public class AudioApplication extends Application {

  @Override
  public void onCreate() {
    super.onCreate();
    Stetho.initializeWithDefaults(this);
  }

}
