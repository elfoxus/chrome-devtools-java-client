package com.github.kklisura.cdt.protocol.types.webauthn;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

public class Credential {

  private String credentialId;

  private Boolean isResidentCredential;

  @Optional private String rpId;

  private String privateKey;

  @Optional private String userHandle;

  private Integer signCount;

  @Optional private String largeBlob;

  public String getCredentialId() {
    return credentialId;
  }

  public void setCredentialId(String credentialId) {
    this.credentialId = credentialId;
  }

  public Boolean getIsResidentCredential() {
    return isResidentCredential;
  }

  public void setIsResidentCredential(Boolean isResidentCredential) {
    this.isResidentCredential = isResidentCredential;
  }

  /** Relying Party ID the credential is scoped to. Must be set when adding a credential. */
  public String getRpId() {
    return rpId;
  }

  /** Relying Party ID the credential is scoped to. Must be set when adding a credential. */
  public void setRpId(String rpId) {
    this.rpId = rpId;
  }

  /**
   * The ECDSA P-256 private key in PKCS#8 format. (Encoded as a base64 string when passed over
   * JSON)
   */
  public String getPrivateKey() {
    return privateKey;
  }

  /**
   * The ECDSA P-256 private key in PKCS#8 format. (Encoded as a base64 string when passed over
   * JSON)
   */
  public void setPrivateKey(String privateKey) {
    this.privateKey = privateKey;
  }

  /**
   * An opaque byte sequence with a maximum size of 64 bytes mapping the credential to a specific
   * user. (Encoded as a base64 string when passed over JSON)
   */
  public String getUserHandle() {
    return userHandle;
  }

  /**
   * An opaque byte sequence with a maximum size of 64 bytes mapping the credential to a specific
   * user. (Encoded as a base64 string when passed over JSON)
   */
  public void setUserHandle(String userHandle) {
    this.userHandle = userHandle;
  }

  /**
   * Signature counter. This is incremented by one for each successful assertion. See
   * https://w3c.github.io/webauthn/#signature-counter
   */
  public Integer getSignCount() {
    return signCount;
  }

  /**
   * Signature counter. This is incremented by one for each successful assertion. See
   * https://w3c.github.io/webauthn/#signature-counter
   */
  public void setSignCount(Integer signCount) {
    this.signCount = signCount;
  }

  /**
   * The large blob associated with the credential. See
   * https://w3c.github.io/webauthn/#sctn-large-blob-extension (Encoded as a base64 string when
   * passed over JSON)
   */
  public String getLargeBlob() {
    return largeBlob;
  }

  /**
   * The large blob associated with the credential. See
   * https://w3c.github.io/webauthn/#sctn-large-blob-extension (Encoded as a base64 string when
   * passed over JSON)
   */
  public void setLargeBlob(String largeBlob) {
    this.largeBlob = largeBlob;
  }
}
