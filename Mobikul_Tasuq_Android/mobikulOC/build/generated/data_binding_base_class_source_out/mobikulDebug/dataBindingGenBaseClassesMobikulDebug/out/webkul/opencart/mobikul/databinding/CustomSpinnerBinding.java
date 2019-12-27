package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Spinner;

public abstract class CustomSpinnerBinding extends ViewDataBinding {
  @NonNull
  public final Spinner customSpinner;

  protected CustomSpinnerBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Spinner customSpinner) {
    super(_bindingComponent, _root, _localFieldCount);
    this.customSpinner = customSpinner;
  }

  @NonNull
  public static CustomSpinnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomSpinnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomSpinnerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_spinner, root, attachToRoot, component);
  }

  @NonNull
  public static CustomSpinnerBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomSpinnerBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomSpinnerBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_spinner, null, false, component);
  }

  public static CustomSpinnerBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CustomSpinnerBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CustomSpinnerBinding)bind(component, view, webkul.opencart.mobikul.R.layout.custom_spinner);
  }
}
