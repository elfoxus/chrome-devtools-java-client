package com.github.kklisura.cdt.protocol.events.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Emitted only when `page.interceptFileChooser` is enabled. */
public class FileChooserOpened {

  @Experimental private String frameId;

  private FileChooserOpenedMode mode;

  @Experimental @Optional private Integer backendNodeId;

  /** Id of the frame containing input node. */
  public String getFrameId() {
    return frameId;
  }

  /** Id of the frame containing input node. */
  public void setFrameId(String frameId) {
    this.frameId = frameId;
  }

  /** Input mode. */
  public FileChooserOpenedMode getMode() {
    return mode;
  }

  /** Input mode. */
  public void setMode(FileChooserOpenedMode mode) {
    this.mode = mode;
  }

  /** Input node id. Only present for file choosers opened via an <input type="file"> element. */
  public Integer getBackendNodeId() {
    return backendNodeId;
  }

  /** Input node id. Only present for file choosers opened via an <input type="file"> element. */
  public void setBackendNodeId(Integer backendNodeId) {
    this.backendNodeId = backendNodeId;
  }
}
