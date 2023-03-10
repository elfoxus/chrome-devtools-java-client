package com.github.kklisura.cdt.protocol.types.preload;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/**
 * A key that identifies a preloading attempt.
 *
 * <p>The url used is the url specified by the trigger (i.e. the initial URL), and not the final url
 * that is navigated to. For example, prerendering allows same-origin main frame navigations during
 * the attempt, but the attempt is still keyed with the initial URL.
 */
public class PreloadingAttemptKey {

  private String loaderId;

  private SpeculationAction action;

  private String url;

  @Optional private SpeculationTargetHint targetHint;

  public String getLoaderId() {
    return loaderId;
  }

  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  public SpeculationAction getAction() {
    return action;
  }

  public void setAction(SpeculationAction action) {
    this.action = action;
  }

  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SpeculationTargetHint getTargetHint() {
    return targetHint;
  }

  public void setTargetHint(SpeculationTargetHint targetHint) {
    this.targetHint = targetHint;
  }
}
