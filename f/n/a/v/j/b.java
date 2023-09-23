package f.n.a.v.j;

import android.view.ViewGroup;
import com.video_converter.video_compressor.adControllers.AdLoader;
import com.video_converter.video_compressor.screens.newFilePicker.MediaPickerActivity;
import java.util.Objects;

/* compiled from: MediaPickerActivity.java */
/* loaded from: classes2.dex */
public class b implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ ViewGroup f7248f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ MediaPickerActivity f7249g;

    public b(MediaPickerActivity mediaPickerActivity, ViewGroup viewGroup) {
        this.f7249g = mediaPickerActivity;
        this.f7248f = viewGroup;
    }

    @Override // java.lang.Runnable
    public void run() {
        MediaPickerActivity mediaPickerActivity = this.f7249g;
        mediaPickerActivity.a0 = new AdLoader(mediaPickerActivity, this.f7248f, mediaPickerActivity);
        this.f7248f.setVisibility(0);
        MediaPickerActivity mediaPickerActivity2 = this.f7249g;
        Objects.requireNonNull(mediaPickerActivity2);
        try {
            mediaPickerActivity2.a0.c();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
