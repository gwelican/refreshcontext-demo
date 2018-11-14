/*
 * Copyright 2018 Expedia, Inc. All rights reserved.
 * EXPEDIA PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

package expedia.refresh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Peter Varsanyi (pevarsanyi@expedia.com)
 */
@RestController
public class TestController {

  @Autowired
  private RefreshableData refreshableData;

  @RequestMapping("/message")
  public String get() {
    return refreshableData.getData();
  }
}
