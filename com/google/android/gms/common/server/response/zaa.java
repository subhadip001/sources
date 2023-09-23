package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zaa implements zai<Integer> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Integer zaa(FastParser fastParser, BufferedReader bufferedReader) {
        int zal;
        zal = fastParser.zal(bufferedReader);
        return Integer.valueOf(zal);
    }
}
