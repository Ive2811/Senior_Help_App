// Generated by data binding compiler. Do not edit!
package com.example.proyectois.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.proyectois.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityAyudaBinding extends ViewDataBinding {
  @NonNull
  public final ImageButton imgbtnAyuConsejo1;

  @NonNull
  public final ImageButton imgbtnAyuConsejo2;

  @NonNull
  public final ImageButton imgbtnAyuConsejo3;

  @NonNull
  public final ImageButton imgbtnAyuHome;

  @NonNull
  public final TextView txtAyuConsejo1;

  @NonNull
  public final TextView txtAyuConsejo2;

  @NonNull
  public final TextView txtAyuConsejo3;

  @NonNull
  public final TextView txtAyuTitle;

  protected ActivityAyudaBinding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton imgbtnAyuConsejo1, ImageButton imgbtnAyuConsejo2, ImageButton imgbtnAyuConsejo3,
      ImageButton imgbtnAyuHome, TextView txtAyuConsejo1, TextView txtAyuConsejo2,
      TextView txtAyuConsejo3, TextView txtAyuTitle) {
    super(_bindingComponent, _root, _localFieldCount);
    this.imgbtnAyuConsejo1 = imgbtnAyuConsejo1;
    this.imgbtnAyuConsejo2 = imgbtnAyuConsejo2;
    this.imgbtnAyuConsejo3 = imgbtnAyuConsejo3;
    this.imgbtnAyuHome = imgbtnAyuHome;
    this.txtAyuConsejo1 = txtAyuConsejo1;
    this.txtAyuConsejo2 = txtAyuConsejo2;
    this.txtAyuConsejo3 = txtAyuConsejo3;
    this.txtAyuTitle = txtAyuTitle;
  }

  @NonNull
  public static ActivityAyudaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_ayuda, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAyudaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityAyudaBinding>inflateInternal(inflater, R.layout.activity_ayuda, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityAyudaBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_ayuda, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityAyudaBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityAyudaBinding>inflateInternal(inflater, R.layout.activity_ayuda, null, false, component);
  }

  public static ActivityAyudaBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityAyudaBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityAyudaBinding)bind(component, view, R.layout.activity_ayuda);
  }
}