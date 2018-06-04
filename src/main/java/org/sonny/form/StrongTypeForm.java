package org.sonny.form;

import java.util.Map;
import com.alibaba.fastjson.JSON;

public class StrongTypeForm {
  private Map<String, Float> accounts;
  private String nullValue;
  private String emptyValue;

  public Map<String, Float> getAccounts() {
    return accounts;
  }

  public void setAccounts(Map<String, Float> accounts) {
    this.accounts = accounts;
  }

  public String getNullValue() {
    return nullValue;
  }


  public void setNullValue(String nullValue) {
    this.nullValue = nullValue;
  }

  public String getEmptyValue() {
    return emptyValue;
  }

  public void setEmptyValue(String emptyValue) {
    this.emptyValue = emptyValue;
  }

  @Override
  public String toString() {
    return JSON.toJSONString(this, true);
  }

}
