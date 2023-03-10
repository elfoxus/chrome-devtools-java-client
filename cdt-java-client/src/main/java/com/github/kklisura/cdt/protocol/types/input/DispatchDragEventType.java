package com.github.kklisura.cdt.protocol.types.input;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Type of the drag event. */
public enum DispatchDragEventType {
  @JsonProperty("dragEnter")
  DRAG_ENTER,
  @JsonProperty("dragOver")
  DRAG_OVER,
  @JsonProperty("drop")
  DROP,
  @JsonProperty("dragCancel")
  DRAG_CANCEL
}
