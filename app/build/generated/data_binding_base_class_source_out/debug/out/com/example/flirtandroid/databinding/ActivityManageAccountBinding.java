// Generated by view binder compiler. Do not edit!
package com.example.flirtandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
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

public final class ActivityManageAccountBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final LinearLayout delelteAcc;

  @NonNull
  public final LinearLayout forgetMeBtn;

  @NonNull
  public final LinearLayout logoutBtn;

  @NonNull
  public final LinearLayout rememberMeBtn;

  @NonNull
  public final Toolbar toolbar;

  private ActivityManageAccountBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView backBtn, @NonNull LinearLayout delelteAcc,
      @NonNull LinearLayout forgetMeBtn, @NonNull LinearLayout logoutBtn,
      @NonNull LinearLayout rememberMeBtn, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.delelteAcc = delelteAcc;
    this.forgetMeBtn = forgetMeBtn;
    this.logoutBtn = logoutBtn;
    this.rememberMeBtn = rememberMeBtn;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityManageAccountBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityManageAccountBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_manage_account, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityManageAccountBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      ImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.delelte_acc;
      LinearLayout delelteAcc = ViewBindings.findChildViewById(rootView, id);
      if (delelteAcc == null) {
        break missingId;
      }

      id = R.id.forget_me_btn;
      LinearLayout forgetMeBtn = ViewBindings.findChildViewById(rootView, id);
      if (forgetMeBtn == null) {
        break missingId;
      }

      id = R.id.logout_btn;
      LinearLayout logoutBtn = ViewBindings.findChildViewById(rootView, id);
      if (logoutBtn == null) {
        break missingId;
      }

      id = R.id.remember_me_btn;
      LinearLayout rememberMeBtn = ViewBindings.findChildViewById(rootView, id);
      if (rememberMeBtn == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new ActivityManageAccountBinding((ConstraintLayout) rootView, backBtn, delelteAcc,
          forgetMeBtn, logoutBtn, rememberMeBtn, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
