package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.AppBarLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

public abstract class LayoutProductDescElvBinding extends ViewDataBinding {
  @NonNull
  public final LinearLayout addToCartLL;

  @NonNull
  public final Button addTocartButton;

  @NonNull
  public final AppBarLayout appbar;

  @NonNull
  public final LinearLayout priceLL;

  @NonNull
  public final TextView priceMarker;

  @NonNull
  public final TextView productPrice;

  @NonNull
  public final EditText productQty;

  @NonNull
  public final TextView specialProductPrice;

  @NonNull
  public final View toolbar;

  @NonNull
  public final ProgressBar viewProductProgressBar;

  protected LayoutProductDescElvBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, LinearLayout addToCartLL, Button addTocartButton, AppBarLayout appbar,
      LinearLayout priceLL, TextView priceMarker, TextView productPrice, EditText productQty,
      TextView specialProductPrice, View toolbar, ProgressBar viewProductProgressBar) {
    super(_bindingComponent, _root, _localFieldCount);
    this.addToCartLL = addToCartLL;
    this.addTocartButton = addTocartButton;
    this.appbar = appbar;
    this.priceLL = priceLL;
    this.priceMarker = priceMarker;
    this.productPrice = productPrice;
    this.productQty = productQty;
    this.specialProductPrice = specialProductPrice;
    this.toolbar = toolbar;
    this.viewProductProgressBar = viewProductProgressBar;
  }

  @NonNull
  public static LayoutProductDescElvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutProductDescElvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutProductDescElvBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.layout_product_desc_elv, root, attachToRoot, component);
  }

  @NonNull
  public static LayoutProductDescElvBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static LayoutProductDescElvBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<LayoutProductDescElvBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.layout_product_desc_elv, null, false, component);
  }

  public static LayoutProductDescElvBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static LayoutProductDescElvBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (LayoutProductDescElvBinding)bind(component, view, webkul.opencart.mobikul.R.layout.layout_product_desc_elv);
  }
}
