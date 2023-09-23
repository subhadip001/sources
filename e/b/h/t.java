package e.b.h;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
import e.i.j.e;

/* compiled from: AppCompatReceiveContentHelper.java */
/* loaded from: classes.dex */
public final class t {
    public static boolean a(DragEvent dragEvent, TextView textView, Activity activity) {
        e.b cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                cVar = new e.a(clipData, 3);
            } else {
                cVar = new e.c(clipData, 3);
            }
            e.i.j.z.r(textView, cVar.build());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean b(DragEvent dragEvent, View view, Activity activity) {
        e.b cVar;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            cVar = new e.a(clipData, 3);
        } else {
            cVar = new e.c(clipData, 3);
        }
        e.i.j.z.r(view, cVar.build());
        return true;
    }
}
