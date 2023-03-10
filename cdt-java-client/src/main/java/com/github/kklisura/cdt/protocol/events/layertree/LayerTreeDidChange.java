package com.github.kklisura.cdt.protocol.events.layertree;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.layertree.Layer;
import java.util.List;

public class LayerTreeDidChange {

  @Optional private List<Layer> layers;

  /** Layer tree, absent if not in the comspositing mode. */
  public List<Layer> getLayers() {
    return layers;
  }

  /** Layer tree, absent if not in the comspositing mode. */
  public void setLayers(List<Layer> layers) {
    this.layers = layers;
  }
}
