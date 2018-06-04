package org.sonny.form;

import com.alibaba.fastjson.JSON;

public class ConstructForm {
  private int version;
  private String name;

  public ConstructForm() {}

  public ConstructForm(int version, String name) {
    this.version = version;
    this.name = name;
  }

  public int getVersion() {
    return version;
  }

  public void setVersion(int version) {
    this.version = version;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return JSON.toJSONString(this, true);
  }
}
