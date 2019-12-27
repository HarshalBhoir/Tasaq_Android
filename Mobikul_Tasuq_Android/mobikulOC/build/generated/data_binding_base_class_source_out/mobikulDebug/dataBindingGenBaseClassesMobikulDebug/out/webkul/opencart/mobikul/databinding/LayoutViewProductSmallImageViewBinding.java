package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public abstract class LayoutViewProductSmallImageViewBinding extends ViewDataBinding {
  @NonNull
  public final ImageView smallimageButton;

  protected LayoutViewProductSmallImageViewBinding(DataBindingComponent _bindingComponent,
      View _root, int _localFieldCount, ImageView smallimageButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.smallimageButton = smallimageButton;
  }

  @NonNull
  public static LayoutViewProductSmallImageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutViewProductSmallImageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutViewProductSmallImageViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.layout_view_product_small_image_view, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutViewProductSmallImageViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutViewProductSmallImageViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutViewProductSmallImageViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.layout_view_product_small_image_view, null, false, component);
  }

  public static LayoutViewProductSmallImageViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutViewProductSmallImageViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutViewProductSmallImageViewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.layout_view_product_small_image_view);
  }
}
