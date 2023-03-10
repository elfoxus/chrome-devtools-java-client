package com.github.kklisura.cdt.protocol.types.audits;

/** Information about a cookie that is affected by an inspector issue. */
public class AffectedCookie {

  private String name;

  private String path;

  private String domain;

  /** The following three properties uniquely identify a cookie */
  public String getName() {
    return name;
  }

  /** The following three properties uniquely identify a cookie */
  public void setName(String name) {
    this.name = name;
  }

  public String getPath() {
    return path;
  }

  public void setPath(String path) {
    this.path = path;
  }

  public String getDomain() {
    return domain;
  }

  public void setDomain(String domain) {
    this.domain = domain;
  }
}
