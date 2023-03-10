package com.github.kklisura.cdt.protocol.types.debugger;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The `mode` parameter must be present and set to 'StepInto', otherwise `restartFrame` will error
 * out.
 */
public enum RestartFrameMode {
  @JsonProperty("StepInto")
  STEP_INTO
}
