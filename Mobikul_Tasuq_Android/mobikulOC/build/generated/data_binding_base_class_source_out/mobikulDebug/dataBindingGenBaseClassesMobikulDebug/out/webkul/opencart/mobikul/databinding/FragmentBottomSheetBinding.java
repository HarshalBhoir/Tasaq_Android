package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

public abstract class FragmentBottomSheetBinding extends ViewDataBinding {
  @NonNull
  public final TextView errorTv;

  @NonNull
  public final Toolbar toolbar;

  @NonNull
  public final WebView webView;

  protected FragmentBottomSheetBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView errorTv, Toolbar toolbar, WebView webView) {
    super(_bindingComponent, _root, _localFieldCount);
    this.errorTv = errorTv;
    this.toolbar = toolbar;
    this.webView = webView;
  }

  @NonNull
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentBottomSheetBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_bottom_sheet, root, attachToRoot, component);
  }

  @NonNull
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static FragmentBottomSheetBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<FragmentBottomSheetBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.fragment_bottom_sheet, null, false, component);
  }

  public static FragmentBottomSheetBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static FragmentBottomSheetBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (FragmentBottomSheetBinding)bind(component, view, webkul.opencart.mobikul.R.layout.fragment_bottom_sheet);
  }
}
