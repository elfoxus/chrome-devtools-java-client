package com.github.kklisura.cdt.protocol.events.webauthn;

import com.github.kklisura.cdt.protocol.types.webauthn.Credential;

/** Triggered when a credential is used in a webauthn assertion. */
public class CredentialAsserted {

  private String authenticatorId;

  private Credential credential;

  public String getAuthenticatorId() {
    return authenticatorId;
  }

  public void setAuthenticatorId(String authenticatorId) {
    this.authenticatorId = authenticatorId;
  }

  public Credential getCredential() {
    return credential;
  }

  public void setCredential(Credential credential) {
    this.credential = credential;
  }
}
