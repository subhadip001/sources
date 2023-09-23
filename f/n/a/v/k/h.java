package f.n.a.v.k;

import android.app.LoaderManager;
import android.content.Context;
import android.content.CursorLoader;
import android.content.Intent;
import android.content.Loader;
import android.database.Cursor;
import android.database.StaleDataException;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.util.Log;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.MimeTypeMap;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.video_converter.video_compressor.R;
import java.io.File;
import java.util.Objects;

/* compiled from: OutputListFragment.java */
/* loaded from: classes2.dex */
public class h extends Fragment implements LoaderManager.LoaderCallbacks<Cursor> {

    /* renamed from: f  reason: collision with root package name */
    public Cursor f7263f;

    /* renamed from: g  reason: collision with root package name */
    public RecyclerView f7264g;

    /* renamed from: h  reason: collision with root package name */
    public View f7265h;

    /* renamed from: i  reason: collision with root package name */
    public e.b.g.a f7266i;

    /* renamed from: j  reason: collision with root package name */
    public LinearLayoutManager f7267j;

    /* renamed from: k  reason: collision with root package name */
    public d f7268k;

    /* renamed from: l  reason: collision with root package name */
    public String f7269l;

    /* renamed from: m  reason: collision with root package name */
    public String f7270m = "";
    public String n;
    public String o;
    public int p;
    public ProgressBar q;
    public b r;

    /* compiled from: OutputListFragment.java */
    /* loaded from: classes2.dex */
    public class a implements f.n.a.j.c {
        public final /* synthetic */ SparseBooleanArray a;

        public a(SparseBooleanArray sparseBooleanArray) {
            this.a = sparseBooleanArray;
        }

        @Override // f.n.a.j.c
        public void a() {
            h hVar = h.this;
            SparseBooleanArray sparseBooleanArray = this.a;
            Objects.requireNonNull(hVar);
            try {
                for (int size = sparseBooleanArray.size() - 1; size >= 0; size--) {
                    if (sparseBooleanArray.valueAt(size)) {
                        hVar.f7263f.moveToPosition(sparseBooleanArray.keyAt(size));
                        f.n.a.o.d dVar = new f.n.a.o.d(hVar.f7263f);
                        d dVar2 = hVar.f7268k;
                        Context context = hVar.getContext();
                        Uri uri = dVar.c;
                        Objects.requireNonNull(dVar2);
                        File file = new File(f.n.a.v.a.e.e(context, uri));
                        if (file.exists()) {
                            file.delete();
                        }
                        context.getContentResolver().delete(uri, null, null);
                        dVar2.notifyDataSetChanged();
                    }
                }
                hVar.getActivity().getLoaderManager().restartLoader(hVar.p, null, hVar);
                Toast.makeText(hVar.getActivity(), hVar.getActivity().getResources().getString(R.string.deleted_files_msg, Integer.valueOf(sparseBooleanArray.size())), 0).show();
                e.b.g.a aVar = hVar.f7266i;
                if (aVar != null) {
                    aVar.c();
                }
            } catch (StaleDataException unused) {
                Toast.makeText(hVar.getActivity(), hVar.getActivity().getResources().getString(R.string.something_went_wrong), 0).show();
            }
        }
    }

    /* compiled from: OutputListFragment.java */
    /* loaded from: classes2.dex */
    public interface b {
        void l();

        void m(SparseBooleanArray sparseBooleanArray);

        void p(SparseBooleanArray sparseBooleanArray);
    }

    public static void i(h hVar, int i2) {
        e.b.g.a aVar;
        d dVar = hVar.f7268k;
        boolean z = !dVar.b.get(i2);
        if (z) {
            dVar.b.put(i2, z);
        } else {
            dVar.b.delete(i2);
        }
        dVar.notifyDataSetChanged();
        boolean z2 = hVar.f7268k.n() > 0;
        StringBuilder A = f.a.b.a.a.A("onListItemSelect: ");
        A.append(hVar.f7266i == null);
        A.append("has ci: ");
        A.append(z2);
        Log.d("TEST", A.toString());
        if (z2 && hVar.f7266i == null) {
            hVar.f7266i = ((e.b.c.k) hVar.getActivity()).L().D(new l(hVar.getActivity(), hVar.r, hVar.f7268k));
        } else if (!z2 && (aVar = hVar.f7266i) != null) {
            aVar.c();
        }
        e.b.g.a aVar2 = hVar.f7266i;
        if (aVar2 != null) {
            aVar2.o(hVar.getActivity().getResources().getString(R.string.output_file_selection_count, Integer.valueOf(hVar.f7268k.n())));
        }
    }

    public static void k(h hVar, int i2) {
        hVar.f7263f.moveToPosition(i2);
        f.n.a.o.d dVar = new f.n.a.o.d(hVar.f7263f);
        Intent intent = new Intent();
        intent.setAction("android.intent.action.VIEW");
        intent.addFlags(1);
        Uri uri = dVar.c;
        f.n.a.j.d dVar2 = new f.n.a.j.d();
        try {
            try {
                Cursor cursor = hVar.f7263f;
                String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(cursor.getString(cursor.getColumnIndex("_data")));
                dVar2.d(hVar.getContext(), uri, fileExtensionFromUrl != null ? MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl) : null);
            } catch (Exception unused) {
                Cursor cursor2 = hVar.f7263f;
                dVar2.d(hVar.getContext(), uri, cursor2.getString(cursor2.getColumnIndex("mime_type")));
            }
        } catch (Exception unused2) {
            Toast.makeText(hVar.getContext(), hVar.getActivity().getResources().getString(R.string.error_opening_file), 0).show();
            String str = "" + dVar.c;
            StringBuilder A = f.a.b.a.a.A("");
            Cursor cursor3 = hVar.f7263f;
            A.append(cursor3.getString(cursor3.getColumnIndex("_data")));
            String sb = A.toString();
            StringBuilder A2 = f.a.b.a.a.A("");
            Cursor cursor4 = hVar.f7263f;
            A2.append(cursor4.getString(cursor4.getColumnIndex("mime_type")));
            String sb2 = A2.toString();
            Bundle bundle = new Bundle();
            try {
                bundle.putString("Output_crased_for_uri", str);
                bundle.putString("Output_crased_for_path", sb);
                bundle.putString("Output_crased_for_type", sb2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void l(SparseBooleanArray sparseBooleanArray) {
        f.n.a.v.a.j.s(getContext(), getString(R.string.delete_file), getString(R.string.delete_file_msg), new a(sparseBooleanArray));
    }

    public void m(Cursor cursor) {
        ProgressBar progressBar = this.q;
        if (progressBar != null) {
            progressBar.setVisibility(8);
        }
        if (cursor != null && cursor.getCount() != 0) {
            this.f7265h.findViewById(R.id.empty_view).setVisibility(8);
            this.f7264g.setVisibility(0);
            this.f7263f = cursor;
            d dVar = this.f7268k;
            dVar.a = cursor;
            dVar.notifyDataSetChanged();
            return;
        }
        this.f7264g.setVisibility(4);
        this.f7265h.findViewById(R.id.empty_view).setVisibility(0);
    }

    public final void o() {
        getActivity().getLoaderManager().restartLoader(this.p, null, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.n = "date_modified";
        this.o = getResources().getString(R.string.action_dsc);
        getActivity().getLoaderManager().initLoader(this.p, null, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        this.r = (b) context;
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public Loader<Cursor> onCreateLoader(int i2, Bundle bundle) {
        this.f7265h.findViewById(R.id.empty_view).setVisibility(8);
        this.f7265h.findViewById(R.id.loading_indicator).setVisibility(0);
        this.f7270m = this.f7270m.replace('\'', '_');
        StringBuilder A = f.a.b.a.a.A("_data like '%");
        A.append(this.f7269l);
        String p = f.a.b.a.a.p(f.a.b.a.a.u(A, this.f7270m, "%'"), f.a.b.a.a.u(f.a.b.a.a.A(" and _data not like '"), this.f7269l, ".cache%'"));
        Context context = getContext();
        Uri contentUri = MediaStore.Files.getContentUri("external");
        return new CursorLoader(context, contentUri, null, p, null, this.n + " " + this.o);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_output_list, viewGroup, false);
        this.f7265h = inflate;
        this.f7264g = (RecyclerView) inflate.findViewById(R.id.folder_list_recycler_view);
        ProgressBar progressBar = (ProgressBar) this.f7265h.findViewById(R.id.loading_indicator);
        this.q = progressBar;
        progressBar.setVisibility(0);
        this.f7269l = getArguments().getString("FOLDER_NAME");
        this.p = getArguments().getInt("FRAGMENT_ID");
        this.f7264g.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext());
        this.f7267j = linearLayoutManager;
        this.f7264g.setLayoutManager(linearLayoutManager);
        this.f7264g.setItemAnimator(new e.u.b.k());
        d dVar = new d(getContext(), this.p, new f(this));
        this.f7268k = dVar;
        this.f7264g.setAdapter(dVar);
        RecyclerView recyclerView = this.f7264g;
        recyclerView.u.add(new k(getContext(), this.f7264g, new e(this)));
        return this.f7265h;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public /* bridge */ /* synthetic */ void onLoadFinished(Loader<Cursor> loader, Cursor cursor) {
        m(cursor);
    }

    @Override // android.app.LoaderManager.LoaderCallbacks
    public void onLoaderReset(Loader<Cursor> loader) {
        d dVar = this.f7268k;
        dVar.a = null;
        dVar.notifyDataSetChanged();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        d dVar = this.f7268k;
        if (dVar != null) {
            dVar.b = new SparseBooleanArray();
            dVar.notifyDataSetChanged();
        }
        e.b.g.a aVar = this.f7266i;
        if (aVar != null) {
            aVar.c();
            this.f7266i = null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
