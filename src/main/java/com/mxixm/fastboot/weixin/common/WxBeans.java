/*
 * Copyright 2012-2017 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.mxixm.fastboot.weixin.common;

import com.mxixm.fastboot.weixin.module.media.WxMediaManager;
import com.mxixm.fastboot.weixin.module.menu.WxMenuManager;
import com.mxixm.fastboot.weixin.support.WxAccessTokenManager;
import com.mxixm.fastboot.weixin.util.WxContextUtils;
import com.mxixm.fastboot.weixin.web.WxUserManager;

public class WxBeans {

    public static final String WX_API_INVOKER_NAME = "WxApiInvoker";

    public static WxUserManager wxUserManager() {
        return WxContextUtils.getBean(WxUserManager.class);
    }

    public static WxAccessTokenManager wxAccessTokenManager() {
        return WxContextUtils.getBean(WxAccessTokenManager.class);
    }

    public static WxMenuManager wxMenuManager() {
        return WxContextUtils.getBean(WxMenuManager.class);
    }

    public static WxMediaManager wxMediaManager() {
        return WxContextUtils.getBean(WxMediaManager.class);
    }

}
