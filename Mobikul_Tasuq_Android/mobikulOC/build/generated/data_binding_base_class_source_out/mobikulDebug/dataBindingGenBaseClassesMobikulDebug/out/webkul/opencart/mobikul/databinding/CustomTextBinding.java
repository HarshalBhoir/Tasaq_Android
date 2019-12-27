package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.TextInputLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import webkul.opencart.mobikul.model.registerModel.CustomField;

public abstract class CustomTextBinding extends ViewDataBinding {
  @NonNull
  public final EditText etField;

  @NonNull
  public final TextInputLayout etLebal;

  @NonNull
  public final TextView tvReq;

  @Bindable
  protected CustomField mData;

  protected CustomTextBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, EditText etField, TextInputLayout etLebal, TextView tvReq) {
    super(_bindingComponent, _root, _localFieldCount);
    this.etField = etField;
    this.etLebal = etLebal;
    this.tvReq = tvReq;
  }

  public abstract void setData(@Nullable CustomField data);

  @Nullable
  public CustomField getData() {
    return mData;
  }

  @NonNull
  public static CustomTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomTextBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_text, root, attachToRoot, component);
  }

  @NonNull
  public static CustomTextBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomTextBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomTextBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_text, null, false, component);
  }

  public static CustomTextBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CustomTextBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CustomTextBinding)bind(component, view, webkul.opencart.mobikul.R.layout.custom_text);
  }
}
