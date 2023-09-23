package com.video_converter.video_compressor;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Toast;
import com.video_converter.video_compressor.DeeplinkActivity;
import e.b.c.k;
import e.s.t;
import f.j.b.c.a;
import f.n.a.l.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public class DeeplinkActivity extends k {
    public static final /* synthetic */ int u = 0;
    public List<a> t = new ArrayList();

    @Override // e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_deeplink);
        b.c().d(this).f6543h.e(this, new t() { // from class: f.n.a.b
            @Override // e.s.t
            public final void a(Object obj) {
                boolean z;
                DeeplinkActivity deeplinkActivity = DeeplinkActivity.this;
                List<f.j.b.c.a> list = (List) obj;
                Objects.requireNonNull(deeplinkActivity);
                if (list == null) {
                    return;
                }
                deeplinkActivity.t.clear();
                deeplinkActivity.t = list;
                Intent intent = deeplinkActivity.getIntent();
                if (intent != null && intent.getAction() != null && intent.getData() != null) {
                    String action = intent.getAction();
                    Uri data = intent.getData();
                    try {
                        if ("android.intent.action.VIEW".equals(action) && data != null) {
                            String queryParameter = data.getQueryParameter("sku_id");
                            if (queryParameter != null && !queryParameter.isEmpty()) {
                                Iterator<f.j.b.c.a> it = deeplinkActivity.t.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        z = false;
                                        break;
                                    }
                                    f.j.b.c.a next = it.next();
                                    if (next.c.equals(queryParameter)) {
                                        f.n.a.l.b.c().d(deeplinkActivity).f(deeplinkActivity, next.r);
                                        z = true;
                                        deeplinkActivity.finish();
                                        break;
                                    }
                                }
                                if (z) {
                                    return;
                                }
                                Toast.makeText(deeplinkActivity, "Something went wrong", 0).show();
                                deeplinkActivity.finish();
                                return;
                            }
                            Toast.makeText(deeplinkActivity, "Something went wrong", 0).show();
                            deeplinkActivity.finish();
                            return;
                        }
                        deeplinkActivity.finish();
                        return;
                    } catch (Exception unused) {
                        deeplinkActivity.finish();
                        return;
                    }
                }
                Toast.makeText(deeplinkActivity, "Something went wrong", 0).show();
                deeplinkActivity.finish();
            }
        });
        b.c().d(this).f6541f.e(this, new t() { // from class: f.n.a.a
            @Override // e.s.t
            public final void a(Object obj) {
                Boolean bool = (Boolean) obj;
                int i2 = DeeplinkActivity.u;
            }
        });
    }

    @Override // e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
    }
}
