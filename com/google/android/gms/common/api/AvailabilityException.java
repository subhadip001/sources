package com.google.android.gms.common.api;

import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.ApiKey;
import com.google.android.gms.common.internal.Preconditions;
import e.f.a;
import e.f.g;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public class AvailabilityException extends Exception {
    private final a<ApiKey<?>, ConnectionResult> zaa;

    public AvailabilityException(a<ApiKey<?>, ConnectionResult> aVar) {
        this.zaa = aVar;
    }

    public ConnectionResult getConnectionResult(GoogleApi<? extends Api.ApiOptions> googleApi) {
        ApiKey<? extends Api.ApiOptions> apiKey = googleApi.getApiKey();
        boolean z = this.zaa.get(apiKey) != null;
        String zab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 58);
        sb.append("The given API (");
        sb.append(zab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        ArrayList arrayList = new ArrayList();
        Iterator it = ((g.c) this.zaa.keySet()).iterator();
        boolean z = true;
        while (true) {
            g.a aVar = (g.a) it;
            if (!aVar.hasNext()) {
                break;
            }
            ApiKey apiKey = (ApiKey) aVar.next();
            ConnectionResult connectionResult = (ConnectionResult) Preconditions.checkNotNull(this.zaa.get(apiKey));
            z &= !connectionResult.isSuccess();
            String zab = apiKey.zab();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 2 + valueOf.length());
            sb.append(zab);
            sb.append(": ");
            sb.append(valueOf);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        if (z) {
            sb2.append("None of the queried APIs are available. ");
        } else {
            sb2.append("Some of the queried APIs are unavailable. ");
        }
        sb2.append(TextUtils.join("; ", arrayList));
        return sb2.toString();
    }

    public ConnectionResult getConnectionResult(HasApiKey<? extends Api.ApiOptions> hasApiKey) {
        ApiKey<? extends Api.ApiOptions> apiKey = hasApiKey.getApiKey();
        boolean z = this.zaa.get(apiKey) != null;
        String zab = apiKey.zab();
        StringBuilder sb = new StringBuilder(String.valueOf(zab).length() + 58);
        sb.append("The given API (");
        sb.append(zab);
        sb.append(") was not part of the availability request.");
        Preconditions.checkArgument(z, sb.toString());
        return (ConnectionResult) Preconditions.checkNotNull(this.zaa.getOrDefault(apiKey, null));
    }
}