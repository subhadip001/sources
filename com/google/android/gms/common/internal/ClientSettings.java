package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.view.View;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.signin.SignInOptions;
import e.f.c;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
@VisibleForTesting
@KeepForSdk
/* loaded from: classes.dex */
public final class ClientSettings {
    private final Account zaa;
    private final Set<Scope> zab;
    private final Set<Scope> zac;
    private final Map<Api<?>, zab> zad;
    private final int zae;
    private final View zaf;
    private final String zag;
    private final String zah;
    private final SignInOptions zai;
    private Integer zaj;

    /* compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    @KeepForSdk
    /* loaded from: classes.dex */
    public static final class Builder {
        private Account zaa;
        private c<Scope> zab;
        private String zac;
        private String zad;
        private SignInOptions zae = SignInOptions.zaa;

        @KeepForSdk
        public ClientSettings build() {
            return new ClientSettings(this.zaa, this.zab, null, 0, null, this.zac, this.zad, this.zae, false);
        }

        @KeepForSdk
        public Builder setRealClientPackageName(String str) {
            this.zac = str;
            return this;
        }

        public final Builder zaa(Collection<Scope> collection) {
            if (this.zab == null) {
                this.zab = new c<>(0);
            }
            this.zab.addAll(collection);
            return this;
        }

        public final Builder zab(Account account) {
            this.zaa = account;
            return this;
        }

        public final Builder zac(String str) {
            this.zad = str;
            return this;
        }
    }

    @KeepForSdk
    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, zab> map, int i2, View view, String str, String str2, SignInOptions signInOptions) {
        this(account, set, map, i2, view, str, str2, signInOptions, false);
    }

    @KeepForSdk
    public static ClientSettings createDefault(Context context) {
        return new GoogleApiClient.Builder(context).zaa();
    }

    @KeepForSdk
    public Account getAccount() {
        return this.zaa;
    }

    @KeepForSdk
    @Deprecated
    public String getAccountName() {
        Account account = this.zaa;
        if (account != null) {
            return account.name;
        }
        return null;
    }

    @KeepForSdk
    public Account getAccountOrDefault() {
        Account account = this.zaa;
        return account != null ? account : new Account("<<default account>>", AccountType.GOOGLE);
    }

    @KeepForSdk
    public Set<Scope> getAllRequestedScopes() {
        return this.zac;
    }

    @KeepForSdk
    public Set<Scope> getApplicableScopes(Api<?> api) {
        zab zabVar = this.zad.get(api);
        if (zabVar != null && !zabVar.zaa.isEmpty()) {
            HashSet hashSet = new HashSet(this.zab);
            hashSet.addAll(zabVar.zaa);
            return hashSet;
        }
        return this.zab;
    }

    @KeepForSdk
    public int getGravityForPopups() {
        return this.zae;
    }

    @KeepForSdk
    public String getRealClientPackageName() {
        return this.zag;
    }

    @KeepForSdk
    public Set<Scope> getRequiredScopes() {
        return this.zab;
    }

    @KeepForSdk
    public View getViewForPopups() {
        return this.zaf;
    }

    public final SignInOptions zaa() {
        return this.zai;
    }

    public final Integer zab() {
        return this.zaj;
    }

    public final String zac() {
        return this.zah;
    }

    public final Map<Api<?>, zab> zad() {
        return this.zad;
    }

    public final void zae(Integer num) {
        this.zaj = num;
    }

    public ClientSettings(Account account, Set<Scope> set, Map<Api<?>, zab> map, int i2, View view, String str, String str2, SignInOptions signInOptions, boolean z) {
        this.zaa = account;
        Set<Scope> emptySet = set == null ? Collections.emptySet() : Collections.unmodifiableSet(set);
        this.zab = emptySet;
        map = map == null ? Collections.emptyMap() : map;
        this.zad = map;
        this.zaf = view;
        this.zae = i2;
        this.zag = str;
        this.zah = str2;
        this.zai = signInOptions == null ? SignInOptions.zaa : signInOptions;
        HashSet hashSet = new HashSet(emptySet);
        for (zab zabVar : map.values()) {
            hashSet.addAll(zabVar.zaa);
        }
        this.zac = Collections.unmodifiableSet(hashSet);
    }
}
