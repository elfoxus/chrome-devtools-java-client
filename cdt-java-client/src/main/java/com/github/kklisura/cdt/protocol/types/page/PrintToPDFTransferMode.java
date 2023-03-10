package com.github.kklisura.cdt.protocol.types.page;

import com.fasterxml.jackson.annotation.JsonProperty;

/** return as stream */
public enum PrintToPDFTransferMode {
  @JsonProperty("ReturnAsBase64")
  RETURN_AS_BASE_64,
  @JsonProperty("ReturnAsStream")
  RETURN_AS_STREAM
}
