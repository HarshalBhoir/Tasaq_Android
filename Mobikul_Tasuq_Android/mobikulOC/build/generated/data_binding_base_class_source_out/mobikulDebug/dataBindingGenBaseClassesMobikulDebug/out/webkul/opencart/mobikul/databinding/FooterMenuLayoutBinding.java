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

public abstract class FooterMenuLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView code;

  @NonNull
  public final TextView title;

  protected FooterMenuLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView code, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.code = code;
    this.title = title;
  }

  @NonNull
  public static FooterMenuLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FooterMenuLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FooterMenuLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.footer_menu_layout, root, attachToRoot, component);
  }

  @NonNull
  public static FooterMenuLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FooterMenuLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FooterMenuLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.footer_menu_layout, null, false, component);
  }

  public static FooterMenuLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FooterMenuLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FooterMenuLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.footer_menu_layout);
  }
}
