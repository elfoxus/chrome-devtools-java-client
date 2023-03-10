package com.github.kklisura.cdt.protocol.events.accessibility;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.accessibility.AXNode;

/**
 * The loadComplete event mirrors the load complete event sent by the browser to assistive
 * technology when the web page has finished loading.
 */
@Experimental
public class LoadComplete {

  private AXNode root;

  /** New document root node. */
  public AXNode getRoot() {
    return root;
  }

  /** New document root node. */
  public void setRoot(AXNode root) {
    this.root = root;
  }
}
