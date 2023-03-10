package com.github.kklisura.cdt.protocol.events.input;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.types.input.DragData;

/**
 * Emitted only when `Input.setInterceptDrags` is enabled. Use this data with
 * `Input.dispatchDragEvent` to restore normal drag and drop behavior.
 */
@Experimental
public class DragIntercepted {

  private DragData data;

  public DragData getData() {
    return data;
  }

  public void setData(DragData data) {
    this.data = data;
  }
}
