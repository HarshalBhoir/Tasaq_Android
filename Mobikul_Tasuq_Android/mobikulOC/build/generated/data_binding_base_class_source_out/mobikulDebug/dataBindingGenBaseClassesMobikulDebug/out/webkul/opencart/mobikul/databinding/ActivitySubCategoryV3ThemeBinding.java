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

public abstract class ActivitySubCategoryV3ThemeBinding extends ViewDataBinding {
  @NonNull
  public final RecyclerView subcategoryV3Recylcer;

  protected ActivitySubCategoryV3ThemeBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, RecyclerView subcategoryV3Recylcer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.subcategoryV3Recylcer = subcategoryV3Recylcer;
  }

  @NonNull
  public static ActivitySubCategoryV3ThemeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySubCategoryV3ThemeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySubCategoryV3ThemeBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_sub_category_v3_theme, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySubCategoryV3ThemeBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySubCategoryV3ThemeBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySubCategoryV3ThemeBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_sub_category_v3_theme, null, false, component);
  }

  public static ActivitySubCategoryV3ThemeBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivitySubCategoryV3ThemeBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySubCategoryV3ThemeBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_sub_category_v3_theme);
  }
}
