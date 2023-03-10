package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum ContentSecurityPolicyViolationType {
  @JsonProperty("kInlineViolation")
  K_INLINE_VIOLATION,
  @JsonProperty("kEvalViolation")
  K_EVAL_VIOLATION,
  @JsonProperty("kURLViolation")
  K_URL_VIOLATION,
  @JsonProperty("kTrustedTypesSinkViolation")
  K_TRUSTED_TYPES_SINK_VIOLATION,
  @JsonProperty("kTrustedTypesPolicyViolation")
  K_TRUSTED_TYPES_POLICY_VIOLATION,
  @JsonProperty("kWasmEvalViolation")
  K_WASM_EVAL_VIOLATION
}
