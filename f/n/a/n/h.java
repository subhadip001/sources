package f.n.a.n;

import com.video_converter.video_compressor.constants.CompressionProfile;
import com.video_converter.video_compressor.screens.videoCompressorScreen.spinnerListItem.Item;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* compiled from: ResolutionHelper.java */
/* loaded from: classes2.dex */
public class h extends a {
    public final int[] a = {240, 320, 360, 480, 640, 720, 960, 1080};

    public List<Item> a(int i2, boolean z) {
        ArrayList arrayList = new ArrayList();
        if (z) {
            arrayList.add(new Item("Original", (String) null, true));
            for (int length = this.a.length - 1; length >= 0; length--) {
                arrayList.add(new Item(f.a.b.a.a.t(new StringBuilder(), this.a[length], "P"), (String) null));
            }
            return arrayList;
        }
        boolean z2 = false;
        if (i2 % 2 != 0) {
            i2--;
        }
        for (int length2 = this.a.length - 1; length2 >= 0; length2--) {
            int[] iArr = this.a;
            if (iArr[length2] == i2) {
                arrayList.add(new Item(i2 + "P", "Original", true));
                z2 = true;
            } else if (iArr[length2] < i2) {
                if (!z2) {
                    arrayList.add(new Item(i2 + "P", "Original", true));
                    z2 = true;
                }
                arrayList.add(new Item(f.a.b.a.a.t(new StringBuilder(), this.a[length2], "P"), (String) null));
            }
        }
        if (!z2) {
            arrayList.add(new Item(i2 + "P", "Original", true));
        }
        return arrayList;
    }

    public String b(CompressionProfile compressionProfile, f.n.a.m.c.a aVar) {
        int resolutionDivisor = compressionProfile.getResolutionDivisor();
        return String.format(Locale.US, "%sx%s", Integer.valueOf((aVar.o / resolutionDivisor) & (-2)), Integer.valueOf((aVar.n / resolutionDivisor) & (-2)));
    }

    public int c(String str) {
        return Integer.valueOf(str.substring(0, str.lastIndexOf("P"))).intValue();
    }
}
