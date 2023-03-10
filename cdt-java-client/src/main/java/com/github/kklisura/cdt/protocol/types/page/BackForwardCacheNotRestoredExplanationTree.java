package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import java.util.List;

@Experimental
public class BackForwardCacheNotRestoredExplanationTree {

  private String url;

  private List<BackForwardCacheNotRestoredExplanation> explanations;

  private List<BackForwardCacheNotRestoredExplanationTree> children;

  /** URL of each frame */
  public String getUrl() {
    return url;
  }

  /** URL of each frame */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Not restored reasons of each frame */
  public List<BackForwardCacheNotRestoredExplanation> getExplanations() {
    return explanations;
  }

  /** Not restored reasons of each frame */
  public void setExplanations(List<BackForwardCacheNotRestoredExplanation> explanations) {
    this.explanations = explanations;
  }

  /** Array of children frame */
  public List<BackForwardCacheNotRestoredExplanationTree> getChildren() {
    return children;
  }

  /** Array of children frame */
  public void setChildren(List<BackForwardCacheNotRestoredExplanationTree> children) {
    this.children = children;
  }
}
