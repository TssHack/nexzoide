package com.ehsancoder.jgit.jsonmerger;

import androidx.annotation.NonNull;
import androidx.annotation.UiThread;

public interface MergeCallback {
  @UiThread
  void onSuccess(@NonNull String outputPath);

  @UiThread
  void onError(@NonNull String errorMessage);
}
