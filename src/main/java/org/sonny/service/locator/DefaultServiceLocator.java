package org.sonny.service.locator;

import org.sonny.service.AccountService;
import org.sonny.service.ClientService;
import org.sonny.service.impl.AccountServiceImpl;
import org.sonny.service.impl.ClientServiceImpl;

public class DefaultServiceLocator {
  private static ClientService clientService = new ClientServiceImpl();

  private static AccountService accountService = new AccountServiceImpl();

  public ClientService createClientServiceInstance() {
    return clientService;
  }

  public AccountService createAccountServiceInstance() {
    return accountService;
  }
}
