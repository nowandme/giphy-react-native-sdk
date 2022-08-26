package com.giphyreactnativesdk

object SharedVideoPlayer {
  private fun runInPlayerApplicationLooper(runnable: Runnable) {}

  fun mute() {}

  fun mute() {
    if (gphPlayerDelegate.isInitialized() && gphPlayer.playerView != null) {
      runInPlayerApplicationLooper {
        gphPlayer.setVolume(0f)
      }
    }
  }

  fun pause() {
    if (gphPlayerDelegate.isInitialized() && gphPlayer.playerView != null) {
      runInPlayerApplicationLooper {
        gphPlayer.onPause()
      }
    }
  }
}
