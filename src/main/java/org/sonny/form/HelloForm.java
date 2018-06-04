package org.sonny.form;

import com.alibaba.fastjson.JSON;

public class HelloForm {
  private String message;
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }
  @Override
  public String toString() {
    return JSON.toJSONString(this, true);
  }
}
