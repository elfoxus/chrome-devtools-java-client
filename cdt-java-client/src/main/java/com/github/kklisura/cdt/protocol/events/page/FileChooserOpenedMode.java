package com.github.kklisura.cdt.protocol.events.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Input mode. */
public enum FileChooserOpenedMode {
  @JsonProperty("selectSingle")
  SELECT_SINGLE,
  @JsonProperty("selectMultiple")
  SELECT_MULTIPLE
}
