package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zab implements zai<Long> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Long zaa(FastParser fastParser, BufferedReader bufferedReader) {
        long zan;
        zan = fastParser.zan(bufferedReader);
        return Long.valueOf(zan);
    }
}
