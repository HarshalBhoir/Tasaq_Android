package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

public abstract class CheckoutBottomSheetBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout addressLayout;

  @NonNull
  public final LinearLayout bottomLayout;

  protected CheckoutBottomSheetBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout addressLayout, LinearLayout bottomLayout) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addressLayout = addressLayout;
    this.bottomLayout = bottomLayout;
  }

  @NonNull
  public static CheckoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CheckoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CheckoutBottomSheetBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.checkout_bottom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static CheckoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static CheckoutBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<CheckoutBottomSheetBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.checkout_bottom_sheet, null, false, component);
  }

  public static CheckoutBottomSheetBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static CheckoutBottomSheetBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (CheckoutBottomSheetBinding)bind(component, view, webkul.opencart.mobikul.R.layout.checkout_bottom_sheet);
  }
}
