/*
 * Copyright 2018 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package expedia.refresh;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author Peter Varsanyi (pevarsanyi@expedia.com)
 */
@Component
@ConfigurationProperties("refresh")
@PropertySource("classpath:/application.properties")
@RefreshScope
public class RefreshableData {

  @PostConstruct
  void start() {
    System.out.println("hi" + data);
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  private String data;
}
