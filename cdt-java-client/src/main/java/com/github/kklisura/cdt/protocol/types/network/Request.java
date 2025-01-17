package com.github.kklisura.cdt.protocol.types.network;

import com.github.kklisura.cdt.protocol.support.annotations.Experimental;
import com.github.kklisura.cdt.protocol.support.annotations.Optional;
import com.github.kklisura.cdt.protocol.types.security.MixedContentType;
import java.util.List;
import java.util.Map;

/** HTTP request data. */
public class Request {

  private String url;

  @Optional private String urlFragment;

  private String method;

  private Map<String, Object> headers;

  @Optional private String postData;

  @Optional private Boolean hasPostData;

  @Experimental @Optional private List<PostDataEntry> postDataEntries;

  @Optional private MixedContentType mixedContentType;

  private ResourcePriority initialPriority;

  private RequestReferrerPolicy referrerPolicy;

  @Optional private Boolean isLinkPreload;

  @Experimental @Optional private TrustTokenParams trustTokenParams;

  @Experimental @Optional private Boolean isSameSite;

  /** Request URL (without fragment). */
  public String getUrl() {
    return url;
  }

  /** Request URL (without fragment). */
  public void setUrl(String url) {
    this.url = url;
  }

  /** Fragment of the requested URL starting with hash, if present. */
  public String getUrlFragment() {
    return urlFragment;
  }

  /** Fragment of the requested URL starting with hash, if present. */
  public void setUrlFragment(String urlFragment) {
    this.urlFragment = urlFragment;
  }

  /** HTTP request method. */
  public String getMethod() {
    return method;
  }

  /** HTTP request method. */
  public void setMethod(String method) {
    this.method = method;
  }

  /** HTTP request headers. */
  public Map<String, Object> getHeaders() {
    return headers;
  }

  /** HTTP request headers. */
  public void setHeaders(Map<String, Object> headers) {
    this.headers = headers;
  }

  /** HTTP POST request data. */
  public String getPostData() {
    return postData;
  }

  /** HTTP POST request data. */
  public void setPostData(String postData) {
    this.postData = postData;
  }

  /**
   * True when the request has POST data. Note that postData might still be omitted when this flag
   * is true when the data is too long.
   */
  public Boolean getHasPostData() {
    return hasPostData;
  }

  /**
   * True when the request has POST data. Note that postData might still be omitted when this flag
   * is true when the data is too long.
   */
  public void setHasPostData(Boolean hasPostData) {
    this.hasPostData = hasPostData;
  }

  /** Request body elements. This will be converted from base64 to binary */
  public List<PostDataEntry> getPostDataEntries() {
    return postDataEntries;
  }

  /** Request body elements. This will be converted from base64 to binary */
  public void setPostDataEntries(List<PostDataEntry> postDataEntries) {
    this.postDataEntries = postDataEntries;
  }

  /** The mixed content type of the request. */
  public MixedContentType getMixedContentType() {
    return mixedContentType;
  }

  /** The mixed content type of the request. */
  public void setMixedContentType(MixedContentType mixedContentType) {
    this.mixedContentType = mixedContentType;
  }

  /** Priority of the resource request at the time request is sent. */
  public ResourcePriority getInitialPriority() {
    return initialPriority;
  }

  /** Priority of the resource request at the time request is sent. */
  public void setInitialPriority(ResourcePriority initialPriority) {
    this.initialPriority = initialPriority;
  }

  /** The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/ */
  public RequestReferrerPolicy getReferrerPolicy() {
    return referrerPolicy;
  }

  /** The referrer policy of the request, as defined in https://www.w3.org/TR/referrer-policy/ */
  public void setReferrerPolicy(RequestReferrerPolicy referrerPolicy) {
    this.referrerPolicy = referrerPolicy;
  }

  /** Whether is loaded via link preload. */
  public Boolean getIsLinkPreload() {
    return isLinkPreload;
  }

  /** Whether is loaded via link preload. */
  public void setIsLinkPreload(Boolean isLinkPreload) {
    this.isLinkPreload = isLinkPreload;
  }

  /**
   * Set for requests when the TrustToken API is used. Contains the parameters passed by the
   * developer (e.g. via "fetch") as understood by the backend.
   */
  public TrustTokenParams getTrustTokenParams() {
    return trustTokenParams;
  }

  /**
   * Set for requests when the TrustToken API is used. Contains the parameters passed by the
   * developer (e.g. via "fetch") as understood by the backend.
   */
  public void setTrustTokenParams(TrustTokenParams trustTokenParams) {
    this.trustTokenParams = trustTokenParams;
  }

  /**
   * True if this resource request is considered to be the 'same site' as the request correspondinfg
   * to the main frame.
   */
  public Boolean getIsSameSite() {
    return isSameSite;
  }

  /**
   * True if this resource request is considered to be the 'same site' as the request correspondinfg
   * to the main frame.
   */
  public void setIsSameSite(Boolean isSameSite) {
    this.isSameSite = isSameSite;
  }
}
