// Generated by view binder compiler. Do not edit!
package com.example.flirtandroid.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
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

public final class FragmentNotificationsBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageView backBtn;

  @NonNull
  public final LinearLayout editAccount;

  @NonNull
  public final LinearLayout manageAccBtn;

  @NonNull
  public final LinearLayout privacyBtn;

  @NonNull
  public final LinearLayout subcriptionBtn;

  @NonNull
  public final TextView titleLName;

  @NonNull
  public final TextView titleName;

  @NonNull
  public final Toolbar toolbar;

  private FragmentNotificationsBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageView backBtn, @NonNull LinearLayout editAccount,
      @NonNull LinearLayout manageAccBtn, @NonNull LinearLayout privacyBtn,
      @NonNull LinearLayout subcriptionBtn, @NonNull TextView titleLName,
      @NonNull TextView titleName, @NonNull Toolbar toolbar) {
    this.rootView = rootView;
    this.backBtn = backBtn;
    this.editAccount = editAccount;
    this.manageAccBtn = manageAccBtn;
    this.privacyBtn = privacyBtn;
    this.subcriptionBtn = subcriptionBtn;
    this.titleLName = titleLName;
    this.titleName = titleName;
    this.toolbar = toolbar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentNotificationsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_notifications, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentNotificationsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back_btn;
      ImageView backBtn = ViewBindings.findChildViewById(rootView, id);
      if (backBtn == null) {
        break missingId;
      }

      id = R.id.edit_account;
      LinearLayout editAccount = ViewBindings.findChildViewById(rootView, id);
      if (editAccount == null) {
        break missingId;
      }

      id = R.id.manage_acc_btn;
      LinearLayout manageAccBtn = ViewBindings.findChildViewById(rootView, id);
      if (manageAccBtn == null) {
        break missingId;
      }

      id = R.id.privacy_btn;
      LinearLayout privacyBtn = ViewBindings.findChildViewById(rootView, id);
      if (privacyBtn == null) {
        break missingId;
      }

      id = R.id.subcription_btn;
      LinearLayout subcriptionBtn = ViewBindings.findChildViewById(rootView, id);
      if (subcriptionBtn == null) {
        break missingId;
      }

      id = R.id.title_l_name;
      TextView titleLName = ViewBindings.findChildViewById(rootView, id);
      if (titleLName == null) {
        break missingId;
      }

      id = R.id.title_name;
      TextView titleName = ViewBindings.findChildViewById(rootView, id);
      if (titleName == null) {
        break missingId;
      }

      id = R.id.toolbar;
      Toolbar toolbar = ViewBindings.findChildViewById(rootView, id);
      if (toolbar == null) {
        break missingId;
      }

      return new FragmentNotificationsBinding((ConstraintLayout) rootView, backBtn, editAccount,
          manageAccBtn, privacyBtn, subcriptionBtn, titleLName, titleName, toolbar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
