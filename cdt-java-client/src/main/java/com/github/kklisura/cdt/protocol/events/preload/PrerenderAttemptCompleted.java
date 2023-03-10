package com.github.kklisura.cdt.protocol.events.preload;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.preload.PrerenderFinalStatus;

/** Fired when a prerender attempt is completed. */
public class PrerenderAttemptCompleted {

  private String initiatingFrameId;

  private String prerenderingUrl;

  private PrerenderFinalStatus finalStatus;

  @Optional private String disallowedApiMethod;

  /** The frame id of the frame initiating prerendering. */
  public String getInitiatingFrameId() {
    return initiatingFrameId;
  }

  /** The frame id of the frame initiating prerendering. */
  public void setInitiatingFrameId(String initiatingFrameId) {
    this.initiatingFrameId = initiatingFrameId;
  }

  public String getPrerenderingUrl() {
    return prerenderingUrl;
  }

  public void setPrerenderingUrl(String prerenderingUrl) {
    this.prerenderingUrl = prerenderingUrl;
  }

  public PrerenderFinalStatus getFinalStatus() {
    return finalStatus;
  }

  public void setFinalStatus(PrerenderFinalStatus finalStatus) {
    this.finalStatus = finalStatus;
  }

  /**
   * This is used to give users more information about the name of the API call that is incompatible
   * with prerender and has caused the cancellation of the attempt
   */
  public String getDisallowedApiMethod() {
    return disallowedApiMethod;
  }

  /**
   * This is used to give users more information about the name of the API call that is incompatible
   * with prerender and has caused the cancellation of the attempt
   */
  public void setDisallowedApiMethod(String disallowedApiMethod) {
    this.disallowedApiMethod = disallowedApiMethod;
  }
}
