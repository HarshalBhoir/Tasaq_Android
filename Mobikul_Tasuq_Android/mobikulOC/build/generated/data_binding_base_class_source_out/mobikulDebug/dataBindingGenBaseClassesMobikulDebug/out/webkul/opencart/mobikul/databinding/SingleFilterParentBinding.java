package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public abstract class SingleFilterParentBinding extends ViewDataBinding {
  @NonNull
  public final ImageView filterDropDown;

  @NonNull
  public final TextView filterName;

  protected SingleFilterParentBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView filterDropDown, TextView filterName) {
    super(_bindingComponent, _root, _localFieldCount);
    this.filterDropDown = filterDropDown;
    this.filterName = filterName;
  }

  @NonNull
  public static SingleFilterParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SingleFilterParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SingleFilterParentBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.single_filter_parent, root, attachToRoot, component);
  }

  @NonNull
  public static SingleFilterParentBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SingleFilterParentBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SingleFilterParentBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.single_filter_parent, null, false, component);
  }

  public static SingleFilterParentBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SingleFilterParentBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SingleFilterParentBinding)bind(component, view, webkul.opencart.mobikul.R.layout.single_filter_parent);
  }
}
