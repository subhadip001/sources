package f.n.a.v.j;

import com.video_converter.video_compressor.R;
import com.video_converter.video_compressor.screens.newFilePicker.MediaPickerActivity;
import java.util.Set;

/* compiled from: MediaPickerActivity.java */
/* loaded from: classes2.dex */
public class c implements Runnable {

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Set f7250f;

    /* renamed from: g  reason: collision with root package name */
    public final /* synthetic */ MediaPickerActivity f7251g;

    public c(MediaPickerActivity mediaPickerActivity, Set set) {
        this.f7251g = mediaPickerActivity;
        this.f7250f = set;
    }

    @Override // java.lang.Runnable
    public void run() {
        Boolean bool = Boolean.FALSE;
        String str = "";
        for (String str2 : this.f7250f) {
            if (bool.booleanValue()) {
                str = str + ',';
            }
            str = f.a.b.a.a.p(str, str2);
            bool = Boolean.TRUE;
        }
        MediaPickerActivity mediaPickerActivity = this.f7251g;
        f.n.a.k.b bVar = mediaPickerActivity.T;
        f.n.a.k.a aVar = mediaPickerActivity.U;
        bVar.b(f.n.a.k.e.a.m(String.format("%s \n\n%s\n\n%s:\n\n%s", aVar.a.getString(R.string.unsupported_selected_files), str.toUpperCase().replace(" ", ", "), aVar.a.getString(R.string.supported_file_formats), "mp4 mkv 3gp 3gpp mov flv avi mpg m4v mpeg vob wmv webm mts ts m2ts dav dat f4v mod movie lvf mxf h264".toUpperCase().replace(" ", ", ")), aVar.a.getString(R.string.dismiss)), "NETWORK_UNAVAILABLE_DIALOG");
    }
}
