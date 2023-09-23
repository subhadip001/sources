package f.n.a.n;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.purchaseScreen.PurchaseScreenActivity;
import e.p.c.n;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/* compiled from: DeepLinkHelper.java */
/* loaded from: classes2.dex */
public class c {
    public n a;
    public String b = null;
    public Boolean c = Boolean.FALSE;

    /* renamed from: d  reason: collision with root package name */
    public String f7032d = null;

    /* renamed from: e  reason: collision with root package name */
    public String f7033e = null;

    /* renamed from: f  reason: collision with root package name */
    public boolean f7034f = false;

    /* renamed from: g  reason: collision with root package name */
    public String f7035g = null;

    public c(n nVar) {
        this.a = nVar;
        f.n.a.l.b.c().d(nVar).h();
    }

    public void a() {
        if (b()) {
            Uri parse = Uri.parse(this.b);
            if (Objects.equals(parse.getPath(), "/products")) {
                List<String> queryParameters = parse.getQueryParameters("show");
                if (queryParameters.isEmpty()) {
                    f.n.a.v.a.j.k(this.a);
                } else {
                    n nVar = this.a;
                    ArrayList<String> arrayList = new ArrayList<>(queryParameters);
                    Bundle bundle = new Bundle();
                    bundle.putStringArrayList("KEY_PRODUCT_IDS", arrayList);
                    Intent intent = new Intent(nVar, PurchaseScreenActivity.class);
                    intent.putExtras(bundle);
                    nVar.startActivity(intent);
                }
            } else if (Objects.equals(parse.getPath(), "/offer")) {
                String queryParameter = parse.getQueryParameter("base_product_id");
                String queryParameter2 = parse.getQueryParameter("discounted_product_id");
                this.f7035g = parse.getQueryParameter("title");
                if (queryParameter != null && queryParameter2 != null) {
                    this.f7034f = true;
                    this.f7032d = queryParameter2;
                    this.f7033e = queryParameter;
                    f.n.a.l.b.c().d(this.a).h();
                }
            }
            this.c = Boolean.TRUE;
        }
    }

    public boolean b() {
        Intent intent = this.a.getIntent();
        if (intent != null) {
            this.b = intent.getStringExtra("deep_link_uri");
        }
        String str = this.b;
        return (str == null || str.isEmpty() || this.c.booleanValue()) ? false : true;
    }

    public void c(List<f.j.b.c.a> list, f.n.a.k.a aVar) {
        try {
            if (this.f7034f) {
                f.j.b.c.a aVar2 = null;
                f.j.b.c.a aVar3 = null;
                for (f.j.b.c.a aVar4 : list) {
                    String str = this.f7032d;
                    if (str != null && aVar4 != null && aVar4.c.equals(str)) {
                        aVar2 = aVar4;
                    }
                    String str2 = this.f7033e;
                    if (str2 != null && aVar4 != null && aVar4.c.equals(str2)) {
                        aVar3 = aVar4;
                    }
                }
                if (aVar2 == null || aVar3 == null) {
                    return;
                }
                String str3 = aVar2.c;
                String str4 = this.f7035g;
                f.c.a.a.h hVar = new f.c.a.a.h(str3, (str4 == null || str4.isEmpty()) ? this.a.getString(R.string.discount) : this.f7035g, (float) (Long.valueOf(aVar3.f6589l).longValue() / 1000000.0d), (float) (Long.valueOf(aVar2.f6589l).longValue() / 1000000.0d), aVar2.f6585h, 0L, aVar2.r);
                this.f7034f = false;
                aVar.i(hVar, "deep_link");
            }
        } catch (Exception unused) {
        }
    }
}
