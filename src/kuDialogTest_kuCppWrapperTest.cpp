#include <jni.h>
#include <stdio.h>
#include "kuDialogTest_kuCppWrapperTest.h"

extern "C" {
	JNIEXPORT void JNICALL Java_kuDialogTest_kuCppWrapperTest_kuWrapperHelloWorld(JNIEnv * env, jobject obj)
	{
		printf("It's fucking JNI.");
	}

	JNIEXPORT jint JNICALL Java_kuDialogTest_kuCppWrapperTest_kuWrapperAddTest(JNIEnv * env, jobject obj, jint a, jint b)
	{
		return (a + b);
	}
}