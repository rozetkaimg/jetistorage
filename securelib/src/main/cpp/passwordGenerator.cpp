//
// Created by Stanislav Klepikov on 22.02.2025.
//

#include <iostream>
#include <string>
#include <random>
#include <algorithm>
#include <chrono>
#include <jni.h>

extern "C" JNIEXPORT jstring

JNICALL
Java_com_rozetka_securelib_NativeLib_generatePassword(
        JNIEnv *env,
        jobject /* this */,
        jint length,
        jboolean useUppercase,
        jboolean useLowercase,
        jboolean useNumbers,
        jboolean useSymbols
) {
    std::string characters;
    if (useUppercase) characters += "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    if (useLowercase) characters += "abcdefghijklmnopqrstuvwxyz";
    if (useNumbers) characters += "0123456789";
    if (useSymbols) characters += "!@#$%^&*()_+=-`~[]{}|;':,./<>?";

    if (characters.empty()) {
        return env->NewStringUTF("");
    }
    std::random_device rd;
    std::mt19937 gen(rd());
    std::uniform_int_distribution<> dist(0, characters.size() - 1);

    std::string password;
    for (int i = 0; i < length; ++i) {
        password += characters[dist(gen)];
    }
    return env->NewStringUTF(password.c_str());
}