package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class CustomToastBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout customToastLayout;

  @NonNull
  public final TextView toastTxt;

  protected CustomToastBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout customToastLayout, TextView toastTxt) {
    super(_bindingComponent, _root, _localFieldCount);
    this.customToastLayout = customToastLayout;
    this.toastTxt = toastTxt;
  }

  @NonNull
  public static CustomToastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomToastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomToastBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_toast, root, attachToRoot, component);
  }

  @NonNull
  public static CustomToastBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomToastBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomToastBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_toast, null, false, component);
  }

  public static CustomToastBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CustomToastBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CustomToastBinding)bind(component, view, webkul.opencart.mobikul.R.layout.custom_toast);
  }
}
