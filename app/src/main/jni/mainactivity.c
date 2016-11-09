#include <jni.h>
JNIEXPORT jstring JNICALL
Java_com_example_renpeng_ndkdemo_MainActivity_getString(JNIEnv *env, jobject instance) {

    // TODO
    jclass cls=(*env)->GetObjectClass(env,instance);

    jmethodID mid=(*env)->GetMethodID(env,cls,"setTtt","()V");

//    jclass native_clazz = (*env)->GetObjectClass(env,"com/example/root/jnidemo/JniData");

    (*env)->CallVoidMethod(env,instance,mid);


    return (*env)->NewStringUTF(env, "AndroidStudio NDK");
}