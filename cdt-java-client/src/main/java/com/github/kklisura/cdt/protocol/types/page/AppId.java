package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class AppId {

  @Optional private String appId;

  @Optional private String recommendedId;

  /** App id, either from manifest's id attribute or computed from start_url */
  public String getAppId() {
    return appId;
  }

  /** App id, either from manifest's id attribute or computed from start_url */
  public void setAppId(String appId) {
    this.appId = appId;
  }

  /** Recommendation for manifest's id attribute to match current id computed from start_url */
  public String getRecommendedId() {
    return recommendedId;
  }

  /** Recommendation for manifest's id attribute to match current id computed from start_url */
  public void setRecommendedId(String recommendedId) {
    this.recommendedId = recommendedId;
  }
}
