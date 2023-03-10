package com.github.kklisura.cdt.protocol.events.accessibility;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.accessibility.AXNode;
import java.util.List;

/**
 * The nodesUpdated event is sent every time a previously requested node has changed the in tree.
 */
@Experimental
public class NodesUpdated {

  private List<AXNode> nodes;

  /** Updated node data. */
  public List<AXNode> getNodes() {
    return nodes;
  }

  /** Updated node data. */
  public void setNodes(List<AXNode> nodes) {
    this.nodes = nodes;
  }
}
