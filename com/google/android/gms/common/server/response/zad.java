package com.google.android.gms.common.server.response;

import java.io.BufferedReader;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class zad implements zai<Double> {
    @Override // com.google.android.gms.common.server.response.zai
    public final /* synthetic */ Double zaa(FastParser fastParser, BufferedReader bufferedReader) {
        double zaj;
        zaj = fastParser.zaj(bufferedReader);
        return Double.valueOf(zaj);
    }
}
