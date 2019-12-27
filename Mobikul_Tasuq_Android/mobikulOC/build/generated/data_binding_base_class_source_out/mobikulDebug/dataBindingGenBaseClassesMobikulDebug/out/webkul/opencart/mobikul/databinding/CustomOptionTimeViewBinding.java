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
import android.widget.EditText;
import android.widget.ImageView;

public abstract class CustomOptionTimeViewBinding extends ViewDataBinding {
  @NonNull
  public final ImageView addDateImg;

  @NonNull
  public final Button resetBtn;

  @NonNull
  public final EditText timeET;

  protected CustomOptionTimeViewBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, ImageView addDateImg, Button resetBtn, EditText timeET) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addDateImg = addDateImg;
    this.resetBtn = resetBtn;
    this.timeET = timeET;
  }

  @NonNull
  public static CustomOptionTimeViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomOptionTimeViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomOptionTimeViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_option_time_view, root, attachToRoot, component);
  }

  @NonNull
  public static CustomOptionTimeViewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CustomOptionTimeViewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CustomOptionTimeViewBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.custom_option_time_view, null, false, component);
  }

  public static CustomOptionTimeViewBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CustomOptionTimeViewBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CustomOptionTimeViewBinding)bind(component, view, webkul.opencart.mobikul.R.layout.custom_option_time_view);
  }
}
