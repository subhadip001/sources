package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zae implements zai<Boolean> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* bridge */ /* synthetic */ Boolean zaa(FastParser fastParser, BufferedReader bufferedReader) {
        boolean zay;
        zay = fastParser.zay(bufferedReader, false);
        return Boolean.valueOf(zay);
    }
}
