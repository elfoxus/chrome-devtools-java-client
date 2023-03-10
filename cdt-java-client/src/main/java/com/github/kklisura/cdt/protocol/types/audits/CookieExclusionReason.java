package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CookieExclusionReason {
  @JsonProperty("ExcludeSameSiteUnspecifiedTreatedAsLax")
  EXCLUDE_SAME_SITE_UNSPECIFIED_TREATED_AS_LAX,
  @JsonProperty("ExcludeSameSiteNoneInsecure")
  EXCLUDE_SAME_SITE_NONE_INSECURE,
  @JsonProperty("ExcludeSameSiteLax")
  EXCLUDE_SAME_SITE_LAX,
  @JsonProperty("ExcludeSameSiteStrict")
  EXCLUDE_SAME_SITE_STRICT,
  @JsonProperty("ExcludeInvalidSameParty")
  EXCLUDE_INVALID_SAME_PARTY,
  @JsonProperty("ExcludeSamePartyCrossPartyContext")
  EXCLUDE_SAME_PARTY_CROSS_PARTY_CONTEXT,
  @JsonProperty("ExcludeDomainNonASCII")
  EXCLUDE_DOMAIN_NON_ASCII,
  @JsonProperty("ExcludeThirdPartyCookieBlockedInFirstPartySet")
  EXCLUDE_THIRD_PARTY_COOKIE_BLOCKED_IN_FIRST_PARTY_SET
}
