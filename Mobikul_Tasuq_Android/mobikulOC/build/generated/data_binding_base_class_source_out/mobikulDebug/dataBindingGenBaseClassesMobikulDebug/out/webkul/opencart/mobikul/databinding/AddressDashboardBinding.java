package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public abstract class AddressDashboardBinding extends ViewDataBinding {
  @NonNull
  public final TextView addrbookdefaultValue;

  @NonNull
  public final Button deleteBtn;

  @NonNull
  public final Button editBtn;

  protected AddressDashboardBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView addrbookdefaultValue, Button deleteBtn, Button editBtn) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addrbookdefaultValue = addrbookdefaultValue;
    this.deleteBtn = deleteBtn;
    this.editBtn = editBtn;
  }

  @NonNull
  public static AddressDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AddressDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AddressDashboardBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.address_dashboard, root, attachToRoot, component);
  }

  @NonNull
  public static AddressDashboardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static AddressDashboardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<AddressDashboardBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.address_dashboard, null, false, component);
  }

  public static AddressDashboardBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static AddressDashboardBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (AddressDashboardBinding)bind(component, view, webkul.opencart.mobikul.R.layout.address_dashboard);
  }
}
