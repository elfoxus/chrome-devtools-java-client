package com.github.kklisura.cdt.protocol.events.dom;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import java.util.List;

/** Fired when `Element`'s inline style is modified via a CSS property modification. */
@Experimental
public class InlineStyleInvalidated {

  private List<Integer> nodeIds;

  /** Ids of the nodes for which the inline styles have been invalidated. */
  public List<Integer> getNodeIds() {
    return nodeIds;
  }

  /** Ids of the nodes for which the inline styles have been invalidated. */
  public void setNodeIds(List<Integer> nodeIds) {
    this.nodeIds = nodeIds;
  }
}
