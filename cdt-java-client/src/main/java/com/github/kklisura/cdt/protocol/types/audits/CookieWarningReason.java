package com.github.kklisura.cdt.protocol.types.audits;

import com.fasterxml.jackson.annotation.JsonProperty;

public enum CookieWarningReason {
  @JsonProperty("WarnSameSiteUnspecifiedCrossSiteContext")
  WARN_SAME_SITE_UNSPECIFIED_CROSS_SITE_CONTEXT,
  @JsonProperty("WarnSameSiteNoneInsecure")
  WARN_SAME_SITE_NONE_INSECURE,
  @JsonProperty("WarnSameSiteUnspecifiedLaxAllowUnsafe")
  WARN_SAME_SITE_UNSPECIFIED_LAX_ALLOW_UNSAFE,
  @JsonProperty("WarnSameSiteStrictLaxDowngradeStrict")
  WARN_SAME_SITE_STRICT_LAX_DOWNGRADE_STRICT,
  @JsonProperty("WarnSameSiteStrictCrossDowngradeStrict")
  WARN_SAME_SITE_STRICT_CROSS_DOWNGRADE_STRICT,
  @JsonProperty("WarnSameSiteStrictCrossDowngradeLax")
  WARN_SAME_SITE_STRICT_CROSS_DOWNGRADE_LAX,
  @JsonProperty("WarnSameSiteLaxCrossDowngradeStrict")
  WARN_SAME_SITE_LAX_CROSS_DOWNGRADE_STRICT,
  @JsonProperty("WarnSameSiteLaxCrossDowngradeLax")
  WARN_SAME_SITE_LAX_CROSS_DOWNGRADE_LAX,
  @JsonProperty("WarnAttributeValueExceedsMaxSize")
  WARN_ATTRIBUTE_VALUE_EXCEEDS_MAX_SIZE,
  @JsonProperty("WarnDomainNonASCII")
  WARN_DOMAIN_NON_ASCII
}
