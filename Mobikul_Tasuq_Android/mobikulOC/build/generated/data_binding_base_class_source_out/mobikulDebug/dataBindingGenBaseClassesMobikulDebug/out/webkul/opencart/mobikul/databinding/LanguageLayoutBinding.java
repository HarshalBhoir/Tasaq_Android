package webkul.opencart.mobikul.databinding;

import android.databinding.Bindable;
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
import webkul.opencart.mobikul.adapterModel.LanguageAdapterModel;
import webkul.opencart.mobikul.handlers.LanguageHandler;

public abstract class LanguageLayoutBinding extends ViewDataBinding {
  @NonNull
  public final TextView categoryName;

  @NonNull
  public final LinearLayout rightNavLl;

  @Bindable
  protected LanguageAdapterModel mData;

  @Bindable
  protected LanguageHandler mHandler;

  protected LanguageLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView categoryName, LinearLayout rightNavLl) {
    super(_bindingComponent, _root, _localFieldCount);
    this.categoryName = categoryName;
    this.rightNavLl = rightNavLl;
  }

  public abstract void setData(@Nullable LanguageAdapterModel data);

  @Nullable
  public LanguageAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable LanguageHandler handler);

  @Nullable
  public LanguageHandler getHandler() {
    return mHandler;
  }

  @NonNull
  public static LanguageLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LanguageLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LanguageLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.language_layout, root, attachToRoot, component);
  }

  @NonNull
  public static LanguageLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LanguageLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LanguageLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.language_layout, null, false, component);
  }

  public static LanguageLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LanguageLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LanguageLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.language_layout);
  }
}
