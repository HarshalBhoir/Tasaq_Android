package webkul.opencart.mobikul.databinding;

import android.databinding.DataBindingComponent;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;

public abstract class ItemLinksDownloadableProductBinding extends ViewDataBinding {
  @NonNull
  public final CheckBox eachLinkCheckBox;

  @NonNull
  public final TextView sampleTV;

  protected ItemLinksDownloadableProductBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, CheckBox eachLinkCheckBox, TextView sampleTV) {
    super(_bindingComponent, _root, _localFieldCount);
    this.eachLinkCheckBox = eachLinkCheckBox;
    this.sampleTV = sampleTV;
  }

  @NonNull
  public static ItemLinksDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemLinksDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemLinksDownloadableProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_links_downloadable_product, root, attachToRoot, component);
  }

  @NonNull
  public static ItemLinksDownloadableProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static ItemLinksDownloadableProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<ItemLinksDownloadableProductBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.item_links_downloadable_product, null, false, component);
  }

  public static ItemLinksDownloadableProductBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static ItemLinksDownloadableProductBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (ItemLinksDownloadableProductBinding)bind(component, view, webkul.opencart.mobikul.R.layout.item_links_downloadable_product);
  }
}
