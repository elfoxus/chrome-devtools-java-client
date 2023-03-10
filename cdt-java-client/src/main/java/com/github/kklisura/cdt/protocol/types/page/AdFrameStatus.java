package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** Indicates whether a frame has been identified as an ad and why. */
@Experimental
public class AdFrameStatus {

  private AdFrameType adFrameType;

  @Optional private List<AdFrameExplanation> explanations;

  public AdFrameType getAdFrameType() {
    return adFrameType;
  }

  public void setAdFrameType(AdFrameType adFrameType) {
    this.adFrameType = adFrameType;
  }

  public List<AdFrameExplanation> getExplanations() {
    return explanations;
  }

  public void setExplanations(List<AdFrameExplanation> explanations) {
    this.explanations = explanations;
  }
}
