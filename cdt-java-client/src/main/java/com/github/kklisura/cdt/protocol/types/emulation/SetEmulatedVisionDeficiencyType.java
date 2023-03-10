package com.github.kklisura.cdt.protocol.types.emulation;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Vision deficiency to emulate. Order: best-effort emulations come first, followed by any
 * physiologically accurate emulations for medically recognized color vision deficiencies.
 */
public enum SetEmulatedVisionDeficiencyType {
  @JsonProperty("none")
  NONE,
  @JsonProperty("blurredVision")
  BLURRED_VISION,
  @JsonProperty("reducedContrast")
  REDUCED_CONTRAST,
  @JsonProperty("achromatopsia")
  ACHROMATOPSIA,
  @JsonProperty("deuteranopia")
  DEUTERANOPIA,
  @JsonProperty("protanopia")
  PROTANOPIA,
  @JsonProperty("tritanopia")
  TRITANOPIA
}
