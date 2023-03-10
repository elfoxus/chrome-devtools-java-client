package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * A unique identifier for the type of issue. Each type may use one of the optional fields in
 * InspectorIssueDetails to convey more specific information about the kind of issue.
 */
public enum InspectorIssueCode {
  @JsonProperty("CookieIssue")
  COOKIE_ISSUE,
  @JsonProperty("MixedContentIssue")
  MIXED_CONTENT_ISSUE,
  @JsonProperty("BlockedByResponseIssue")
  BLOCKED_BY_RESPONSE_ISSUE,
  @JsonProperty("HeavyAdIssue")
  HEAVY_AD_ISSUE,
  @JsonProperty("ContentSecurityPolicyIssue")
  CONTENT_SECURITY_POLICY_ISSUE,
  @JsonProperty("SharedArrayBufferIssue")
  SHARED_ARRAY_BUFFER_ISSUE,
  @JsonProperty("TrustedWebActivityIssue")
  TRUSTED_WEB_ACTIVITY_ISSUE,
  @JsonProperty("LowTextContrastIssue")
  LOW_TEXT_CONTRAST_ISSUE,
  @JsonProperty("CorsIssue")
  CORS_ISSUE,
  @JsonProperty("AttributionReportingIssue")
  ATTRIBUTION_REPORTING_ISSUE,
  @JsonProperty("QuirksModeIssue")
  QUIRKS_MODE_ISSUE,
  @JsonProperty("NavigatorUserAgentIssue")
  NAVIGATOR_USER_AGENT_ISSUE,
  @JsonProperty("GenericIssue")
  GENERIC_ISSUE,
  @JsonProperty("DeprecationIssue")
  DEPRECATION_ISSUE,
  @JsonProperty("ClientHintIssue")
  CLIENT_HINT_ISSUE,
  @JsonProperty("FederatedAuthRequestIssue")
  FEDERATED_AUTH_REQUEST_ISSUE
}
