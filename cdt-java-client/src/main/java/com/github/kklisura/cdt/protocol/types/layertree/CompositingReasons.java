package com.github.kklisura.cdt.protocol.types.layertree;

import java.util.List;

public class CompositingReasons {

  @Deprecated private List<String> compositingReasons;

  private List<String> compositingReasonIds;

  /** A list of strings specifying reasons for the given layer to become composited. */
  public List<String> getCompositingReasons() {
    return compositingReasons;
  }

  /** A list of strings specifying reasons for the given layer to become composited. */
  public void setCompositingReasons(List<String> compositingReasons) {
    this.compositingReasons = compositingReasons;
  }

  /** A list of strings specifying reason IDs for the given layer to become composited. */
  public List<String> getCompositingReasonIds() {
    return compositingReasonIds;
  }

  /** A list of strings specifying reason IDs for the given layer to become composited. */
  public void setCompositingReasonIds(List<String> compositingReasonIds) {
    this.compositingReasonIds = compositingReasonIds;
  }
}
