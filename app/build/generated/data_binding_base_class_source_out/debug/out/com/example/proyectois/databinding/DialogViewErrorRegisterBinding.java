// Generated by view binder compiler. Do not edit!
package com.example.proyectois.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.proyectois.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DialogViewErrorRegisterBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button btnOk3;

  @NonNull
  public final ImageView imageView3;

  @NonNull
  public final TextView txtText3;

  @NonNull
  public final TextView txtTitle3;

  private DialogViewErrorRegisterBinding(@NonNull ConstraintLayout rootView, @NonNull Button btnOk3,
      @NonNull ImageView imageView3, @NonNull TextView txtText3, @NonNull TextView txtTitle3) {
    this.rootView = rootView;
    this.btnOk3 = btnOk3;
    this.imageView3 = imageView3;
    this.txtText3 = txtText3;
    this.txtTitle3 = txtTitle3;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DialogViewErrorRegisterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DialogViewErrorRegisterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.dialog_view_error_register, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DialogViewErrorRegisterBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_ok3;
      Button btnOk3 = ViewBindings.findChildViewById(rootView, id);
      if (btnOk3 == null) {
        break missingId;
      }

      id = R.id.imageView3;
      ImageView imageView3 = ViewBindings.findChildViewById(rootView, id);
      if (imageView3 == null) {
        break missingId;
      }

      id = R.id.txt_Text3;
      TextView txtText3 = ViewBindings.findChildViewById(rootView, id);
      if (txtText3 == null) {
        break missingId;
      }

      id = R.id.txt_Title3;
      TextView txtTitle3 = ViewBindings.findChildViewById(rootView, id);
      if (txtTitle3 == null) {
        break missingId;
      }

      return new DialogViewErrorRegisterBinding((ConstraintLayout) rootView, btnOk3, imageView3,
          txtText3, txtTitle3);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
