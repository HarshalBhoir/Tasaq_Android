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
import android.widget.ImageView;
import android.widget.LinearLayout;

public abstract class CategoryFilterBinding extends ViewDataBinding {
  @NonNull
  public final Button apply;

  @NonNull
  public final LinearLayout bottomLayout;

  @NonNull
  public final ImageView cancel;

  @NonNull
  public final Button close;

  @NonNull
  public final LinearLayout filterContainer;

  protected CategoryFilterBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button apply, LinearLayout bottomLayout, ImageView cancel, Button close,
      LinearLayout filterContainer) {
    super(_bindingComponent, _root, _localFieldCount);
    this.apply = apply;
    this.bottomLayout = bottomLayout;
    this.cancel = cancel;
    this.close = close;
    this.filterContainer = filterContainer;
  }

  @NonNull
  public static CategoryFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CategoryFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CategoryFilterBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.category_filter, root, attachToRoot, component);
  }

  @NonNull
  public static CategoryFilterBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CategoryFilterBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CategoryFilterBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.category_filter, null, false, component);
  }

  public static CategoryFilterBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CategoryFilterBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CategoryFilterBinding)bind(component, view, webkul.opencart.mobikul.R.layout.category_filter);
  }
}
