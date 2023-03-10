package com.github.kklisura.cdt.protocol.events.fedcm;

import com.github.kklisura.cdt.protocol.types.fedcm.Account;
import java.util.List;

public class DialogShown {

  private List<Account> accounts;

  public List<Account> getAccounts() {
    return accounts;
  }

  public void setAccounts(List<Account> accounts) {
    this.accounts = accounts;
  }
}
