    # If using Gson


         -keep class java.io.BufferedInputStream { *; }
         -keep class java.nio.file.Path { *; }
         -keep class java.util.concurrent.LinkedBlockingQueue { *; }
         -keep interface java.util.concurrent.BlockingQueue { *; }
        -keep class com.rozetka.core.SettingsData { *; }
         -keep interface com.rozetka.core.SettingsData { *; }
         -keep class kotlinx.coroutines.android.AndroidExceptionPreHandler
         -keep class kotlinx.coroutines.android.AndroidDispatcherFactory