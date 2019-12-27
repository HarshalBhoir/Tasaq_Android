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
import android.widget.ImageView;
import webkul.opencart.mobikul.adapterModel.SubCategoryV3ThemeAdapterModel;
import webkul.opencart.mobikul.handlers.SubCategoryV3Handler;

public abstract class SubcategoryV3themeLayoutBinding extends ViewDataBinding {
  @NonNull
  public final ImageView image;

  @Bindable
  protected SubCategoryV3ThemeAdapterModel mData;

  @Bindable
  protected SubCategoryV3Handler mHandler;

  protected SubcategoryV3themeLayoutBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView image) {
    super(_bindingComponent, _root, _localFieldCount);
    this.image = image;
  }

  public abstract void setData(@Nullable SubCategoryV3ThemeAdapterModel data);

  @Nullable
  public SubCategoryV3ThemeAdapterModel getData() {
    return mData;
  }

  public abstract void setHandler(@Nullable SubCategoryV3Handler handler);

  @Nullable
  public SubCategoryV3Handler getHandler() {
    return mHandler;
  }

  @NonNull
  public static SubcategoryV3themeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubcategoryV3themeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubcategoryV3themeLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.subcategory_v3theme_layout, root, attachToRoot, component);
  }

  @NonNull
  public static SubcategoryV3themeLayoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SubcategoryV3themeLayoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SubcategoryV3themeLayoutBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.subcategory_v3theme_layout, null, false, component);
  }

  public static SubcategoryV3themeLayoutBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SubcategoryV3themeLayoutBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SubcategoryV3themeLayoutBinding)bind(component, view, webkul.opencart.mobikul.R.layout.subcategory_v3theme_layout);
  }
}
