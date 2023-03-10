package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents the failure reason when a federated authentication reason fails. Should be updated
 * alongside RequestIdTokenStatus in third_party/blink/public/mojom/devtools/inspector_issue.mojom
 * to include all cases except for success.
 */
public enum FederatedAuthRequestIssueReason {
  @JsonProperty("ShouldEmbargo")
  SHOULD_EMBARGO,
  @JsonProperty("TooManyRequests")
  TOO_MANY_REQUESTS,
  @JsonProperty("WellKnownHttpNotFound")
  WELL_KNOWN_HTTP_NOT_FOUND,
  @JsonProperty("WellKnownNoResponse")
  WELL_KNOWN_NO_RESPONSE,
  @JsonProperty("WellKnownInvalidResponse")
  WELL_KNOWN_INVALID_RESPONSE,
  @JsonProperty("WellKnownListEmpty")
  WELL_KNOWN_LIST_EMPTY,
  @JsonProperty("ConfigNotInWellKnown")
  CONFIG_NOT_IN_WELL_KNOWN,
  @JsonProperty("WellKnownTooBig")
  WELL_KNOWN_TOO_BIG,
  @JsonProperty("ConfigHttpNotFound")
  CONFIG_HTTP_NOT_FOUND,
  @JsonProperty("ConfigNoResponse")
  CONFIG_NO_RESPONSE,
  @JsonProperty("ConfigInvalidResponse")
  CONFIG_INVALID_RESPONSE,
  @JsonProperty("ClientMetadataHttpNotFound")
  CLIENT_METADATA_HTTP_NOT_FOUND,
  @JsonProperty("ClientMetadataNoResponse")
  CLIENT_METADATA_NO_RESPONSE,
  @JsonProperty("ClientMetadataInvalidResponse")
  CLIENT_METADATA_INVALID_RESPONSE,
  @JsonProperty("DisabledInSettings")
  DISABLED_IN_SETTINGS,
  @JsonProperty("ErrorFetchingSignin")
  ERROR_FETCHING_SIGNIN,
  @JsonProperty("InvalidSigninResponse")
  INVALID_SIGNIN_RESPONSE,
  @JsonProperty("AccountsHttpNotFound")
  ACCOUNTS_HTTP_NOT_FOUND,
  @JsonProperty("AccountsNoResponse")
  ACCOUNTS_NO_RESPONSE,
  @JsonProperty("AccountsInvalidResponse")
  ACCOUNTS_INVALID_RESPONSE,
  @JsonProperty("AccountsListEmpty")
  ACCOUNTS_LIST_EMPTY,
  @JsonProperty("IdTokenHttpNotFound")
  ID_TOKEN_HTTP_NOT_FOUND,
  @JsonProperty("IdTokenNoResponse")
  ID_TOKEN_NO_RESPONSE,
  @JsonProperty("IdTokenInvalidResponse")
  ID_TOKEN_INVALID_RESPONSE,
  @JsonProperty("IdTokenInvalidRequest")
  ID_TOKEN_INVALID_REQUEST,
  @JsonProperty("ErrorIdToken")
  ERROR_ID_TOKEN,
  @JsonProperty("Canceled")
  CANCELED,
  @JsonProperty("RpPageNotVisible")
  RP_PAGE_NOT_VISIBLE
}
