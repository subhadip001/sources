package f.n.a.x;

import com.video_converter.video_compressor.common.ListenerEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Locale;

/* compiled from: FileManagingTask.java */
/* loaded from: classes2.dex */
public class b extends f.n.a.h.a<a> {

    /* compiled from: FileManagingTask.java */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void b();

        void c();

        void d(String str);
    }

    public final void c(ListenerEvent listenerEvent) {
        for (a aVar : b()) {
            int ordinal = listenerEvent.ordinal();
            if (ordinal == 0) {
                aVar.b();
            } else if (ordinal == 1) {
                aVar.a();
            } else if (ordinal == 2) {
                aVar.c();
            }
        }
    }

    public void f(String str) {
        File file = new File(str);
        if (!file.exists()) {
            c(ListenerEvent.READ_FAILED);
            return;
        }
        try {
            FileReader fileReader = new FileReader(file.getAbsoluteFile());
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            StringBuffer stringBuffer = new StringBuffer();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(String.format(Locale.US, "%s\n", readLine));
            }
            String stringBuffer2 = stringBuffer.toString();
            bufferedReader.close();
            fileReader.close();
            for (a aVar : b()) {
                aVar.d(stringBuffer2);
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            c(ListenerEvent.READ_FAILED);
        }
    }

    public void g(String str, String str2) {
        File file = new File(str2);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            FileWriter fileWriter = new FileWriter(file.getAbsoluteFile());
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.close();
            fileWriter.close();
            c(ListenerEvent.WRITE_SUCCESS);
        } catch (Exception e2) {
            e2.printStackTrace();
            c(ListenerEvent.WRITE_FAILED);
        }
    }
}
