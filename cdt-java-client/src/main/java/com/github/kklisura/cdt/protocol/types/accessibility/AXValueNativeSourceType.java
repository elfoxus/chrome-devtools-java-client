package com.github.kklisura.cdt.protocol.types.accessibility;

import com.fasterxml.jackson.annotation.JsonProperty;

/** Enum of possible native property sources (as a subtype of a particular AXValueSourceType). */
public enum AXValueNativeSourceType {
  @JsonProperty("description")
  DESCRIPTION,
  @JsonProperty("figcaption")
  FIGCAPTION,
  @JsonProperty("label")
  LABEL,
  @JsonProperty("labelfor")
  LABELFOR,
  @JsonProperty("labelwrapped")
  LABELWRAPPED,
  @JsonProperty("legend")
  LEGEND,
  @JsonProperty("rubyannotation")
  RUBYANNOTATION,
  @JsonProperty("tablecaption")
  TABLECAPTION,
  @JsonProperty("title")
  TITLE,
  @JsonProperty("other")
  OTHER
}
