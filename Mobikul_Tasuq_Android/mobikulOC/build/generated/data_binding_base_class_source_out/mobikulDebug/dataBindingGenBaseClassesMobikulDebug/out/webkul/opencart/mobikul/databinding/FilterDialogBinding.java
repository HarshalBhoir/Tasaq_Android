package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public abstract class FilterDialogBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView filterRecyclerview;

  protected FilterDialogBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView filterRecyclerview) {
    super(_bindingComponent, _root, _localFieldCount);
    this.filterRecyclerview = filterRecyclerview;
  }

  @NonNull
  public static FilterDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FilterDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FilterDialogBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.filter_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static FilterDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FilterDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FilterDialogBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.filter_dialog, null, false, component);
  }

  public static FilterDialogBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FilterDialogBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FilterDialogBinding)bind(component, view, webkul.opencart.mobikul.R.layout.filter_dialog);
  }
}
