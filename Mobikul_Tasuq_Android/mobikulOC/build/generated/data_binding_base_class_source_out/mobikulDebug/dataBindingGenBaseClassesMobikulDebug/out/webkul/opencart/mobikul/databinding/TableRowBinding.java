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

public abstract class TableRowBinding extends ViewDataBinding {
  @NonNull
  public final TextView heading;

  @NonNull
  public final TextView value;

  protected TableRowBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView heading, TextView value) {
    super(_bindingComponent, _root, _localFieldCount);
    this.heading = heading;
    this.value = value;
  }

  @NonNull
  public static TableRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static TableRowBinding inflate(@NonNull LayoutInflater inflater, @Nullable ViewGroup root,
      boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<TableRowBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.table_row, root, attachToRoot, component);
  }

  @NonNull
  public static TableRowBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static TableRowBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<TableRowBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.table_row, null, false, component);
  }

  public static TableRowBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static TableRowBinding bind(@NonNull View view, @Nullable DataBindingComponent component) {
    return (TableRowBinding)bind(component, view, webkul.opencart.mobikul.R.layout.table_row);
  }
}
