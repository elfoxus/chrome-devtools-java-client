package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.page.BackForwardCacheNotRestoredExplanation;
import com.github.kklisura.cdt.protocol.types.page.BackForwardCacheNotRestoredExplanationTree;
import java.util.List;

/**
 * Fired for failed bfcache history navigations if BackForwardCache feature is enabled. Do not
 * assume any ordering with the Page.frameNavigated event. This event is fired only for main-frame
 * history navigation where the document changes (non-same-document navigations), when bfcache
 * navigation fails.
 */
@Experimental
public class BackForwardCacheNotUsed {

  private String loaderId;

  private String frameId;

  private List<BackForwardCacheNotRestoredExplanation> notRestoredExplanations;

  @Optional private BackForwardCacheNotRestoredExplanationTree notRestoredExplanationsTree;

  /** The loader id for the associated navgation. */
  public String getLoaderId() {
    return loaderId;
  }

  /** The loader id for the associated navgation. */
  public void setLoaderId(String loaderId) {
    this.loaderId = loaderId;
  }

  /** The frame id of the associated frame. */
  public String getFrameId() {
    return frameId;
  }

  /** The frame id of the associated frame. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** Array of reasons why the page could not be cached. This must not be empty. */
  public List<BackForwardCacheNotRestoredExplanation> getNotRestoredExplanations() {
    return notRestoredExplanations;
  }

  /** Array of reasons why the page could not be cached. This must not be empty. */
  public void setNotRestoredExplanations(
      List<BackForwardCacheNotRestoredExplanation> notRestoredExplanations) {
    this.notRestoredExplanations = notRestoredExplanations;
  }

  /** Tree structure of reasons why the page could not be cached for each frame. */
  public BackForwardCacheNotRestoredExplanationTree getNotRestoredExplanationsTree() {
    return notRestoredExplanationsTree;
  }

  /** Tree structure of reasons why the page could not be cached for each frame. */
  public void setNotRestoredExplanationsTree(
      BackForwardCacheNotRestoredExplanationTree notRestoredExplanationsTree) {
    this.notRestoredExplanationsTree = notRestoredExplanationsTree;
  }
}
