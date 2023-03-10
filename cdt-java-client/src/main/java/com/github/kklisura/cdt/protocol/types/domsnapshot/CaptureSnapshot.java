package com.github.kklisura.cdt.protocol.types.domsnapshot;

import java.util.List;

public class CaptureSnapshot {

  private List<DocumentSnapshot> documents;

  private List<String> strings;

  /** The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document. */
  public List<DocumentSnapshot> getDocuments() {
    return documents;
  }

  /** The nodes in the DOM tree. The DOMNode at index 0 corresponds to the root document. */
  public void setDocuments(List<DocumentSnapshot> documents) {
    this.documents = documents;
  }

  /** Shared string table that all string properties refer to with indexes. */
  public List<String> getStrings() {
    return strings;
  }

  /** Shared string table that all string properties refer to with indexes. */
  public void setStrings(List<String> strings) {
    this.strings = strings;
  }
}
