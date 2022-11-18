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
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMain2Binding extends ViewDataBinding {
  @NonNull
  public final ImageButton btnSiGoogle;

  @NonNull
  public final Button btnSiSignin;

  @NonNull
  public final TextInputLayout edtSiContra;

  @NonNull
  public final TextInputEditText edtSiContra1;

  @NonNull
  public final TextInputLayout edtSiCorreo;

  @NonNull
  public final TextInputEditText edtSiCorreo1;

  @NonNull
  public final TextInputEditText edtSiName1;

  @NonNull
  public final TextInputLayout edtSiNombre;

  @NonNull
  public final TextInputLayout edtSiRepeat;

  @NonNull
  public final TextInputEditText edtSiRepeat1;

  @NonNull
  public final TextView txtSiCuenta;

  @NonNull
  public final TextView txtSiGoogle;

  @NonNull
  public final TextView txtSiRegistro;

  @NonNull
  public final TextView txtSiSignin;

  protected ActivityMain2Binding(Object _bindingComponent, View _root, int _localFieldCount,
      ImageButton btnSiGoogle, Button btnSiSignin, TextInputLayout edtSiContra,
      TextInputEditText edtSiContra1, TextInputLayout edtSiCorreo, TextInputEditText edtSiCorreo1,
      TextInputEditText edtSiName1, TextInputLayout edtSiNombre, TextInputLayout edtSiRepeat,
      TextInputEditText edtSiRepeat1, TextView txtSiCuenta, TextView txtSiGoogle,
      TextView txtSiRegistro, TextView txtSiSignin) {
    super(_bindingComponent, _root, _localFieldCount);
    this.btnSiGoogle = btnSiGoogle;
    this.btnSiSignin = btnSiSignin;
    this.edtSiContra = edtSiContra;
    this.edtSiContra1 = edtSiContra1;
    this.edtSiCorreo = edtSiCorreo;
    this.edtSiCorreo1 = edtSiCorreo1;
    this.edtSiName1 = edtSiName1;
    this.edtSiNombre = edtSiNombre;
    this.edtSiRepeat = edtSiRepeat;
    this.edtSiRepeat1 = edtSiRepeat1;
    this.txtSiCuenta = txtSiCuenta;
    this.txtSiGoogle = txtSiGoogle;
    this.txtSiRegistro = txtSiRegistro;
    this.txtSiSignin = txtSiSignin;
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main2, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMain2Binding>inflateInternal(inflater, R.layout.activity_main2, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_main2, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMain2Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMain2Binding>inflateInternal(inflater, R.layout.activity_main2, null, false, component);
  }

  public static ActivityMain2Binding bind(@NonNull View view) {
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
  public static ActivityMain2Binding bind(@NonNull View view, @Nullable Object component) {
    return (ActivityMain2Binding)bind(component, view, R.layout.activity_main2);
  }
}