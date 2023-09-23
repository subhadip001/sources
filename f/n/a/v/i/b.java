package f.n.a.v.i;

import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;
import com.arthenica.ffmpegkit.MediaInformation;
import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.dialogs.infoDialog.InfoDialogDismissedEvent;
import com.video_converter.video_compressor.model.MediaFile;
import com.video_converter.video_compressor.processorFactory.ProcessorType;
import com.video_converter.video_compressor.screens.vidCompInputScreen.VidCompInputScreenActivity;
import f.n.a.x.e;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import m.a.a.l;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: IntermediateSelectionScreenController.java */
/* loaded from: classes2.dex */
public class b implements a, e.a {
    public Activity a;
    public d b;
    public f.n.a.h.c c;

    /* renamed from: d  reason: collision with root package name */
    public f.n.a.h.d.d f7235d;

    /* renamed from: e  reason: collision with root package name */
    public f.n.a.k.a f7236e;

    /* renamed from: f  reason: collision with root package name */
    public f.n.a.k.b f7237f;

    /* renamed from: g  reason: collision with root package name */
    public m.a.a.c f7238g = m.a.a.c.b();

    /* renamed from: h  reason: collision with root package name */
    public List<MediaFile> f7239h;

    public b(Activity activity, f.n.a.h.c cVar, f.n.a.h.d.d dVar, f.n.a.k.a aVar) {
        this.a = activity;
        this.c = cVar;
        this.f7235d = dVar;
        this.f7236e = aVar;
        this.f7237f = aVar.d();
    }

    @Override // f.n.a.v.i.a
    public void a() {
        Intent intent;
        List<MediaFile> list = this.f7239h;
        if (list != null && list.size() != 0) {
            if (this.f7239h.size() == 1) {
                Log.d("TAGTAG", "onConfirmBtnClicked: ");
                f.n.a.h.d.d dVar = this.f7235d;
                MediaFile mediaFile = this.f7239h.get(0);
                ProcessorType processorType = ProcessorType.VIDEO_COMPRESSOR;
                Objects.requireNonNull(dVar);
                intent = new Intent(dVar.a, VidCompInputScreenActivity.class);
                intent.putExtra("path", mediaFile.f1370h);
                intent.putExtra("name", mediaFile.b());
                intent.putExtra(MediaInformation.KEY_DURATION, mediaFile.f1374l);
                intent.putExtra("requested_for", processorType);
                intent.putExtra("SELECTED_FILE", mediaFile);
                intent.putExtra("file_uri", mediaFile.f1372j.toString());
            } else {
                e e2 = this.c.e();
                e2.a.g(e2.b.a.a().h(this.f7239h), f.n.a.i.b.f6954d);
                intent = new Intent(this.a, VidCompInputScreenActivity.class);
            }
            this.a.startActivity(intent);
            return;
        }
        Activity activity = this.a;
        Toast.makeText(activity, activity.getString(R.string.file_not_found), 0).show();
    }

    @Override // f.n.a.x.e.a
    public void c() {
        this.b.f7244j.setVisibility(8);
        this.f7237f.b(this.f7236e.j(), "SELECTED_FILES_RETRIEVE_ERROR_DIALOG");
    }

    @Override // f.n.a.x.e.a
    public void h(ArrayList<MediaFile> arrayList) {
        this.b.f7244j.setVisibility(8);
        this.f7239h = arrayList;
        f.n.a.v.t.i.b bVar = this.b.f7243i;
        bVar.b = arrayList;
        bVar.notifyDataSetChanged();
    }

    @l(threadMode = ThreadMode.MAIN)
    public void onEvent(InfoDialogDismissedEvent infoDialogDismissedEvent) {
        if (infoDialogDismissedEvent.a.equals("SELECTED_FILES_RETRIEVE_ERROR_DIALOG") && infoDialogDismissedEvent.b == InfoDialogDismissedEvent.ClickedButton.POSITIVE) {
            this.a.finish();
        }
    }
}
