package com.github.kklisura.cdt.protocol.types.page;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import java.util.List;

public class AppManifest {

  private String url;

  private List<AppManifestError> errors;

  @Optional private String data;

  @Experimental @Optional private AppManifestParsedProperties parsed;

  /** Manifest location. */
  public String getUrl() {
    return url;
  }

  /** Manifest location. */
  public void setUrl(String url) {
    this.url = url;
  }

  public List<AppManifestError> getErrors() {
    return errors;
  }

  public void setErrors(List<AppManifestError> errors) {
    this.errors = errors;
  }

  /** Manifest content. */
  public String getData() {
    return data;
  }

  /** Manifest content. */
  public void setData(String data) {
    this.data = data;
  }

  /** Parsed manifest properties */
  public AppManifestParsedProperties getParsed() {
    return parsed;
  }

  /** Parsed manifest properties */
  public void setParsed(AppManifestParsedProperties parsed) {
    this.parsed = parsed;
  }
}
