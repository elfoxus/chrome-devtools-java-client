package com.github.kklisura.cdt.protocol.types.input;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

@Experimental
public class DragData {

  private List<DragDataItem> items;

  @Optional private List<String> files;

  private Integer dragOperationsMask;

  public List<DragDataItem> getItems() {
    return items;
  }

  public void setItems(List<DragDataItem> items) {
    this.items = items;
  }

  /** List of filenames that should be included when dropping */
  public List<String> getFiles() {
    return files;
  }

  /** List of filenames that should be included when dropping */
  public void setFiles(List<String> files) {
    this.files = files;
  }

  /** Bit field representing allowed drag operations. Copy = 1, Link = 2, Move = 16 */
  public Integer getDragOperationsMask() {
    return dragOperationsMask;
  }

  /** Bit field representing allowed drag operations. Copy = 1, Link = 2, Move = 16 */
  public void setDragOperationsMask(Integer dragOperationsMask) {
    this.dragOperationsMask = dragOperationsMask;
  }
}
