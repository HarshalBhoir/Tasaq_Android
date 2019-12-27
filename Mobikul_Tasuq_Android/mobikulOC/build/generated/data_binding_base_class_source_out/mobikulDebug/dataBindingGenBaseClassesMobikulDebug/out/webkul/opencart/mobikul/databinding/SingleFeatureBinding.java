package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public abstract class SingleFeatureBinding extends ViewDataBinding {
  @NonNull
  public final TextView name;

  @NonNull
  public final TextView text;

  protected SingleFeatureBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView name, TextView text) {
    super(_bindingComponent, _root, _localFieldCount);
    this.name = name;
    this.text = text;
  }

  @NonNull
  public static SingleFeatureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SingleFeatureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SingleFeatureBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.single_feature, root, attachToRoot, component);
  }

  @NonNull
  public static SingleFeatureBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SingleFeatureBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SingleFeatureBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.single_feature, null, false, component);
  }

  public static SingleFeatureBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SingleFeatureBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SingleFeatureBinding)bind(component, view, webkul.opencart.mobikul.R.layout.single_feature);
  }
}
