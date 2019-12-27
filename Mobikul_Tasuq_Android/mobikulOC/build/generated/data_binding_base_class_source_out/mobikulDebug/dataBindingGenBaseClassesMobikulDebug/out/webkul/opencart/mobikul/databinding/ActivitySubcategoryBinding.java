package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;

public abstract class ActivitySubcategoryBinding extends ViewDataBinding {
  @NonNull
  public final ImageView catImage;

  @NonNull
  public final FrameLayout container;

  @NonNull
  public final View toolbar;

  protected ActivitySubcategoryBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView catImage, FrameLayout container, View toolbar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.catImage = catImage;
    this.container = container;
    this.toolbar = toolbar;
  }

  @NonNull
  public static ActivitySubcategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySubcategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySubcategoryBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_subcategory, root, attachToRoot, component);
  }

  @NonNull
  public static ActivitySubcategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ActivitySubcategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ActivitySubcategoryBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.activity_subcategory, null, false, component);
  }

  public static ActivitySubcategoryBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ActivitySubcategoryBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ActivitySubcategoryBinding)bind(component, view, webkul.opencart.mobikul.R.layout.activity_subcategory);
  }
}
