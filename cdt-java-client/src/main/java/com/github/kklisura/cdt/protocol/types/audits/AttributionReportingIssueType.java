package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum AttributionReportingIssueType {
  @JsonProperty("PermissionPolicyDisabled")
  PERMISSION_POLICY_DISABLED,
  @JsonProperty("UntrustworthyReportingOrigin")
  UNTRUSTWORTHY_REPORTING_ORIGIN,
  @JsonProperty("InsecureContext")
  INSECURE_CONTEXT,
  @JsonProperty("InvalidHeader")
  INVALID_HEADER,
  @JsonProperty("InvalidRegisterTriggerHeader")
  INVALID_REGISTER_TRIGGER_HEADER,
  @JsonProperty("InvalidEligibleHeader")
  INVALID_ELIGIBLE_HEADER,
  @JsonProperty("TooManyConcurrentRequests")
  TOO_MANY_CONCURRENT_REQUESTS,
  @JsonProperty("SourceAndTriggerHeaders")
  SOURCE_AND_TRIGGER_HEADERS,
  @JsonProperty("SourceIgnored")
  SOURCE_IGNORED,
  @JsonProperty("TriggerIgnored")
  TRIGGER_IGNORED
}
