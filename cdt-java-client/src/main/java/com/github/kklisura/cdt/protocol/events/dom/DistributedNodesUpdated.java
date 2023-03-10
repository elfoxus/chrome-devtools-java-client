package com.github.kklisura.cdt.protocol.events.dom;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.dom.BackendNode;
import java.util.List;

/** Called when distribution is changed. */
@Experimental
public class DistributedNodesUpdated {

  private Integer insertionPointId;

  private List<BackendNode> distributedNodes;

  /** Insertion point where distributed nodes were updated. */
  public Integer getInsertionPointId() {
    return insertionPointId;
  }

  /** Insertion point where distributed nodes were updated. */
  public void setInsertionPointId(Integer insertionPointId) {
    this.insertionPointId = insertionPointId;
  }

  /** Distributed nodes for given insertion point. */
  public List<BackendNode> getDistributedNodes() {
    return distributedNodes;
  }

  /** Distributed nodes for given insertion point. */
  public void setDistributedNodes(List<BackendNode> distributedNodes) {
    this.distributedNodes = distributedNodes;
  }
}
