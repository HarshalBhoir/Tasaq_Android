package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.button.MaterialButton;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;

public abstract class MobikulDialogBinding extends ViewDataBinding {
  @NonNull
  public final MaterialButton cancel;

  @NonNull
  public final TextView loading;

  @NonNull
  public final MaterialButton ok;

  @NonNull
  public final ProgressBar progressWheel;

  protected MobikulDialogBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, MaterialButton cancel, TextView loading, MaterialButton ok,
      ProgressBar progressWheel) {
    super(_bindingComponent, _root, _localFieldCount);
    this.cancel = cancel;
    this.loading = loading;
    this.ok = ok;
    this.progressWheel = progressWheel;
  }

  @NonNull
  public static MobikulDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MobikulDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MobikulDialogBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.mobikul_dialog, root, attachToRoot, component);
  }

  @NonNull
  public static MobikulDialogBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static MobikulDialogBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<MobikulDialogBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.mobikul_dialog, null, false, component);
  }

  public static MobikulDialogBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static MobikulDialogBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (MobikulDialogBinding)bind(component, view, webkul.opencart.mobikul.R.layout.mobikul_dialog);
  }
}
