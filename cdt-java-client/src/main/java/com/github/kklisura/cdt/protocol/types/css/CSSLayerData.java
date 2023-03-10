package com.github.kklisura.cdt.protocol.types.css;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/** CSS Layer data. */
@Experimental
public class CSSLayerData {

  private String name;

  @Optional private List<CSSLayerData> subLayers;

  private Double order;

  /** Layer name. */
  public String getName() {
    return name;
  }

  /** Layer name. */
  public void setName(String name) {
    this.name = name;
  }

  /** Direct sub-layers */
  public List<CSSLayerData> getSubLayers() {
    return subLayers;
  }

  /** Direct sub-layers */
  public void setSubLayers(List<CSSLayerData> subLayers) {
    this.subLayers = subLayers;
  }

  /**
   * Layer order. The order determines the order of the layer in the cascade order. A higher number
   * has higher priority in the cascade order.
   */
  public Double getOrder() {
    return order;
  }

  /**
   * Layer order. The order determines the order of the layer in the cascade order. A higher number
   * has higher priority in the cascade order.
   */
  public void setOrder(Double order) {
    this.order = order;
  }
}
