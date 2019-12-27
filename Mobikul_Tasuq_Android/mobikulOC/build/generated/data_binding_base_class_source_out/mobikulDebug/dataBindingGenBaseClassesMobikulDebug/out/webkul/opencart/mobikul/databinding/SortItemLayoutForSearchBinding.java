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
import android.widget.RadioButton;
import android.widget.TextView;

public abstract class SortItemLayoutForSearchBinding extends ViewDataBinding {
  @NonNull
  public final TextView label;

  @NonNull
  public final LinearLayout llParent;

  @NonNull
  public final RadioButton radioButton;

  protected SortItemLayoutForSearchBinding(DataBindingComponent _bindingComponent, View _root,
      int _localFieldCount, TextView label, LinearLayout llParent, RadioButton radioButton) {
    super(_bindingComponent, _root, _localFieldCount);
    this.label = label;
    this.llParent = llParent;
    this.radioButton = radioButton;
  }

  @NonNull
  public static SortItemLayoutForSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SortItemLayoutForSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SortItemLayoutForSearchBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.sort_item_layout_for_search, root, attachToRoot, component);
  }

  @NonNull
  public static SortItemLayoutForSearchBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  @NonNull
  public static SortItemLayoutForSearchBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable DataBindingComponent component) {
    return DataBindingUtil.<SortItemLayoutForSearchBinding>inflate(inflater, webkul.opencart.mobikul.R.layout.sort_item_layout_for_search, null, false, component);
  }

  public static SortItemLayoutForSearchBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  public static SortItemLayoutForSearchBinding bind(@NonNull View view,
      @Nullable DataBindingComponent component) {
    return (SortItemLayoutForSearchBinding)bind(component, view, webkul.opencart.mobikul.R.layout.sort_item_layout_for_search);
  }
}
