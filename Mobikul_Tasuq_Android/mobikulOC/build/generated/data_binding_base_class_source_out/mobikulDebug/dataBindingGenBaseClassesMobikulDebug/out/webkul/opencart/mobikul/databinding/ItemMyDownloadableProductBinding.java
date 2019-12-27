package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.card.MaterialCardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public abstract class ItemMyDownloadableProductBinding extends ViewDataBinding {
  @NonNull
  public final TextView date;

  @NonNull
  public final ImageView downloadBtn;

  @NonNull
  public final LinearLayout innerContainer;

  @NonNull
  public final MaterialCardView myDownloadsCardView;

  @NonNull
  public final TextView orderNo;

  @NonNull
  public final TextView size;

  @NonNull
  public final TextView title;

  protected ItemMyDownloadableProductBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView date, ImageView downloadBtn, LinearLayout innerContainer,
      MaterialCardView myDownloadsCardView, TextView orderNo, TextView size, TextView title) {
    super(_bindingComponent, _root, _localFieldCount);
    this.date = date;
    this.downloadBtn = downloadBtn;
    this.innerContainer = innerContainer;
    this.myDownloadsCardView = myDownloadsCardView;
    this.orderNo = orderNo;
    this.size = size;
    this.title = title;
  }

  @NonNull
  public static ItemMyDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMyDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMyDownloadableProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_my_downloadable_product, root, attachToRoot, component);
  }

  @NonNull
  public static ItemMyDownloadableProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemMyDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemMyDownloadableProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_my_downloadable_product, null, false, component);
  }

  public static ItemMyDownloadableProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemMyDownloadableProductBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemMyDownloadableProductBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_my_downloadable_product);
  }
}
