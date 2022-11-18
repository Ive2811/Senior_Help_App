// Generated by data binding compiler. Do not edit!
package com.example.proyectois.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.proyectois.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityPreguntasBinding extends ViewDataBinding {
  @NonNull
  public final Button btnRespuesta1;

  @NonNull
  public final Button btnRespuesta2;

  @NonNull
  public final Button btnRespuesta3;

  @NonNull
  public final ImageButton imgbtnPreHome;

  @NonNull
  public final TextView txtPreTitle;

  @NonNull
  public final TextView txtPregunta1;

  @NonNull
  public final TextView txtPregunta2;

  @NonNull
  public final TextView txtPregunta3;

  @NonNull
  public final TextView txtRespuesta;

  @NonNull
  public final TextView txtRespuesta2;

  @NonNull
  public final TextView txtRespuesta3;

  protected ActivityPreguntasBinding(Object _bindingComponent, View _root, int _localFieldCount,
      Button btnRespuesta1, Button btnRespuesta2, Button btnRespuesta3, ImageButton imgbtnPreHome,
      TextView txtPreTitle, TextView txtPregunta1, TextView txtPregunta2, TextView txtPregunta3,
      TextView txtRespuesta, TextView txtRespuesta2, TextView txtRespuesta3) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnRespuesta1 = btnRespuesta1;
    this.btnRespuesta2 = btnRespuesta2;
    this.btnRespuesta3 = btnRespuesta3;
    this.imgbtnPreHome = imgbtnPreHome;
    this.txtPreTitle = txtPreTitle;
    this.txtPregunta1 = txtPregunta1;
    this.txtPregunta2 = txtPregunta2;
    this.txtPregunta3 = txtPregunta3;
    this.txtRespuesta = txtRespuesta;
    this.txtRespuesta2 = txtRespuesta2;
    this.txtRespuesta3 = txtRespuesta3;
  }

  @NonNull
  public static ActivityPreguntasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_preguntas, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPreguntasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityPreguntasBinding>inflateInternal(inflater, R.layout.activity_preguntas, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityPreguntasBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_preguntas, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityPreguntasBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityPreguntasBinding>inflateInternal(inflater, R.layout.activity_preguntas, null, false, component);
  }

  public static ActivityPreguntasBinding bind(@NonNull View view) {
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
  public static ActivityPreguntasBinding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityPreguntasBinding)bind(component, view, R.layout.activity_preguntas);
  }
}
