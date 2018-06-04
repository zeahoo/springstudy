package org.sonny.form;

import com.alibaba.fastjson.JSON;

public class OutBean {
  private PersonForm target;

  public PersonForm getTarget() {
    return target;
  }

  public void setTarget(PersonForm target) {
    this.target = target;
  }
  @Override
  public String toString() {
    return JSON.toJSONString(this, true);
  }
}
