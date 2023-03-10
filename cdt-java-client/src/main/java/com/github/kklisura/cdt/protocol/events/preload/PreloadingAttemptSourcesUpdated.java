package com.github.kklisura.cdt.protocol.events.preload;

import com.github.kklisura.cdt.protocol.types.preload.PreloadingAttemptSource;
import java.util.List;

/** Send a list of sources for all preloading attempts. */
public class PreloadingAttemptSourcesUpdated {

  private List<PreloadingAttemptSource> preloadingAttemptSources;

  public List<PreloadingAttemptSource> getPreloadingAttemptSources() {
    return preloadingAttemptSources;
  }

  public void setPreloadingAttemptSources(List<PreloadingAttemptSource> preloadingAttemptSources) {
    this.preloadingAttemptSources = preloadingAttemptSources;
  }
}
