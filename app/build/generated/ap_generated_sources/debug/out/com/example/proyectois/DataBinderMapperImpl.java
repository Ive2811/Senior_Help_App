package com.example.proyectois;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.example.proyectois.databinding.ActivityApartadosBindingImpl;
import com.example.proyectois.databinding.ActivityAyudaBindingImpl;
import com.example.proyectois.databinding.ActivityCapacitacionBindingImpl;
import com.example.proyectois.databinding.ActivityMain2BindingImpl;
import com.example.proyectois.databinding.ActivityMain3BindingImpl;
import com.example.proyectois.databinding.ActivityMainBindingImpl;
import com.example.proyectois.databinding.ActivityPreguntasBindingImpl;
import com.example.proyectois.databinding.ActivityPrimerosPasosBindingImpl;
import com.example.proyectois.databinding.ActivityRecordatoriosBindingImpl;
import com.example.proyectois.databinding.ActivityResetPasswordBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYAPARTADOS = 1;

  private static final int LAYOUT_ACTIVITYAYUDA = 2;

  private static final int LAYOUT_ACTIVITYCAPACITACION = 3;

  private static final int LAYOUT_ACTIVITYMAIN = 4;

  private static final int LAYOUT_ACTIVITYMAIN2 = 5;

  private static final int LAYOUT_ACTIVITYMAIN3 = 6;

  private static final int LAYOUT_ACTIVITYPREGUNTAS = 7;

  private static final int LAYOUT_ACTIVITYPRIMEROSPASOS = 8;

  private static final int LAYOUT_ACTIVITYRECORDATORIOS = 9;

  private static final int LAYOUT_ACTIVITYRESETPASSWORD = 10;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(10);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_apartados, LAYOUT_ACTIVITYAPARTADOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_ayuda, LAYOUT_ACTIVITYAYUDA);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_capacitacion, LAYOUT_ACTIVITYCAPACITACION);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_main2, LAYOUT_ACTIVITYMAIN2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_main3, LAYOUT_ACTIVITYMAIN3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_preguntas, LAYOUT_ACTIVITYPREGUNTAS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_primeros_pasos, LAYOUT_ACTIVITYPRIMEROSPASOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_recordatorios, LAYOUT_ACTIVITYRECORDATORIOS);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.example.proyectois.R.layout.activity_reset_password, LAYOUT_ACTIVITYRESETPASSWORD);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYAPARTADOS: {
          if ("layout/activity_apartados_0".equals(tag)) {
            return new ActivityApartadosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_apartados is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYAYUDA: {
          if ("layout/activity_ayuda_0".equals(tag)) {
            return new ActivityAyudaBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_ayuda is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYCAPACITACION: {
          if ("layout/activity_capacitacion_0".equals(tag)) {
            return new ActivityCapacitacionBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_capacitacion is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN2: {
          if ("layout/activity_main2_0".equals(tag)) {
            return new ActivityMain2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main2 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYMAIN3: {
          if ("layout/activity_main3_0".equals(tag)) {
            return new ActivityMain3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main3 is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPREGUNTAS: {
          if ("layout/activity_preguntas_0".equals(tag)) {
            return new ActivityPreguntasBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_preguntas is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYPRIMEROSPASOS: {
          if ("layout/activity_primeros_pasos_0".equals(tag)) {
            return new ActivityPrimerosPasosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_primeros_pasos is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRECORDATORIOS: {
          if ("layout/activity_recordatorios_0".equals(tag)) {
            return new ActivityRecordatoriosBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_recordatorios is invalid. Received: " + tag);
        }
        case  LAYOUT_ACTIVITYRESETPASSWORD: {
          if ("layout/activity_reset_password_0".equals(tag)) {
            return new ActivityResetPasswordBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_reset_password is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(1);

    static {
      sKeys.put(0, "_all");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(10);

    static {
      sKeys.put("layout/activity_apartados_0", com.example.proyectois.R.layout.activity_apartados);
      sKeys.put("layout/activity_ayuda_0", com.example.proyectois.R.layout.activity_ayuda);
      sKeys.put("layout/activity_capacitacion_0", com.example.proyectois.R.layout.activity_capacitacion);
      sKeys.put("layout/activity_main_0", com.example.proyectois.R.layout.activity_main);
      sKeys.put("layout/activity_main2_0", com.example.proyectois.R.layout.activity_main2);
      sKeys.put("layout/activity_main3_0", com.example.proyectois.R.layout.activity_main3);
      sKeys.put("layout/activity_preguntas_0", com.example.proyectois.R.layout.activity_preguntas);
      sKeys.put("layout/activity_primeros_pasos_0", com.example.proyectois.R.layout.activity_primeros_pasos);
      sKeys.put("layout/activity_recordatorios_0", com.example.proyectois.R.layout.activity_recordatorios);
      sKeys.put("layout/activity_reset_password_0", com.example.proyectois.R.layout.activity_reset_password);
    }
  }
}
