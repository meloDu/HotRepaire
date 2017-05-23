package com.smart.melo.hotrepaire;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by duyanfeng on 2017/5/23.
 */
public class SampleApplication extends TinkerApplication {
    public SampleApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, "com.smart.melo.hotrepaire.SampleApplicationLike",
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
