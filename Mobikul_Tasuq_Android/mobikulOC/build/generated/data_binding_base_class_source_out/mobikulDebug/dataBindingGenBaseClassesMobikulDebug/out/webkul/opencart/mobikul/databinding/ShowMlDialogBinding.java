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
import android.widget.TextView;

public abstract class ShowMlDialogBinding extends ViewDataBinding {
  @NonNull
  public final Button cancel;

  @NonNull
  public final TextView productDetect;

  @NonNull
  public final TextView textDetect;

  protected ShowMlDialogBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, Button cancel, TextView productDetect, TextView textDetect) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cancel = cancel;
    this.productDetect = productDetect;
    this.textDetect = textDetect;
  }

  @NonNull
  public static ShowMlDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ShowMlDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ShowMlDialogBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.show_ml_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static ShowMlDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ShowMlDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ShowMlDialogBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.show_ml_dialog, null, false, component);
  }

  public static ShowMlDialogBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ShowMlDialogBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ShowMlDialogBinding)bind(component, view, webkul.opencart.mobikul.R.layout.show_ml_dialog);
  }
}
