package com.video_converter.video_compressor.screens.outputScreen;

import android.app.RecoverableSecurityException;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.provider.MediaStore;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.arthenica.ffmpegkit.MediaInformation;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.nightcode.mediapicker.domain.constants.LayoutMode;
import com.nightcode.mediapicker.domain.constants.MediaType;
import com.nightcode.mediapicker.domain.constants.SortMode;
import com.nightcode.mediapicker.domain.constants.SortOrder;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.constants.OrderBy;
import com.video_converter.video_compressor.constants.User;
import com.video_converter.video_compressor.modules.SearchManagerModule;
import e.s.s;
import f.l.a.d.d.e;
import f.l.a.d.d.f;
import f.l.a.f.c.h.j;
import f.n.a.v.k.h;
import f.n.a.z.d;
import i.l.b.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import m.a.a.c;

/* loaded from: classes2.dex */
public class OutputsActivity extends SearchManagerModule implements h.b, f.l.a.d.e.b {
    public static final /* synthetic */ int J = 0;
    public Toolbar B;
    public Fragment C;
    public ActionMode E;
    public j G;
    public View H;
    public AdLoader I;
    public s<List<e>> D = new s<>();
    public boolean F = false;

    /* loaded from: classes2.dex */
    public class a implements View.OnClickListener {
        public a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            OutputsActivity.this.onBackPressed();
        }
    }

    /* loaded from: classes2.dex */
    public class b implements ActionMode.Callback {
        public b() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            int itemId = menuItem.getItemId();
            try {
                if (itemId == R.id.action_delete) {
                    OutputsActivity outputsActivity = OutputsActivity.this;
                    List<e> d2 = outputsActivity.D.d();
                    if (d2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i2 = 0; i2 < d2.size(); i2++) {
                            arrayList.add(Uri.parse(d2.get(i2).e()));
                        }
                        Log.d("ararar", "deleteFiles: $uriList");
                        if (!arrayList.isEmpty()) {
                            ContentResolver contentResolver = outputsActivity.getContentResolver();
                            outputsActivity.X(true);
                            int i3 = Build.VERSION.SDK_INT;
                            if (i3 >= 30) {
                                ArrayList arrayList2 = new ArrayList();
                                arrayList2.addAll(arrayList);
                                try {
                                    outputsActivity.startIntentSenderForResult(MediaStore.createDeleteRequest(contentResolver, arrayList2).getIntentSender(), 120, null, 0, 0, 0, null);
                                } catch (IntentSender.SendIntentException e2) {
                                    e2.printStackTrace();
                                }
                                outputsActivity.X(false);
                            } else if (i3 == 29) {
                                try {
                                    Iterator it = arrayList.iterator();
                                    while (it.hasNext()) {
                                        contentResolver.delete((Uri) it.next(), null, null);
                                    }
                                    c.b().f(SortMode.BY_DATE_MODIFIED);
                                } catch (RecoverableSecurityException e3) {
                                    try {
                                        outputsActivity.startIntentSenderForResult(e3.getUserAction().getActionIntent().getIntentSender(), 120, null, 0, 0, 0, null);
                                    } catch (IntentSender.SendIntentException e4) {
                                        e4.printStackTrace();
                                    }
                                }
                                outputsActivity.X(false);
                            } else {
                                try {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        contentResolver.delete((Uri) it2.next(), null, null);
                                    }
                                } catch (Exception unused) {
                                }
                                outputsActivity.X(false);
                                c.b().f(SortMode.BY_DATE_MODIFIED);
                            }
                        }
                    }
                } else if (itemId == R.id.action_share) {
                    OutputsActivity outputsActivity2 = OutputsActivity.this;
                    int i4 = OutputsActivity.J;
                    Objects.requireNonNull(outputsActivity2);
                    List<e> d3 = outputsActivity2.D.d();
                    if (d3 != null) {
                        ArrayList<? extends Parcelable> arrayList3 = new ArrayList<>();
                        for (int i5 = 0; i5 < d3.size(); i5++) {
                            arrayList3.add(Uri.parse(d3.get(i5).e()));
                        }
                        Intent intent = new Intent("android.intent.action.SEND");
                        intent.setType("video/*");
                        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList3);
                        intent.setFlags(3);
                        outputsActivity2.startActivity(Intent.createChooser(intent, "Share Using"));
                    }
                }
            } catch (Exception unused2) {
            }
            ActionMode actionMode2 = OutputsActivity.this.E;
            if (actionMode2 != null) {
                actionMode2.finish();
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            actionMode.getMenuInflater().inflate(R.menu.output_menu, menu);
            OutputsActivity outputsActivity = OutputsActivity.this;
            outputsActivity.E = actionMode;
            j jVar = outputsActivity.G;
            if (jVar != null) {
                f.l.a.d.b.j jVar2 = jVar.f6772j;
                if (jVar2 != null) {
                    jVar2.f6638d = false;
                    Log.d("IsSetterCalled", ": ");
                    jVar2.notifyDataSetChanged();
                    return true;
                }
                i.h("adapter");
                throw null;
            }
            return true;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
            OutputsActivity outputsActivity = OutputsActivity.this;
            outputsActivity.F = false;
            outputsActivity.D.i(new ArrayList());
            OutputsActivity outputsActivity2 = OutputsActivity.this;
            outputsActivity2.E = null;
            j jVar = outputsActivity2.G;
            if (jVar != null) {
                jVar.o();
            }
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return true;
        }
    }

    @Override // f.l.a.d.e.b
    public void A() {
    }

    @Override // f.l.a.d.e.b
    public void B(List<? extends e> list) {
    }

    @Override // f.n.a.p.c
    public void Q() {
        try {
            e.p.c.a aVar = new e.p.c.a(H());
            String str = f.n.a.i.b.a;
            aVar.g(R.id.frame_container, W(), "fragment_tag", 1);
            aVar.d();
            new Handler().postDelayed(new f.n.a.v.k.j(this), 200L);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @Override // f.n.a.p.c
    public void R() {
        onBackPressed();
    }

    @Override // com.video_converter.video_compressor.modules.SearchManagerModule
    public void S(String str) {
        try {
            Y();
            Fragment fragment = this.C;
            if (fragment != null) {
                h hVar = (h) fragment;
                hVar.f7270m = str;
                Log.d("TEST", "performSearch: " + str);
                hVar.o();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.video_converter.video_compressor.modules.SearchManagerModule
    public void T(SearchManagerModule.ListType listType) {
    }

    @Override // com.video_converter.video_compressor.modules.SearchManagerModule
    public void U(String str) {
        try {
            Y();
            Fragment fragment = this.C;
            if (fragment != null) {
                h hVar = (h) fragment;
                hVar.o = str;
                hVar.o();
            }
        } catch (Exception unused) {
        }
    }

    @Override // com.video_converter.video_compressor.modules.SearchManagerModule
    public void V(OrderBy orderBy) {
        try {
            Y();
            Fragment fragment = this.C;
            if (fragment != null) {
                h hVar = (h) fragment;
                Objects.requireNonNull(hVar);
                int ordinal = orderBy.ordinal();
                if (ordinal == 0) {
                    hVar.n = "title";
                } else if (ordinal == 1) {
                    hVar.n = "_size";
                } else if (ordinal == 2) {
                    hVar.n = MediaInformation.KEY_DURATION;
                } else if (ordinal != 3) {
                    hVar.n = "title";
                } else {
                    hVar.n = "date_modified";
                }
                hVar.o();
            }
        } catch (Exception unused) {
        }
    }

    public final Fragment W() {
        Bundle bundle = new Bundle();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f(null, "Movies/VideoCompressor/", null, null, null, 16));
        bundle.putSerializable("extra.options", arrayList);
        j jVar = new j();
        this.G = jVar;
        jVar.setArguments(bundle);
        return this.G;
    }

    public void X(boolean z) {
        Log.d("TestProgress", "setClProgressLayVisibility: " + z);
        this.H.setVisibility(z ? 0 : 8);
    }

    public final void Y() {
        this.C = H().I("fragment_tag");
    }

    @Override // f.l.a.d.e.b
    public SortMode a() {
        return SortMode.BY_DATE_MODIFIED;
    }

    @Override // f.l.a.d.e.b
    public void c(e eVar) {
        ActionMode actionMode;
        if (this.F) {
            ArrayList arrayList = (ArrayList) this.D.d();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            int i2 = 0;
            while (true) {
                if (i2 >= arrayList.size()) {
                    i2 = -1;
                    break;
                } else if (((e) arrayList.get(i2)).e().equals(eVar.e())) {
                    break;
                } else {
                    i2++;
                }
            }
            if (i2 >= 0) {
                arrayList.remove(i2);
            }
            this.D.i(arrayList);
            if (arrayList.size() != 0 || (actionMode = this.E) == null) {
                return;
            }
            actionMode.finish();
        }
    }

    @Override // f.l.a.d.e.b
    public MediaType g() {
        return MediaType.VIDEO;
    }

    @Override // f.l.a.d.e.b
    public void j(boolean z) {
        Log.d("TAGTAGTAG", "onSelectionUpdate: " + z);
    }

    @Override // f.n.a.v.k.h.b
    public void l() {
        Y();
        Fragment fragment = this.C;
        if (fragment != null) {
            h hVar = (h) fragment;
            if (hVar.f7266i != null) {
                hVar.f7266i = null;
            }
        }
    }

    @Override // f.n.a.v.k.h.b
    public void m(SparseBooleanArray sparseBooleanArray) {
        Log.d("TEST", "deleteRows: ");
        Y();
        Fragment fragment = this.C;
        if (fragment != null) {
            ((h) fragment).l(sparseBooleanArray);
        }
    }

    @Override // f.l.a.d.e.b
    public void n(List<? extends e> list) {
    }

    @Override // com.video_converter.video_compressor.modules.SearchManagerModule, f.n.a.p.c, e.p.c.n, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i2, int i3, Intent intent) {
        super.onActivityResult(i2, i3, intent);
        if (i2 == 120) {
            c.b().f(SortMode.BY_DATE_MODIFIED);
        }
    }

    @Override // com.video_converter.video_compressor.modules.SearchManagerModule, f.n.a.p.c, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // com.video_converter.video_compressor.modules.SearchManagerModule, f.n.a.p.c, f.n.a.v.c.e.a, e.p.c.n, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FirebaseCrashlytics.getInstance().setCustomKey("CURRENT_ACTIVITY", "OutputsActivity");
        FirebaseCrashlytics.getInstance().setCustomKey("IS_SUBSCRIBED_USER", User.a());
        setContentView(R.layout.activity_outputs);
        this.H = findViewById(R.id.clProgressLay);
        try {
            Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
            this.B = toolbar;
            L().A(toolbar);
            M().q(getResources().getString(R.string.outputs));
            M().m(true);
        } catch (NullPointerException e2) {
            e2.printStackTrace();
        }
        this.B.setNavigationOnClickListener(new a());
        if (e.i.c.a.checkSelfPermission(this, "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            if (ActivityCompat.shouldShowRequestPermissionRationale(this, "android.permission.WRITE_EXTERNAL_STORAGE")) {
                f.n.a.v.a.j.r(this, new f.n.a.p.a(this));
            } else if (this.w.getBoolean("android.permission.WRITE_EXTERNAL_STORAGE", false)) {
                f.n.a.v.a.j.r(this, new f.n.a.p.b(this));
            } else {
                ActivityCompat.requestPermissions(this, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, 777);
            }
            SharedPreferences.Editor edit = this.w.edit();
            edit.putBoolean("android.permission.WRITE_EXTERNAL_STORAGE", true);
            edit.commit();
        } else {
            Q();
        }
        this.u = (LinearLayout) findViewById(R.id.ad_holder);
        if (!User.a()) {
            new Handler().postDelayed(new f.n.a.v.k.i(this), 500L);
        }
        d.a(this, "OutputsActivity");
    }

    @Override // com.video_converter.video_compressor.modules.SearchManagerModule, android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        menu.findItem(R.id.picker_mode).setVisible(false);
        return true;
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // e.p.c.n, android.app.Activity
    public void onPause() {
        super.onPause();
    }

    @Override // e.p.c.n, android.app.Activity
    public void onResume() {
        super.onResume();
        d.a(this, "OutputsActivity");
    }

    @Override // f.n.a.v.c.e.a, e.b.c.k, e.p.c.n, android.app.Activity
    public void onStop() {
        super.onStop();
    }

    @Override // f.n.a.v.k.h.b
    public void p(SparseBooleanArray sparseBooleanArray) {
        Y();
        Fragment fragment = this.C;
        if (fragment != null) {
            h hVar = (h) fragment;
            ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
            for (int size = sparseBooleanArray.size() - 1; size >= 0; size--) {
                if (sparseBooleanArray.valueAt(size)) {
                    hVar.f7263f.moveToPosition(size);
                    arrayList.add(new f.n.a.o.d(hVar.f7263f).c);
                }
            }
            if (arrayList.size() == 1) {
                f.n.a.v.a.j.o(hVar.requireContext(), (Uri) arrayList.get(0), false);
            } else {
                Context requireContext = hVar.requireContext();
                Intent intent = new Intent(arrayList.size() == 1 ? "android.intent.action.SEND" : "android.intent.action.SEND_MULTIPLE");
                intent.setType("video/*");
                intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
                requireContext.startActivity(Intent.createChooser(intent, "Share via"));
            }
            e.b.g.a aVar = hVar.f7266i;
            if (aVar != null) {
                aVar.c();
            }
        }
    }

    @Override // f.l.a.d.e.b
    public SortOrder q() {
        return SortOrder.ASC;
    }

    @Override // f.l.a.d.e.b
    public LayoutMode t() {
        return LayoutMode.LIST;
    }

    @Override // f.l.a.d.e.b
    public boolean u() {
        return false;
    }

    @Override // f.l.a.d.e.b
    public LiveData<List<e>> w() {
        return this.D;
    }

    @Override // f.l.a.d.e.b
    public boolean x(e eVar) {
        if (this.F) {
            return false;
        }
        this.F = true;
        this.B.startActionMode(new b());
        z(eVar);
        return true;
    }

    @Override // f.l.a.d.e.b
    public boolean y() {
        return false;
    }

    @Override // f.l.a.d.e.b
    public void z(e eVar) {
        if (this.F) {
            ArrayList arrayList = (ArrayList) this.D.d();
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(eVar);
            this.D.i(arrayList);
            return;
        }
        Uri parse = Uri.parse(eVar.e());
        try {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setDataAndType(parse, "video/*");
            intent.addFlags(65);
            startActivity(intent);
        } catch (Exception unused) {
        }
    }
}
