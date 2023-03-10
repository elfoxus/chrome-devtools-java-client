package com.github.kklisura.cdt.protocol.types.storage;

import java.util.List;

/** Bundles a candidate URL with its reporting metadata. */
public class SharedStorageUrlWithMetadata {

  private String url;

  private List<SharedStorageReportingMetadata> reportingMetadata;

  /** Spec of candidate URL. */
  public String getUrl() {
    return url;
  }

  /** Spec of candidate URL. */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Any associated reporting metadata. */
  public List<SharedStorageReportingMetadata> getReportingMetadata() {
    return reportingMetadata;
  }

  /** Any associated reporting metadata. */
  public void setReportingMetadata(List<SharedStorageReportingMetadata> reportingMetadata) {
    this.reportingMetadata = reportingMetadata;
  }
}
