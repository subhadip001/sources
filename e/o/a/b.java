package e.o.a;

import android.system.Os;
import java.io.FileDescriptor;

/* compiled from: ExifInterfaceUtils.java */
/* loaded from: classes.dex */
public class b {
    public static void a(FileDescriptor fileDescriptor) {
        Os.close(fileDescriptor);
    }

    public static FileDescriptor b(FileDescriptor fileDescriptor) {
        return Os.dup(fileDescriptor);
    }

    public static long c(FileDescriptor fileDescriptor, long j2, int i2) {
        return Os.lseek(fileDescriptor, j2, i2);
    }
}
