// Generated by view binder compiler. Do not edit!
package com.example.listapplication.databinding;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.FloatingActionButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.viewbinding.ViewBinding;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ScrollView;
import com.example.listapplication.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final AppBarLayout appBarLayout;

  @NonNull
  public final Button button;

  @NonNull
  public final Button button2;

  @NonNull
  public final Button button3;

  @NonNull
  public final Button button4;

  @NonNull
  public final ConstraintLayout coordinatorLayout;

  @NonNull
  public final View divider;

  @NonNull
  public final View divider2;

  @NonNull
  public final EditText editText;

  @NonNull
  public final EditText editText2;

  @NonNull
  public final EditText editTextTextPersonName2;

  @NonNull
  public final FloatingActionButton fab;

  @NonNull
  public final ListView listView;

  @NonNull
  public final ScrollView scrollView2;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView,
      @NonNull AppBarLayout appBarLayout, @NonNull Button button, @NonNull Button button2,
      @NonNull Button button3, @NonNull Button button4, @NonNull ConstraintLayout coordinatorLayout,
      @NonNull View divider, @NonNull View divider2, @NonNull EditText editText,
      @NonNull EditText editText2, @NonNull EditText editTextTextPersonName2,
      @NonNull FloatingActionButton fab, @NonNull ListView listView,
      @NonNull ScrollView scrollView2) {
    this.rootView = rootView;
    this.appBarLayout = appBarLayout;
    this.button = button;
    this.button2 = button2;
    this.button3 = button3;
    this.button4 = button4;
    this.coordinatorLayout = coordinatorLayout;
    this.divider = divider;
    this.divider2 = divider2;
    this.editText = editText;
    this.editText2 = editText2;
    this.editTextTextPersonName2 = editTextTextPersonName2;
    this.fab = fab;
    this.listView = listView;
    this.scrollView2 = scrollView2;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.appBarLayout;
      AppBarLayout appBarLayout = rootView.findViewById(id);
      if (appBarLayout == null) {
        break missingId;
      }

      id = R.id.button;
      Button button = rootView.findViewById(id);
      if (button == null) {
        break missingId;
      }

      id = R.id.button2;
      Button button2 = rootView.findViewById(id);
      if (button2 == null) {
        break missingId;
      }

      id = R.id.button3;
      Button button3 = rootView.findViewById(id);
      if (button3 == null) {
        break missingId;
      }

      id = R.id.button4;
      Button button4 = rootView.findViewById(id);
      if (button4 == null) {
        break missingId;
      }

      ConstraintLayout coordinatorLayout = (ConstraintLayout) rootView;

      id = R.id.divider;
      View divider = rootView.findViewById(id);
      if (divider == null) {
        break missingId;
      }

      id = R.id.divider2;
      View divider2 = rootView.findViewById(id);
      if (divider2 == null) {
        break missingId;
      }

      id = R.id.editText;
      EditText editText = rootView.findViewById(id);
      if (editText == null) {
        break missingId;
      }

      id = R.id.editText2;
      EditText editText2 = rootView.findViewById(id);
      if (editText2 == null) {
        break missingId;
      }

      id = R.id.editTextTextPersonName2;
      EditText editTextTextPersonName2 = rootView.findViewById(id);
      if (editTextTextPersonName2 == null) {
        break missingId;
      }

      id = R.id.fab;
      FloatingActionButton fab = rootView.findViewById(id);
      if (fab == null) {
        break missingId;
      }

      id = R.id.listView;
      ListView listView = rootView.findViewById(id);
      if (listView == null) {
        break missingId;
      }

      id = R.id.scrollView2;
      ScrollView scrollView2 = rootView.findViewById(id);
      if (scrollView2 == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, appBarLayout, button, button2,
          button3, button4, coordinatorLayout, divider, divider2, editText, editText2,
          editTextTextPersonName2, fab, listView, scrollView2);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}