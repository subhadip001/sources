package f.n.a.v.j;

import com.video_converter.video_compressor.screens.newFilePicker.MediaPickerActivity;

/* compiled from: MediaPickerActivity.java */
/* loaded from: classes2.dex */
public class d implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ MediaPickerActivity f7252f;

    public d(MediaPickerActivity mediaPickerActivity) {
        this.f7252f = mediaPickerActivity;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaPickerActivity mediaPickerActivity = this.f7252f;
        mediaPickerActivity.B(mediaPickerActivity.S);
        this.f7252f.P = null;
    }
}
