package com.github.kklisura.cdt.protocol.types.fetch;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Stages of the request to handle. Request will intercept before the request is sent. Response will
 * intercept after the response is received (but before response body is received).
 */
public enum RequestStage {
  @JsonProperty("Request")
  REQUEST,
  @JsonProperty("Response")
  RESPONSE
}
