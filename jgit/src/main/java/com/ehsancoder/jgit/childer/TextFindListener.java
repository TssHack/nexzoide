package com.ehsancoder.jgit.childer;

public interface TextFindListener {
  void onComplete();

  void onError(String errorMessage);
}
