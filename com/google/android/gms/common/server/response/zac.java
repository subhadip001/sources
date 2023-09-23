package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zac implements zai<Float> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Float zaa(FastParser fastParser, BufferedReader bufferedReader) {
        float zak;
        zak = fastParser.zak(bufferedReader);
        return Float.valueOf(zak);
    }
}
