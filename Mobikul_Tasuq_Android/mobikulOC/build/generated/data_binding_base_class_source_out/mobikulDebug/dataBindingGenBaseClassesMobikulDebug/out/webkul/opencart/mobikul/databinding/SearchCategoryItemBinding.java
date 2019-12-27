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
import android.widget.TextView;
import webkul.opencart.mobikul.adapterModel.RightNavAdapterModel;
import webkul.opencart.mobikul.handlers.LeftNavHandlers;

public abstract class SearchCategoryItemBinding extends ViewDataBinding {
  @NonNull
  public final TextView textLabel;

  @Bindable
  protected RightNavAdapterModel mData;

  @Bindable
  protected LeftNavHandlers mHandler;

  protected SearchCategoryItemBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView textLabel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.textLabel = textLabel;
  }

  public abstract void setData(@Nullable RightNavAdapterModel data);

  @Nullable
  public RightNavAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable LeftNavHandlers handler);

  @Nullable
  public LeftNavHandlers getHandler() {
    return mHandler;
  }

  @NonNull
  public static SearchCategoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchCategoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchCategoryItemBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_category_item, root, attachToRoot, component);
  }

  @NonNull
  public static SearchCategoryItemBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SearchCategoryItemBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SearchCategoryItemBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.search_category_item, null, false, component);
  }

  public static SearchCategoryItemBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SearchCategoryItemBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SearchCategoryItemBinding)bind(component, view, webkul.opencart.mobikul.R.layout.search_category_item);
  }
}
