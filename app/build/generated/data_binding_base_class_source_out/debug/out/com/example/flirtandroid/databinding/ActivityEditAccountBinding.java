// Generated by view binder compiler. Do not edit!
package com.example.flirtandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.flirtandroid.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityEditAccountBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button SaveBtn;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final EditText dobEditText;

  @NonNull
  public final EditText fnameEditText;

  @NonNull
  public final EditText lnameEditText;

  @NonNull
  public final Toolbar toolbar;

  private ActivityEditAccountBinding(@NonNull ConstraintLayout rootView, @NonNull Button SaveBtn,
      @NonNull ImageView backBtn, @NonNull EditText dobEditText, @NonNull EditText fnameEditText,
      @NonNull EditText lnameEditText, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.SaveBtn = SaveBtn;
    this.backBtn = backBtn;
    this.dobEditText = dobEditText;
    this.fnameEditText = fnameEditText;
    this.lnameEditText = lnameEditText;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityEditAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityEditAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_edit_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityEditAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.Save_Btn;
      Button SaveBtn = ViewBindings.findChildViewById(rootView, id);
      if (SaveBtn == null) {
        break missingId;
      }

      id = R.id.back_btn;
      ImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.dobEditText;
      EditText dobEditText = ViewBindings.findChildViewById(rootView, id);
      if (dobEditText == null) {
        break missingId;
      }

      id = R.id.fnameEditText;
      EditText fnameEditText = ViewBindings.findChildViewById(rootView, id);
      if (fnameEditText == null) {
        break missingId;
      }

      id = R.id.lnameEditText;
      EditText lnameEditText = ViewBindings.findChildViewById(rootView, id);
      if (lnameEditText == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityEditAccountBinding((ConstraintLayout) rootView, SaveBtn, backBtn,
          dobEditText, fnameEditText, lnameEditText, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}