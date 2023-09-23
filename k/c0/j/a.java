package k.c0.j;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.logging.Logger;
import l.o;
import l.y;

/* compiled from: FileSystem.java */
/* loaded from: classes2.dex */
public interface a {
    public static final a a = new C0234a();

    /* compiled from: FileSystem.java */
    /* renamed from: k.c0.j.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public class C0234a implements a {
        public void a(File file) {
            if (file.delete() || !file.exists()) {
                return;
            }
            throw new IOException("failed to delete " + file);
        }

        public void b(File file) {
            File[] listFiles = file.listFiles();
            if (listFiles != null) {
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        b(file2);
                    }
                    if (!file2.delete()) {
                        throw new IOException("failed to delete " + file2);
                    }
                }
                return;
            }
            throw new IOException("not a readable directory: " + file);
        }

        public void c(File file, File file2) {
            a(file2);
            if (file.renameTo(file2)) {
                return;
            }
            throw new IOException("failed to rename " + file + " to " + file2);
        }

        public y d(File file) {
            Logger logger = o.a;
            if (file != null) {
                return o.f(new FileInputStream(file));
            }
            throw new IllegalArgumentException("file == null");
        }
    }
}
