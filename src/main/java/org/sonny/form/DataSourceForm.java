package org.sonny.form;

import com.alibaba.fastjson.JSON;

public class DataSourceForm {
  private String source;

  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }
  @Override
  public String toString() {
    return JSON.toJSONString(this, true);
  }

}
