package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

@Experimental
public class BackForwardCacheNotRestoredExplanation {

  private BackForwardCacheNotRestoredReasonType type;

  private BackForwardCacheNotRestoredReason reason;

  @Optional private String context;

  /** Type of the reason */
  public BackForwardCacheNotRestoredReasonType getType() {
    return type;
  }

  /** Type of the reason */
  public void setType(BackForwardCacheNotRestoredReasonType type) {
    this.type = type;
  }

  /** Not restored reason */
  public BackForwardCacheNotRestoredReason getReason() {
    return reason;
  }

  /** Not restored reason */
  public void setReason(BackForwardCacheNotRestoredReason reason) {
    this.reason = reason;
  }

  /**
   * Context associated with the reason. The meaning of this context is dependent on the reason: -
   * EmbedderExtensionSentMessageToCachedFrame: the extension ID.
   */
  public String getContext() {
    return context;
  }

  /**
   * Context associated with the reason. The meaning of this context is dependent on the reason: -
   * EmbedderExtensionSentMessageToCachedFrame: the extension ID.
   */
  public void setContext(String context) {
    this.context = context;
  }
}
