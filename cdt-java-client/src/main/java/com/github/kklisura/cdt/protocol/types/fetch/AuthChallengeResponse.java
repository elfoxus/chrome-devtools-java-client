package com.github.kklisura.cdt.protocol.types.fetch;

import com.github.kklisura.cdt.protocol.support.annotations.Optional;

/** Response to an AuthChallenge. */
public class AuthChallengeResponse {

  private AuthChallengeResponseResponse response;

  @Optional private String username;

  @Optional private String password;

  /**
   * The decision on what to do in response to the authorization challenge. Default means deferring
   * to the default behavior of the net stack, which will likely either the Cancel authentication or
   * display a popup dialog box.
   */
  public AuthChallengeResponseResponse getResponse() {
    return response;
  }

  /**
   * The decision on what to do in response to the authorization challenge. Default means deferring
   * to the default behavior of the net stack, which will likely either the Cancel authentication or
   * display a popup dialog box.
   */
  public void setResponse(AuthChallengeResponseResponse response) {
    this.response = response;
  }

  /**
   * The username to provide, possibly empty. Should only be set if response is ProvideCredentials.
   */
  public String getUsername() {
    return username;
  }

  /**
   * The username to provide, possibly empty. Should only be set if response is ProvideCredentials.
   */
  public void setUsername(String username) {
    this.username = username;
  }

  /**
   * The password to provide, possibly empty. Should only be set if response is ProvideCredentials.
   */
  public String getPassword() {
    return password;
  }

  /**
   * The password to provide, possibly empty. Should only be set if response is ProvideCredentials.
   */
  public void setPassword(String password) {
    this.password = password;
  }
}
