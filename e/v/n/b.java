package e.v.n;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.room.RoomDatabase;
import e.x.a.e;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: DBUtil.java */
/* loaded from: classes.dex */
public class b {
    public static void a(e.x.a.b bVar) {
        ArrayList arrayList = new ArrayList();
        Cursor f2 = ((e.x.a.f.a) bVar).f(new e.x.a.a("SELECT name FROM sqlite_master WHERE type = 'trigger'"));
        while (f2.moveToNext()) {
            try {
                arrayList.add(f2.getString(0));
            } catch (Throwable th) {
                f2.close();
                throw th;
            }
        }
        f2.close();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("room_fts_content_sync_")) {
                ((e.x.a.f.a) bVar).f2999f.execSQL(f.a.b.a.a.p("DROP TRIGGER IF EXISTS ", str));
            }
        }
    }

    public static Cursor b(RoomDatabase roomDatabase, e eVar, boolean z, CancellationSignal cancellationSignal) {
        Cursor k2 = roomDatabase.k(eVar, null);
        if (z && (k2 instanceof AbstractWindowedCursor)) {
            AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) k2;
            int count = abstractWindowedCursor.getCount();
            int numRows = abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count;
            if (Build.VERSION.SDK_INT < 23 || numRows < count) {
                try {
                    MatrixCursor matrixCursor = new MatrixCursor(abstractWindowedCursor.getColumnNames(), abstractWindowedCursor.getCount());
                    while (abstractWindowedCursor.moveToNext()) {
                        Object[] objArr = new Object[abstractWindowedCursor.getColumnCount()];
                        for (int i2 = 0; i2 < abstractWindowedCursor.getColumnCount(); i2++) {
                            int type = abstractWindowedCursor.getType(i2);
                            if (type == 0) {
                                objArr[i2] = null;
                            } else if (type == 1) {
                                objArr[i2] = Long.valueOf(abstractWindowedCursor.getLong(i2));
                            } else if (type == 2) {
                                objArr[i2] = Double.valueOf(abstractWindowedCursor.getDouble(i2));
                            } else if (type == 3) {
                                objArr[i2] = abstractWindowedCursor.getString(i2);
                            } else if (type == 4) {
                                objArr[i2] = abstractWindowedCursor.getBlob(i2);
                            } else {
                                throw new IllegalStateException();
                            }
                        }
                        matrixCursor.addRow(objArr);
                    }
                    return matrixCursor;
                } finally {
                    abstractWindowedCursor.close();
                }
            }
        }
        return k2;
    }

    public static int c(File file) {
        FileChannel fileChannel = null;
        try {
            ByteBuffer allocate = ByteBuffer.allocate(4);
            FileChannel channel = new FileInputStream(file).getChannel();
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) == 4) {
                allocate.rewind();
                int i2 = allocate.getInt();
                channel.close();
                return i2;
            }
            throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
        } catch (Throwable th) {
            if (0 != 0) {
                fileChannel.close();
            }
            throw th;
        }
    }
}
