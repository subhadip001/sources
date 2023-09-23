package f.h.b.d.a.b;

import com.google.android.play.core.assetpacks.AssetPackState;

/* compiled from: com.google.android.play:core@@1.10.3 */
/* loaded from: classes.dex */
public final /* synthetic */ class w implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ x f5744f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ AssetPackState f5745g;

    public /* synthetic */ w(x xVar, AssetPackState assetPackState) {
        this.f5744f = xVar;
        this.f5745g = assetPackState;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f5744f.c(this.f5745g);
    }
}
