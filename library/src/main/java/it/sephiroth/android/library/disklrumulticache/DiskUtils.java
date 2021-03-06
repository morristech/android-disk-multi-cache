package it.sephiroth.android.library.disklrumulticache;

import android.content.Context;
import android.os.Environment;

import java.io.File;

public class DiskUtils {
    public static final int IO_BUFFER_SIZE = 8 * 1024;

    public static boolean isExternalStorageRemovable() {
        return Environment.isExternalStorageRemovable();
    }

    public static boolean hasExternalCacheDir() {
        return true;
    }

    public static File getExternalCacheDir(Context context) {
        if (hasExternalCacheDir()) {
            final File file = context.getExternalCacheDir();
            if (null != file) {
                return file;
            }
        }
        return context.getCacheDir();
    }
}

