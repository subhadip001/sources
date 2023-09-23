package com.google.android.gms.signin;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.internal.Objects;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* loaded from: classes.dex */
public final class SignInOptions implements Api.ApiOptions.Optional {
    public static final SignInOptions zaa = new SignInOptions(false, false, null, false, null, null, false, null, null, null);
    private final boolean zab = false;
    private final boolean zac = false;
    private final String zad = null;
    private final boolean zae = false;
    private final boolean zah = false;
    private final String zaf = null;
    private final String zag = null;
    private final Long zai = null;
    private final Long zaj = null;

    public /* synthetic */ SignInOptions(boolean z, boolean z2, String str, boolean z3, String str2, String str3, boolean z4, Long l2, Long l3, zaf zafVar) {
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof SignInOptions) {
            boolean z = ((SignInOptions) obj).zab;
            return Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null) && Objects.equal(null, null);
        }
        return false;
    }

    public final int hashCode() {
        Boolean bool = Boolean.FALSE;
        return Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
