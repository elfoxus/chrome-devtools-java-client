package com.github.kklisura.cdt.protocol.types.browser;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Whether to allow all or deny all download requests, or use default Chrome behavior if available
 * (otherwise deny). |allowAndName| allows download and names files according to their dowmload
 * guids.
 */
public enum SetDownloadBehaviorBehavior {
  @JsonProperty("deny")
  DENY,
  @JsonProperty("allow")
  ALLOW,
  @JsonProperty("allowAndName")
  ALLOW_AND_NAME,
  @JsonProperty("default")
  DEFAULT
}
