package com.github.kklisura.cdt.protocol.types.emulation;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

/**
 * Used to specify User Agent Cient Hints to emulate. See https://wicg.github.io/ua-client-hints
 * Missing optional values will be filled in by the target with what it would normally use.
 */
@Experimental
public class UserAgentMetadata {

  @Optional private List<UserAgentBrandVersion> brands;

  @Optional private List<UserAgentBrandVersion> fullVersionList;

  @Deprecated @Optional private String fullVersion;

  private String platform;

  private String platformVersion;

  private String architecture;

  private String model;

  private Boolean mobile;

  @Optional private String bitness;

  @Optional private Boolean wow64;

  /** Brands appearing in Sec-CH-UA. */
  public List<UserAgentBrandVersion> getBrands() {
    return brands;
  }

  /** Brands appearing in Sec-CH-UA. */
  public void setBrands(List<UserAgentBrandVersion> brands) {
    this.brands = brands;
  }

  /** Brands appearing in Sec-CH-UA-Full-Version-List. */
  public List<UserAgentBrandVersion> getFullVersionList() {
    return fullVersionList;
  }

  /** Brands appearing in Sec-CH-UA-Full-Version-List. */
  public void setFullVersionList(List<UserAgentBrandVersion> fullVersionList) {
    this.fullVersionList = fullVersionList;
  }

  public String getFullVersion() {
    return fullVersion;
  }

  public void setFullVersion(String fullVersion) {
    this.fullVersion = fullVersion;
  }

  public String getPlatform() {
    return platform;
  }

  public void setPlatform(String platform) {
    this.platform = platform;
  }

  public String getPlatformVersion() {
    return platformVersion;
  }

  public void setPlatformVersion(String platformVersion) {
    this.platformVersion = platformVersion;
  }

  public String getArchitecture() {
    return architecture;
  }

  public void setArchitecture(String architecture) {
    this.architecture = architecture;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public Boolean getMobile() {
    return mobile;
  }

  public void setMobile(Boolean mobile) {
    this.mobile = mobile;
  }

  public String getBitness() {
    return bitness;
  }

  public void setBitness(String bitness) {
    this.bitness = bitness;
  }

  public Boolean getWow64() {
    return wow64;
  }

  public void setWow64(Boolean wow64) {
    this.wow64 = wow64;
  }
}
