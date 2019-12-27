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
import android.widget.TextView;

public abstract class CustomOptionFileViewBinding extends ViewDataBinding {
  @NonNull
  public final ImageView browseButton;

  @NonNull
  public final TextView fileSelectedTV;

  protected CustomOptionFileViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView browseButton, TextView fileSelectedTV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.browseButton = browseButton;
    this.fileSelectedTV = fileSelectedTV;
  }

  @NonNull
  public static CustomOptionFileViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomOptionFileViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomOptionFileViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_option_file_view, root, attachToRoot, component);
  }

  @NonNull
  public static CustomOptionFileViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomOptionFileViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomOptionFileViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_option_file_view, null, false, component);
  }

  public static CustomOptionFileViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CustomOptionFileViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CustomOptionFileViewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.custom_option_file_view);
  }
}
