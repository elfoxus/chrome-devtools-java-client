package com.github.kklisura.cdt.protocol.types.fedcm;

/** Corresponds to IdentityRequestAccount */
public class Account {

  private String accountId;

  private String email;

  private String name;

  private String givenName;

  private String pictureUrl;

  private String idpConfigUrl;

  public String getAccountId() {
    return accountId;
  }

  public void setAccountId(String accountId) {
    this.accountId = accountId;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getGivenName() {
    return givenName;
  }

  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }

  public String getPictureUrl() {
    return pictureUrl;
  }

  public void setPictureUrl(String pictureUrl) {
    this.pictureUrl = pictureUrl;
  }

  public String getIdpConfigUrl() {
    return idpConfigUrl;
  }

  public void setIdpConfigUrl(String idpConfigUrl) {
    this.idpConfigUrl = idpConfigUrl;
  }
}
