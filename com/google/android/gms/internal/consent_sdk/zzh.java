package com.google.android.gms.internal.consent_sdk;

import android.text.TextUtils;
import android.util.Log;
import f.a.b.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.ump:user-messaging-platform@@2.0.0 */
/* loaded from: classes.dex */
public final class zzh {
    private final Executor zza;

    public zzh(Executor executor) {
        this.zza = executor;
    }

    public final Executor zza() {
        return this.zza;
    }

    public final void zzb(final String str, final String str2, final zzg... zzgVarArr) {
        this.zza.execute(new Runnable() { // from class: com.google.android.gms.internal.consent_sdk.zze
            @Override // java.lang.Runnable
            public final void run() {
                final JSONObject jSONObject;
                String str3 = str;
                String str4 = str2;
                zzg[] zzgVarArr2 = zzgVarArr;
                if (TextUtils.isEmpty(str3)) {
                    Log.d("UserMessagingPlatform", "Error on action: empty action name");
                    return;
                }
                final String lowerCase = str3.toLowerCase();
                if (TextUtils.isEmpty(str4)) {
                    jSONObject = new JSONObject();
                } else {
                    try {
                        jSONObject = new JSONObject(str4);
                    } catch (JSONException unused) {
                        Log.d("UserMessagingPlatform", a.w(new StringBuilder(String.valueOf(lowerCase).length() + 32 + String.valueOf(str4).length()), "Action[", lowerCase, "]: failed to parse args: ", str4));
                        return;
                    }
                }
                String valueOf = String.valueOf(jSONObject);
                Log.d("UserMessagingPlatform", a.w(new StringBuilder(String.valueOf(lowerCase).length() + 10 + valueOf.length()), "Action[", lowerCase, "]: ", valueOf));
                for (final zzg zzgVar : zzgVarArr2) {
                    FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.android.gms.internal.consent_sdk.zzf
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            return Boolean.valueOf(zzg.this.zzb(lowerCase, jSONObject));
                        }
                    });
                    zzgVar.zza().execute(futureTask);
                    try {
                    } catch (InterruptedException e2) {
                        Log.d("UserMessagingPlatform", a.v(new StringBuilder(String.valueOf(lowerCase).length() + 33), "Thread interrupted for Action[", lowerCase, "]: "), e2);
                    } catch (ExecutionException e3) {
                        Log.d("UserMessagingPlatform", a.v(new StringBuilder(String.valueOf(lowerCase).length() + 24), "Failed to run Action[", lowerCase, "]: "), e3.getCause());
                    }
                    if (((Boolean) futureTask.get()).booleanValue()) {
                        return;
                    }
                }
            }
        });
    }
}
