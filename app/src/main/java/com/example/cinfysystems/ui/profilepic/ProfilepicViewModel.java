package com.example.cinfysystems.ui.profilepic;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ProfilepicViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public ProfilepicViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is gallery fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}