LOCAL_PATH := $(call my-dir)

include $(CLEAR_VARS)

LOCAL_MODULE    := com_tonyshark_store_Store
LOCAL_SRC_FILES := com_tonyshark_store_Store.cpp Store.cpp

include $(BUILD_SHARED_LIBRARY)
